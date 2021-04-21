parser grammar YalParser;

options { tokenVocab = YalLexer; }

@header {
package generated;
}

program
   : shebangLine? NL* fileAnnotation* packageHeader importHeader* (statement semis?)* EOF
    ;

fileAnnotation
    : AT_FILE NL* COLON NL* (LSQUARE unescapedAnnotation+ RSQUARE | unescapedAnnotation) NL*
    ;

packageHeader
    : (PACKAGE identifier semi?)?
    ;

importHeader
    : IMPORT identifier (DOT MULT | importAlias)? semi?
    ;

importAlias
    : AS simpleIdentifier
    ;

classDeclaration
    : modifiers? (CLASS | (FUN NL*)? INTERFACE) 
    NL* simpleIdentifier
    (NL* typeParameters)? (NL* primaryConstructor)?
    (NL* COLON NL* delegationSpecifiers)?
    (NL* typeConstraints)?
    (NL* classBody | NL* enumClassBody)?
    ;

primaryConstructor
    : (modifiers? CONSTRUCTOR NL*)? classParameters
    ;

classParameters
    : LPAREN NL* (classParameter (NL* COMMA NL* classParameter)*)? NL* RPAREN
    ;

classParameter
    : modifiers? NL* simpleIdentifier COLON NL* type_ (NL* ASSIGNMENT NL* expression)?
    ;

delegationSpecifiers
    : annotatedDelegationSpecifier (NL* COMMA NL* annotatedDelegationSpecifier)*
    ;

annotatedDelegationSpecifier
    : annotation* NL* delegationSpecifier
    ;

delegationSpecifier
    : constructorInvocation
    | explicitDelegation
    | userType
    | functionType
    ;

constructorInvocation
    : userType valueArguments
    ;

explicitDelegation
    : (userType | functionType) NL* BY NL* expression
    ;

classBody
    : LCURL NL* classMemberDeclarations NL* RCURL
    ;

classMemberDeclarations
    : (classMemberDeclaration semis?)*
    ;

classMemberDeclaration
    : declaration
    | companionObject
    | anonymousInitializer
    | secondaryConstructor
    ;

anonymousInitializer
    : INIT NL* block
    ;

secondaryConstructor
    : modifiers? CONSTRUCTOR NL* functionValueParameters (NL* COLON NL* constructorDelegationCall)? NL* block?
    ;

constructorDelegationCall
    : THIS NL* valueArguments
    | SUPER NL* valueArguments
    ;

enumClassBody
    : LCURL NL* enumEntries? (NL* SEMICOLON NL* classMemberDeclarations)? NL* RCURL
    ;

enumEntries
    : enumEntry (NL* COMMA NL* enumEntry)* NL* COMMA?
    ;

enumEntry
    : (modifiers NL*)? simpleIdentifier (NL* valueArguments)? (NL* classBody)?
    ;

functionDeclaration
    : modifiers?
    (NL* typeParameters)? (NL* receiverType NL* DOT)? NL* simpleIdentifier
    NL* functionValueParameters
    (NL* COLON NL* type_)?
    (NL* typeConstraints)?
    (NL* functionBody)?
    ;

functionValueParameters
    : LPAREN NL* (functionValueParameter (NL* COMMA NL* functionValueParameter)*)? NL* RPAREN
    ;

functionValueParameter
    : modifiers? parameter (NL* ASSIGNMENT NL* expression)?
    ;

parameter
    : simpleIdentifier NL* COLON NL* type_
    ;

setterParameter
    : simpleIdentifier NL* (COLON NL* type_)?
    ;

functionBody
    : block
    | ASSIGNMENT NL* expression
    ;

objectDeclaration
    : modifiers? OBJECT
    NL* simpleIdentifier
    (NL* COLON NL* delegationSpecifiers)?
    (NL* classBody)?
    ;

companionObject
    : modifiers? COMPANION NL* OBJECT
    (NL* simpleIdentifier)?
    (NL* COLON NL* delegationSpecifiers)?
    (NL* classBody)?
    ;

propertyDeclaration
    : modifiers? 
    (NL* typeParameters)?
    (NL* receiverType NL* DOT)?
    (NL* (multiVariableDeclaration | variableDeclaration))
    (NL* typeConstraints)?
    (NL* (ASSIGNMENT NL* expression | propertyDelegate))?
    (NL+ SEMICOLON)? NL* (getter? (NL* semi? setter)? | setter? (NL* semi? getter)?)
    /*
        XXX: actually, it's not that simple. You can put semi only on the same line as getter, but any other semicolons
        between property and getter are forbidden
        Is this a bug in kotlin parser? Who knows.
    */
    ;

multiVariableDeclaration
    : LPAREN NL* variableDeclaration (NL* COMMA NL* variableDeclaration)* NL* RPAREN
    ;

variableDeclaration
    : annotation* NL* simpleIdentifier (NL* COLON NL* type_)?
    ;

propertyDelegate
    : BY NL* expression
    ;

getter
    : modifiers? GET
    | modifiers? GET NL* LPAREN NL* RPAREN (NL* COLON NL* type_)? NL* functionBody
    ;

setter
    : modifiers? SET
    | modifiers? SET NL* LPAREN (annotation | parameterModifier)* setterParameter RPAREN (NL* COLON NL* type_)? NL* functionBody
    ;

typeAlias
    : modifiers? TYPE_ALIAS NL* simpleIdentifier (NL* typeParameters)? NL* ASSIGNMENT NL* type_
    ;

typeParameters
    : LANGLE NL* typeParameter (NL* COMMA NL* typeParameter)* NL* RANGLE
    ;

typeParameter
    : typeParameterModifiers? NL* simpleIdentifier (NL* COLON NL* type_)?
    ;

typeParameterModifiers
    : typeParameterModifier+
    ;

typeParameterModifier
    : reificationModifier NL*
    | varianceModifier NL*
    | annotation
    ;

type_
    : typeModifiers?
    ( functionType
    | nullableType
    | typeReference
    | parenthesizedType)
    ;

typeModifiers
    : typeModifier+
    ;

typeModifier
    : annotation | SUSPEND NL*
    ;

parenthesizedType
    : LPAREN NL* type_ NL* RPAREN
    ;

nullableType
    : (typeReference | parenthesizedType) NL* quest+
    ;

typeReference
    : userType
    | DYNAMIC // do we need a separate dynamic support here?
    ;

functionType
    : (receiverType NL* DOT NL*)? functionTypeParameters NL* ARROW NL* type_
    ;

receiverType
    : typeModifiers?
    ( parenthesizedType
    | nullableType
    | typeReference)
    ;

userType
    : simpleUserType (NL* DOT NL* simpleUserType)*
    ;

parenthesizedUserType
    : LPAREN NL* userType NL* RPAREN
    | LPAREN NL* parenthesizedUserType NL* RPAREN
    ;

simpleUserType
    : simpleIdentifier (NL* typeArguments)?
    ;

functionTypeParameters
    : LPAREN NL* (parameter | type_)? (NL* COMMA NL* (parameter | type_))* NL* RPAREN
    ;

typeConstraints
    : 'where' NL* typeConstraint (NL* COMMA NL* typeConstraint)*
    ;

typeConstraint
    : annotation* simpleIdentifier NL* COLON NL* type_
    ;

block
    : LCURL NL* statements NL* RCURL
    ;

statements
    : (statement (semis statement)* semis?)?
    ;

statement
    : (label | annotation)*
    ( declaration
    | assignment
    | loopStatement
    | expression)
    ;

declaration
    : classDeclaration
    | objectDeclaration
    | typeAlias 
    | functionDeclaration
    | propertyDeclaration
    ;

assignment
    : directlyAssignableExpression ASSIGNMENT NL* expression
    | assignableExpression assignmentAndOperator NL* expression
    ;

expression
    : disjunction
    ;

disjunction
    : conjunction (NL* disjunctionOperator NL* conjunction)*
    ;

conjunction
    : equality (NL* conjunctionOperator NL* equality)*
    ;

equality
    : comparison (/* NO NL! */ equalityOperator NL* comparison)*
    ;

comparison
    : infixOperation (/* NO NL! */ comparisonOperator NL* infixOperation)?
    ;

infixOperation
    : elvisExpression (/* NO NL! */ inOperator NL* elvisExpression | isOperator NL* type_)*
    ;

elvisExpression
    : infixFunctionCall (NL* elvis NL* infixFunctionCall)*
    ;

infixFunctionCall
    : rangeExpression (/* NO NL! */ simpleIdentifier NL* rangeExpression)*
    ;

rangeExpression
    : additiveExpression (/* NO NL! */ RANGE NL* additiveExpression)*
    ;

additiveExpression
    : multiplicativeExpression (/* NO NL! */ additiveOperator NL* multiplicativeExpression)*
    ;

multiplicativeExpression
    : asExpression (/* NO NL! */ multiplicativeOperator NL* asExpression)*
    ;

asExpression
    : prefixUnaryExpression (NL* asOperator NL* type_)?
    ;

prefixUnaryExpression
    : unaryPrefix* postfixUnaryExpression
    ;

unaryPrefix
    : annotation
    | label
    | prefixUnaryOperator NL*
    ;

postfixUnaryExpression
    : complexExpression postfixUnarySuffix*
    ;

complexExpression
	: SUB? (primaryExpression I | I primaryExpression) NL*		// pure imaginary
	| primaryExpression NL* (ADD|SUB) I NL* primaryExpression?	// std complex
	| primaryExpression? NL* E POW NL* primaryExpression 		// polar complex
	| primaryExpression? NL* CIS NL* primaryExpression			// cis complex
	| primaryExpression
	;

postfixUnarySuffix
    : postfixUnaryOperator
    | callSuffix
    | typeArguments
    | indexingSuffix
    | navigationSuffix
    ;

directlyAssignableExpression
    : postfixUnaryExpression assignableSuffix
    | simpleIdentifier
    ;

assignableExpression
    : prefixUnaryExpression
    ;

assignableSuffix
    : typeArguments
    | indexingSuffix
    | navigationSuffix
    ;

indexingSuffix
    : LSQUARE NL* expression (NL* COMMA NL* expression)* NL* RSQUARE
    | listSplicing
    ;

navigationSuffix
    : NL* memberAccessOperator NL* (simpleIdentifier | parenthesizedExpression | CLASS)
    ;

callSuffix
    : typeArguments? valueArguments			// function call
    | typeArguments? valueArguments? overridenMethods
    ;

overridenMethods
	: LCURL NL*  NL* RCURL
	;

valueArguments
    : LPAREN NL* RPAREN
    | LPAREN NL* valueArgument (NL* (COMMA|SEMICOLON) NL* valueArgument)* NL* RPAREN
    ;

valueArgument
    : annotation? NL* (simpleIdentifier NL* ASSIGNMENT NL*)? MULT? NL* expression
    ;

annotatedLambda
    : annotation* label? NL* lambdaLiteral
    ;
    
typeArguments
    : LANGLE NL* typeProjection (NL* COMMA NL* typeProjection)* NL* RANGLE
    ;

typeProjection
    : typeProjectionModifiers? type_ | MULT
    ;

typeProjectionModifiers
    : typeProjectionModifier+
    ;

typeProjectionModifier
    : varianceModifier NL*
    | annotation
    ;

primaryExpression
    : literalConstant
    | stringLiteral
    | functionLiteral
    | callableReference
    | objectLiteral
    | collectionLiteral
    | thisExpression
    | superExpression
    | ifExpression
    | whenExpression
    | tryExpression
    | jumpExpression
    | simpleIdentifier
    | parenthesizedExpression
    ;

parenthesizedExpression
    : LPAREN NL* expression NL* RPAREN
    ;

collectionLiteral
    : LSQUARE NL* expression (NL* COMMA NL* expression)* NL* RSQUARE
    | LSQUARE NL* RSQUARE
    | listComprehension
    ;

listComprehension
	: LSQUARE NL* forStatement NL* RSQUARE
	;

listSplicing
	: LSQUARE NL* expression? NL* HASH NL* expression? (NL* HASH NL* expression?)? NL* RSQUARE
	;

literalConstant
    : BooleanLiteral
    | IntegerLiteral
    | HexLiteral
    | BinLiteral
    | CharacterLiteral
    | RealLiteral
    | NullLiteral
    | LongLiteral
    ;

stringLiteral
    : lineStringLiteral
    | multiLineStringLiteral
    | escapedLineStringLiteral
    | expansionLineStringLiteral
    ;

lineStringLiteral
    : QUOTE_OPEN (lineStringContent | lineStringExpression)* QUOTE_CLOSE
    ;

multiLineStringLiteral
    : M_QUOTE_OPEN (multiLineStringContent | multiLineStringExpression | MultiLineStringQuote)* M_QUOTE_CLOSE
    ;

escapedLineStringLiteral
	: AT_QUOTE_OPEN (escapedLineStringContent | escapedLineStringExpression)* AT_QUOTE_CLOSE
	;

expansionLineStringLiteral
	: EXPANSION_QUOTE_OPEN (expansionLineStringContent | expansionLineStringExpression)* EXPANSION_QUOTE_CLOSE
	;

lineStringContent
    : LineStrText
    | LineStrEscapedChar
    | LineStrRef
    ;

lineStringExpression
    : LineStrExprStart expression RCURL
    ;

multiLineStringContent
    : MultiLineStrText
    | MultiLineStringQuote
    | MultiLineStrRef
    ;

multiLineStringExpression
    : MultiLineStrExprStart NL* expression NL* RCURL
    ;

escapedLineStringContent
	: EscapedLineStrText 
	| EscapedLineStrRef
	;

escapedLineStringExpression
	: EscapedLineStrExprStart NL* expression NL* RCURL
	;

expansionLineStringContent
	: ExpansionLineStrText
	| ExpansionLineStrRef
	;
	
expansionLineStringExpression
	: ExpansionLineStrExprStart NL* expression NL* RCURL
	;

lambdaLiteral
    : LCURL NL* statements NL* RCURL
    | LCURL NL* lambdaParameters? NL* ARROW NL* statements NL* RCURL
    ;

lambdaParameters
    : lambdaParameter (NL* COMMA NL* lambdaParameter)*
    ;

lambdaParameter
    : variableDeclaration
    | multiVariableDeclaration (NL* COLON NL* type_)?
    ;

anonymousFunction
    : //'fun'
    (NL* type_ NL* DOT)?
    NL* functionValueParameters
    (NL* COLON NL* type_)?
    (NL* typeConstraints)?
    (NL* functionBody)?
    ;

functionLiteral
    : lambdaLiteral
    | anonymousFunction
    ;

objectLiteral
    : OBJECT NL* COLON NL* delegationSpecifiers (NL* classBody)?
    | OBJECT NL* classBody
    ;

thisExpression
    : THIS
    | THIS_AT
    ;

superExpression
    : SUPER (LANGLE NL* type_ NL* RANGLE)? (AT simpleIdentifier)?
    | SUPER_AT
    ;

controlStructureBody
    : block
    | statement
    ;

ifExpression
    : IF NL* LPAREN NL* expression NL* RPAREN NL* controlStructureBody (SEMICOLON? NL* ELSE NL* controlStructureBody)?
    | IF NL* LPAREN NL* expression NL* RPAREN NL* (SEMICOLON NL*)? ELSE NL* controlStructureBody
    ;

whenExpression
    : WHEN NL* (LPAREN expression RPAREN)? NL* LCURL NL* (whenEntry NL*)* NL* RCURL
    ;

whenEntry
    : whenCondition (NL* COMMA NL* whenCondition)* NL* ARROW NL* controlStructureBody semi?
    | ELSE NL* ARROW NL* controlStructureBody semi?
    ;

whenCondition
    : expression
    | rangeTest
    | typeTest
    ;

rangeTest
    : inOperator NL* expression
    ;

typeTest
    : isOperator NL* type_
    ;

tryExpression
    : TRY NL* (block | statement) ((NL* catchBlock)+ (NL* finallyBlock)? | NL* finallyBlock)
    ;

catchBlock
    : CATCH NL* LPAREN 
    	annotation* simpleIdentifier COLON NL* userType (NL* COMMA NL* userType)* RPAREN 
    	NL* (block | statement)
    ;

finallyBlock
    : FINALLY NL* (block | statement)
    ;

loopStatement
    : forStatement
    | whileStatement
    | doWhileStatement
    ;

forStatement
    : FOR NL* LPAREN (variableDeclaration | multiVariableDeclaration) IN expression RPAREN NL* controlStructureBody?
    | FOR NL* LPAREN
    	(statement (NL* COMMA NL* statement)*)? SEMICOLON NL*
    	expression? NL* SEMICOLON NL*
    	(statement (NL* COMMA NL* statement)*)? NL*
    	RPAREN NL* controlStructureBody?
    ;

whileStatement
    : WHILE NL* LPAREN expression RPAREN NL* controlStructureBody
    | WHILE NL* LPAREN expression RPAREN NL* SEMICOLON
    ;

doWhileStatement
    : DO NL* controlStructureBody? NL* WHILE NL* LPAREN expression RPAREN
    ;

jumpExpression
    : THROW NL* expression
    | (RETURN | RETURN_AT) expression?
    | CONTINUE | CONTINUE_AT
    | BREAK | BREAK_AT
    ;

callableReference // ?:: here is not an actual operator, it's just a lexer hack to avoid (?: + :) vs (? + ::) ambiguity
    : (receiverType? NL* COLONCOLON NL* (simpleIdentifier | CLASS))
    ;

conjunctionOperator
	: AND_AND 
	| AND
	;
	
disjunctionOperator
	: OR_OR
	| OR
	;

assignmentAndOperator
    : ADD_ASSIGNMENT
    | SUB_ASSIGNMENT
    | MULT_ASSIGNMENT
    | DIV_ASSIGNMENT
    | MOD_ASSIGNMENT
    | POW_ASSIGNMENT
    | AND_ASSIGNMENT
    | OR_ASSIGNMENT
    | AND_BIT_ASSIGNMENT
    | OR_BIT_ASSIGNMENT
    | XOR_ASSIGNMENT
    | LSHIFT_ASSIGNMENT
    | RSHIFT_ASSIGNMENT
    | ELVIS_ASSIGMENT
    ;

equalityOperator
    : EXCL_EQ
    | EXCL_EQEQ
    | EQEQ
    | EQEQEQ
    ;

comparisonOperator
    : LANGLE
    | RANGLE
    | LE
    | GE
    ;

inOperator
    : IN | NOT_IN
    ;

isOperator
    : IS | NOT_IS
    ;

additiveOperator
    : ADD | SUB
    ;

multiplicativeOperator
    : MULT
    | DIV
    | MOD
    | XOR
    | POW
    | LSHIFT
    | RSHIFT
    ;

asOperator
    : AS
    | AS_SAFE
    ;

prefixUnaryOperator
    : INCR
    | DECR
    | SUB
    | ADD
    | excl
    | I
    ;

postfixUnaryOperator
    : INCR
    | DECR
    | EXCL_NO_WS excl
    | I
    ;

memberAccessOperator
    : DOT | safeNav | COLONCOLON
    ;

modifiers
    : (annotation | modifier)+
    ;

modifier
    : (classModifier
    | memberModifier
    | visibilityModifier
    | functionModifier
    | propertyModifier
    | inheritanceModifier
    | parameterModifier
    | platformModifier) NL*
    ;

classModifier
    : ENUM
    | SEALED
    | ANNOTATION
    | DATA
    | INNER
    ;

memberModifier
    : OVERRIDE
    | LATEINIT
    ;

visibilityModifier
    : PUBLIC
    | PRIVATE
    | INTERNAL
    | PROTECTED
    ;

varianceModifier
    : IN
    | OUT
    ;

functionModifier
    : TAILREC
    | OPERATOR
    | INFIX
    | INLINE
    | EXTERNAL
    | SUSPEND
    ;

propertyModifier
    : CONST
    ;

inheritanceModifier
    : ABSTRACT
    | FINAL
    | OPEN
    ;

parameterModifier
    : VARARG
    | NOINLINE
    | CROSSINLINE
    ;

reificationModifier
    : REIFIED
    ;

platformModifier
    : EXPECT
    | ACTUAL
    ;

label
    : IdentifierAt NL*
    ;

annotation
    : (singleAnnotation | multiAnnotation) NL*
    ;

singleAnnotation
    : annotationUseSiteTarget NL* COLON NL* unescapedAnnotation
    | NL* '@' unescapedAnnotation
    ;

multiAnnotation
    : annotationUseSiteTarget NL* COLON NL* LSQUARE unescapedAnnotation+ RSQUARE
    | '@' LSQUARE unescapedAnnotation+ RSQUARE
    ;

annotationUseSiteTarget
    : AT_FIELD
    | AT_PROPERTY
    | AT_GET
    | AT_SET
    | AT_RECEIVER
    | AT_PARAM
    | AT_SETPARAM
    | AT_DELEGATE
    ;

unescapedAnnotation
    : constructorInvocation
    | userType
    ;

simpleIdentifier
    : Identifier
    | ABSTRACT
    | ANNOTATION
    | BY
    | CATCH
    | COMPANION
    | CONSTRUCTOR
    | CROSSINLINE
    | DATA
    | DYNAMIC
    | ENUM
    | EXTERNAL
    | FINAL
    | FINALLY
    | GET
    | IMPORT
    | INFIX
    | INIT
    | INLINE
    | INNER
    | INTERNAL
    | LATEINIT
    | NOINLINE
    | OPEN
    | OPERATOR
    | OUT
    | OVERRIDE
    | PRIVATE
    | PROTECTED
    | PUBLIC
    | REIFIED
    | SEALED
    | TAILREC
    | SET
    | VARARG
    | WHERE
    | EXPECT
    | ACTUAL
    | CONST
    | SUSPEND
    ;

identifier
    : simpleIdentifier (NL* DOT simpleIdentifier)*
    ;

shebangLine
    : ShebangLine NL+
    ;

quest
    : QUEST_NO_WS
    | QUEST_WS
    ;

elvis	// kotlin's null coalescing operator
    : QUEST_NO_WS COLON
    ;

safeNav
    : QUEST_NO_WS DOT
    ;

excl
    : EXCL_NO_WS
    | EXCL_WS
    ;

semi
    : (SEMICOLON | NL) NL* // actually, it's WS or comment between SEMICOLON, here it's handled in lexer (see ;; token)
    | EOF;
semis // writing this as "semi+" sends antlr into infinite loop or smth
    : (SEMICOLON | NL)+
    | EOF
    ;