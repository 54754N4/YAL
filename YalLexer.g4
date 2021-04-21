lexer grammar YalLexer;

import Unicodes;

ShebangLine
    : '#!' ~[\r\n]*
    ;

DelimitedComment
    : '/*' ( DelimitedComment | . )*? '*/'
      -> channel(HIDDEN)
    ;

LineComment
    : '//' ~[\r\n]*
      -> channel(HIDDEN)
    ;

WS
    : [\u0020\u0009\u000C]
      -> channel(HIDDEN)
    ;

NL: '\n' | '\r' '\n'? ;

fragment Hidden: DelimitedComment | LineComment | WS;

//SEPARATORS & OPERATIONS

RESERVED: '...' ;
DOT: '.' ;
COMMA: ',' ;
LPAREN: '(' -> pushMode(Inside);
RPAREN: ')' -> popMode;
LSQUARE: '[' -> pushMode(Inside);
RSQUARE: ']' -> popMode;
LCURL: '{' -> pushMode(DEFAULT_MODE);
RCURL: '}' -> popMode;
POW: '**' ; 
MULT: '*' ;
MOD: '%' ;
DIV: '/' ;
ADD: '+' ;
SUB: '-' ;
INCR: '++' ;
DECR: '--' ;
AND_AND: '&&' ;
AND: '&' ;
OR_OR: '||' ;
OR: '|' ;
XOR: '^' ;
LSHIFT : '<<' ;
RSHIFT : '>>' ;
EXCL_WS: '!' Hidden;
EXCL_NO_WS: '!';
COLON: ':' ;
SEMICOLON: ';' ;
ASSIGNMENT: '=' ;
ADD_ASSIGNMENT: '+=' ;
SUB_ASSIGNMENT: '-=' ;
MULT_ASSIGNMENT: '*=' ;
DIV_ASSIGNMENT: '/=' ;
MOD_ASSIGNMENT: '%=' ;
POW_ASSIGNMENT: '**=' ;
AND_ASSIGNMENT: '&&=' ;
OR_ASSIGNMENT: '||=' ;
AND_BIT_ASSIGNMENT : '&=' ;
OR_BIT_ASSIGNMENT : '|=' ;
XOR_ASSIGNMENT: '^=' ;
LSHIFT_ASSIGNMENT: '<<=' ;
RSHIFT_ASSIGNMENT: '>>=' ; 
ELVIS_ASSIGMENT : '?:=' ;  
ARROW: '->' ;
DOUBLE_ARROW: '=>' ;
RANGE: '..' ;
COLONCOLON: '::' ;
DOUBLE_SEMICOLON: ';;' ;
HASH: '#' ;
AT: '@' ;
I: 'I' ;
E: [eE] ;
CIS: 'cis' ;

QUEST_NO_WS: '?' ;
QUEST_WS: '?' Hidden ;
LANGLE: '<' ;
RANGLE: '>' ;
LE: '<=' ;
GE: '>=' ;
EXCL_EQ: '!=' ;
EXCL_EQEQ: '!==' ;
AS_SAFE: 'as?' ;
EQEQ: '==' ;
EQEQEQ: '===' ;
SINGLE_QUOTE: '\'' ;

//KEYWORDS

RETURN_AT: 'return@' Identifier ;
CONTINUE_AT: 'continue@' Identifier ;
BREAK_AT: 'break@' Identifier ;

THIS_AT: 'this@' Identifier ;
SUPER_AT: 'super@' Identifier ;

PACKAGE: 'package' ;
IMPORT: 'import' ;
CLASS: 'class' ;
INTERFACE: 'interface' ;
FUN: 'fun' ;
OBJECT: 'object' ;
TYPE_ALIAS: 'alias' ;
CONSTRUCTOR: 'constructor' ;
BY: 'by' ;
COMPANION: 'companion' ;
INIT: 'init'  ;
THIS: 'this' ;
SUPER: 'super' ;
TYPEOF: 'typeof' ;
WHERE: 'where' ;
IF: 'if' ;
ELSE: 'else' ;
WHEN: 'when' ;
TRY: 'try' ;
CATCH: 'catch' ;
FINALLY: 'finally' ;
FOR: 'for' ;
DO: 'do' ;
WHILE: 'while' ;
THROW: 'throw' ;
RETURN: 'return' ;
CONTINUE: 'continue' ;
BREAK: 'break' ;
AS: 'as' ;
IS: 'is' ;
IN: 'in' ;
NOT_IS: '!is' (Hidden | NL) ;
NOT_IN: '!in' (Hidden | NL) ;
OUT: 'out' ;
GET: 'get' ;
SET: 'set' ;
DYNAMIC: 'dynamic' ;
AT_FILE: '@file' ;
AT_FIELD: '@field' ;
AT_PROPERTY: '@property' ;
AT_GET: '@get' ;
AT_SET: '@set' ;
AT_RECEIVER: '@receiver' ;
AT_PARAM: '@param' ;
AT_SETPARAM: '@setparam' ;
AT_DELEGATE: '@delegate' ;

//MODIFIERS

PUBLIC: 'public' ;
PRIVATE: 'private' ;
PROTECTED: 'protected' ;
INTERNAL: 'internal' ;
ENUM: 'enum' ;
SEALED: 'sealed' ;
ANNOTATION: 'annotation' ;
DATA: 'data' ;
INNER: 'inner' ;
TAILREC: 'tailrec' ;
OPERATOR: 'operator' ;
INLINE: 'inline' ;
INFIX: 'infix' ;
EXTERNAL: 'external' ;
SUSPEND: 'suspend' ;
OVERRIDE: 'override' ;
ABSTRACT: 'abstract' ;
FINAL: 'final' ;
OPEN: 'open' ;
CONST: 'const' ;
LATEINIT: 'lateinit' ;
VARARG: 'vararg' ;
NOINLINE: 'noinline' ;
CROSSINLINE: 'crossinline' ;
REIFIED: 'reified' ;

EXPECT: 'expect' ;
ACTUAL: 'actual' ;

QUOTE_OPEN: '"' -> pushMode(LineString) ;
M_QUOTE_OPEN: 'm"' -> pushMode(MultiLineString) ;
AT_QUOTE_OPEN: '@"' -> pushMode(EscapedLineString) ;
EXPANSION_QUOTE_OPEN: 'b"' -> pushMode(ExpansionLineString) ;

RealLiteral
    : FloatLiteral
    | DoubleLiteral
    ;

FloatLiteral
    : DoubleLiteral [fF]
    | DecDigits [fF]
    ;

fragment DecDigitOrSeparator: DecDigit | '_';
fragment DecDigits
    : DecDigit DecDigitOrSeparator* DecDigit
    | DecDigit
    ;
fragment DoubleExponent: [eE] [+-]? DecDigits;

DoubleLiteral
    : DecDigits? '.' DecDigits DoubleExponent?
    | DecDigits DoubleExponent
    ;

LongLiteral
    : (IntegerLiteral | HexLiteral | BinLiteral) [lL]
    ;

IntegerLiteral
    : DecDigitNoZero DecDigitOrSeparator* DecDigit
    | DecDigit // including '0'
    ;

fragment UnicodeDigit
    : UNICODE_CLASS_ND
    ;

fragment DecDigit
    : '0'..'9'
    ;

fragment DecDigitNoZero
    : '1'..'9'
    ;

fragment HexDigitOrSeparator
    : HexDigit | '_'
    ;

HexLiteral
    : '0' [xX] HexDigit HexDigitOrSeparator* HexDigit
    | '0' [xX] HexDigit
    ;

fragment HexDigit
    : [0-9a-fA-F]
    ;

fragment BinDigitOrSeparator
    : BinDigit | '_'
    ;

BinLiteral
    : '0' [bB] BinDigit BinDigitOrSeparator* BinDigit
    | '0' [bB] BinDigit
    ;

fragment BinDigit
    : [01]
    ;

BooleanLiteral
    : 'true'
    | 'false'
    ;

NullLiteral
    : 'null'
    ;

Identifier
    : (Letter | '_') (Letter | '_' | UnicodeDigit)*
    | '`' ~('\r' | '\n' | '`' | '[' | ']' | '<' | '>')+ '`'
    ;

fragment IdentifierOrSoftKey
    : Identifier //soft keywords:
    | ABSTRACT
    | ANNOTATION
    | BY
    | CATCH
    | COMPANION
    | CONSTRUCTOR
    | TYPE_ALIAS
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
    | I
    | E
    | CIS
    //strong keywords
    | CONST
    | SUSPEND
    ;

IdentifierAt
    : IdentifierOrSoftKey '@'
    ;

FieldIdentifier // why is this even needed?
    : '$' IdentifierOrSoftKey
    ;

CharacterLiteral
    : '\'' (EscapeSeq | ~[\n\r'\\]) '\''
    ;

fragment EscapeSeq
    : UniCharacterLiteral
    | EscapedIdentifier
    ;

fragment UniCharacterLiteral
    : '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

fragment EscapedIdentifier
    : '\\' ('t' | 'b' | 'r' | 'n' | '\'' | '"' | '\\' | '$')
    ;

fragment Letter
    : UNICODE_CLASS_LL
    | UNICODE_CLASS_LM
    | UNICODE_CLASS_LO
    | UNICODE_CLASS_LT
    | UNICODE_CLASS_LU
    | UNICODE_CLASS_NL
    ;

ErrorCharacter: .;

mode Inside ;

Inside_RPAREN: RPAREN -> popMode, type(RPAREN) ;
Inside_RSQUARE: RSQUARE -> popMode, type(RSQUARE);
Inside_LPAREN: LPAREN -> pushMode(Inside), type(LPAREN) ;
Inside_LSQUARE: LSQUARE -> pushMode(Inside), type(LSQUARE) ;
Inside_LCURL: LCURL -> pushMode(DEFAULT_MODE), type(LCURL) ;
Inside_RCURL: RCURL -> popMode, type(RCURL) ;

Inside_DOT: DOT -> type(DOT) ;
Inside_COMMA: COMMA  -> type(COMMA) ;
Inside_MULT: MULT -> type(MULT) ;
Inside_POW: POW  -> type(POW) ;
Inside_MOD: MOD  -> type(MOD) ;
Inside_DIV: DIV -> type(DIV) ;
Inside_ADD: ADD  -> type(ADD) ;
Inside_SUB: SUB  -> type(SUB) ;
Inside_INCR: INCR  -> type(INCR) ;
Inside_DECR: DECR  -> type(DECR) ;
Inside_AND_AND: AND_AND  -> type(AND_AND) ;
Inside_AND: AND  -> type(AND) ;
Inside_XOR: XOR  -> type(XOR) ;
Inside_OR_OR: OR_OR  -> type(OR_OR) ;
Inside_OR: OR -> type(OR) ;
Inside_LSHIFT : LSHIFT -> type(LSHIFT) ;
Inside_RSHIFT : RSHIFT -> type(RSHIFT) ;
Inside_EXCL_WS: '!' (Hidden|NL) -> type(EXCL_WS) ;
Inside_EXCL_NO_WS: EXCL_NO_WS  -> type(EXCL_NO_WS) ;
Inside_COLON: COLON  -> type(COLON) ;
Inside_SEMICOLON: SEMICOLON  -> type(SEMICOLON) ;
Inside_ASSIGNMENT: ASSIGNMENT  -> type(ASSIGNMENT) ;
Inside_AND_ASSIGNMENT: AND_ASSIGNMENT -> type(AND_ASSIGNMENT) ;
Inside_OR_ASSIGNMENT: OR_ASSIGNMENT -> type(OR_ASSIGNMENT) ;
Inside_XOR_ASSIGNMENT: XOR_ASSIGNMENT -> type(XOR_ASSIGNMENT) ;
Inside_LSHIFT_ASSIGNMENT: LSHIFT_ASSIGNMENT -> type(LSHIFT_ASSIGNMENT) ;
Inside_RSHIFT_ASSIGNMENT: RSHIFT_ASSIGNMENT -> type(RSHIFT_ASSIGNMENT) ;
Inside_ADD_ASSIGNMENT: ADD_ASSIGNMENT  -> type(ADD_ASSIGNMENT) ;
Inside_SUB_ASSIGNMENT: SUB_ASSIGNMENT  -> type(SUB_ASSIGNMENT) ;
Inside_MULT_ASSIGNMENT: MULT_ASSIGNMENT  -> type(MULT_ASSIGNMENT) ;
Inside_DIV_ASSIGNMENT: DIV_ASSIGNMENT  -> type(DIV_ASSIGNMENT) ;
Inside_MOD_ASSIGNMENT: MOD_ASSIGNMENT  -> type(MOD_ASSIGNMENT) ;
Inside_ELVIS_ASSIGMENT: ELVIS_ASSIGMENT -> type(ELVIS_ASSIGMENT) ;
Inside_ARROW: ARROW  -> type(ARROW) ;
Inside_DOUBLE_ARROW: DOUBLE_ARROW  -> type(DOUBLE_ARROW) ;
Inside_RANGE: RANGE  -> type(RANGE) ;
Inside_RESERVED: RESERVED -> type(RESERVED) ;
Inside_COLONCOLON: COLONCOLON  -> type(COLONCOLON) ;
Inside_DOUBLE_SEMICOLON: DOUBLE_SEMICOLON  -> type(DOUBLE_SEMICOLON) ;
Inside_HASH: HASH  -> type(HASH) ;
Inside_AT: AT  -> type(AT) ;
Inside_QUEST_WS: '?' (Hidden | NL) -> type(QUEST_WS) ;
Inside_QUEST_NO_WS: QUEST_NO_WS -> type(QUEST_NO_WS) ;
Inside_LANGLE: LANGLE  -> type(LANGLE) ;
Inside_RANGLE: RANGLE  -> type(RANGLE) ;
Inside_LE: LE  -> type(LE) ;
Inside_GE: GE  -> type(GE) ;
Inside_EXCL_EQ: EXCL_EQ  -> type(EXCL_EQ) ;
Inside_EXCL_EQEQ: EXCL_EQEQ  -> type(EXCL_EQEQ) ;
Inside_IS: IS -> type(IS) ;
Inside_NOT_IS: NOT_IS -> type(NOT_IS) ;
Inside_NOT_IN: NOT_IN -> type(NOT_IN) ;
Inside_AS: AS  -> type(AS) ;
Inside_AS_SAFE: AS_SAFE  -> type(AS_SAFE) ;
Inside_EQEQ: EQEQ  -> type(EQEQ) ;
Inside_EQEQEQ: EQEQEQ  -> type(EQEQEQ) ;
Inside_SINGLE_QUOTE: SINGLE_QUOTE  -> type(SINGLE_QUOTE) ;
Inside_I: I -> type(I) ;
Inside_E: E -> type(E) ;
Inside_CIS: CIS -> type(CIS) ;

Inside_QUOTE_OPEN: QUOTE_OPEN -> pushMode(LineString), type(QUOTE_OPEN) ;
Inside_M_QUOTE_OPEN: M_QUOTE_OPEN -> pushMode(MultiLineString), type(M_QUOTE_OPEN) ;
Inside_AT_QUOTE_OPEN: AT_QUOTE_OPEN -> pushMode(EscapedLineString), type(AT_QUOTE_OPEN) ;
Inside_EXPANSION_QUOTE_OPEN: EXPANSION_QUOTE_OPEN -> pushMode(ExpansionLineString), type(EXPANSION_QUOTE_OPEN) ;

Inside_FUN: FUN -> type(FUN) ;
Inside_OBJECT: OBJECT -> type(OBJECT) ;
Inside_SUPER: SUPER -> type(SUPER) ;
Inside_IN: IN -> type(IN) ;
Inside_OUT: OUT -> type(OUT) ;
Inside_AT_FIELD: AT_FIELD -> type(AT_FIELD) ;
Inside_AT_FILE: AT_FILE -> type(AT_FILE) ;
Inside_AT_PROPERTY: AT_PROPERTY -> type(AT_PROPERTY) ;
Inside_AT_GET: AT_GET -> type(AT_GET) ;
Inside_AT_SET: AT_SET -> type(AT_SET) ;
Inside_AT_RECEIVER: AT_RECEIVER -> type(AT_RECEIVER) ;
Inside_AT_PARAM: AT_PARAM -> type(AT_PARAM) ;
Inside_AT_SETPARAM: AT_SETPARAM -> type(AT_SETPARAM) ;
Inside_AT_DELEGATE: AT_DELEGATE -> type(AT_DELEGATE) ;
Inside_THROW: THROW -> type(THROW) ;
Inside_RETURN: RETURN -> type(RETURN) ;
Inside_CONTINUE: CONTINUE -> type(CONTINUE) ;
Inside_BREAK: BREAK -> type(BREAK) ;
Inside_RETURN_AT: RETURN_AT -> type(RETURN_AT) ;
Inside_CONTINUE_AT: CONTINUE_AT -> type(CONTINUE_AT) ;
Inside_BREAK_AT: BREAK_AT -> type(BREAK_AT) ;
Inside_IF: IF -> type(IF) ;
Inside_ELSE: ELSE -> type(ELSE) ;
Inside_WHEN: WHEN -> type(WHEN) ;
Inside_TRY: TRY -> type(TRY) ;
Inside_CATCH: CATCH -> type(CATCH) ;
Inside_FINALLY: FINALLY -> type(FINALLY) ;
Inside_FOR: FOR -> type(FOR) ;
Inside_DO: DO -> type(DO) ;
Inside_WHILE: WHILE -> type(WHILE) ;

Inside_PUBLIC: PUBLIC -> type(PUBLIC) ;
Inside_PRIVATE: PRIVATE -> type(PRIVATE) ;
Inside_PROTECTED: PROTECTED -> type(PROTECTED) ;
Inside_INTERNAL: INTERNAL -> type(INTERNAL) ;
Inside_ENUM: ENUM -> type(ENUM) ;
Inside_SEALED: SEALED -> type(SEALED) ;
Inside_ANNOTATION: ANNOTATION -> type(ANNOTATION) ;
Inside_DATA: DATA -> type(DATA) ;
Inside_INNER: INNER -> type(INNER) ;
Inside_TAILREC: TAILREC -> type(TAILREC) ;
Inside_OPERATOR: OPERATOR -> type(OPERATOR) ;
Inside_INLINE: INLINE -> type(INLINE) ;
Inside_INFIX: INFIX -> type(INFIX) ;
Inside_EXTERNAL: EXTERNAL -> type(EXTERNAL) ;
Inside_SUSPEND: SUSPEND -> type(SUSPEND) ;
Inside_OVERRIDE: OVERRIDE -> type(OVERRIDE) ;
Inside_ABSTRACT: ABSTRACT -> type(ABSTRACT) ;
Inside_FINAL: FINAL -> type(FINAL) ;
Inside_OPEN: OPEN -> type(OPEN) ;
Inside_CONST: CONST -> type(CONST) ;
Inside_LATEINIT: LATEINIT -> type(LATEINIT) ;
Inside_VARARG: VARARG -> type(VARARG) ;
Inside_NOINLINE: NOINLINE -> type(NOINLINE) ;
Inside_CROSSINLINE: CROSSINLINE -> type(CROSSINLINE) ;
Inside_REIFIED: REIFIED -> type(REIFIED) ;
Inside_EXPECT: EXPECT -> type(EXPECT) ;
Inside_ACTUAL: ACTUAL -> type(ACTUAL) ;

Inside_BooleanLiteral: BooleanLiteral -> type(BooleanLiteral) ;
Inside_IntegerLiteral: IntegerLiteral -> type(IntegerLiteral) ;
Inside_HexLiteral: HexLiteral -> type(HexLiteral) ;
Inside_BinLiteral: BinLiteral -> type(BinLiteral) ;
Inside_CharacterLiteral: CharacterLiteral -> type(CharacterLiteral) ;
Inside_RealLiteral: RealLiteral -> type(RealLiteral) ;
Inside_NullLiteral: NullLiteral -> type(NullLiteral) ;
Inside_LongLiteral: LongLiteral -> type(LongLiteral) ;

Inside_Identifier: Identifier -> type(Identifier) ;
Inside_IdentifierAt: IdentifierAt -> type(IdentifierAt) ;
Inside_Comment: (LineComment | DelimitedComment) -> channel(HIDDEN) ;
Inside_WS: WS -> channel(HIDDEN) ;
Inside_NL: NL -> channel(HIDDEN) ;

mode LineString ;

QUOTE_CLOSE
    : '"' -> popMode
    ;

LineStrRef
    : FieldIdentifier
    ;

LineStrText
    : ~('\\' | '"' | '$')+ | '$'
    ;

LineStrEscapedChar
    : EscapedIdentifier
    | UniCharacterLiteral
    ;

LineStrExprStart
    : '${' -> pushMode(DEFAULT_MODE)
    ;


mode MultiLineString ;

M_QUOTE_CLOSE
    : MultiLineStringQuote? '"' -> popMode
    ;

MultiLineStringQuote
    : '"'+
    ;

MultiLineStrRef
    : FieldIdentifier
    ;

MultiLineStrText
    :  ~('"' | '$')+ | '$' // multiline does not support escaping, so only '$' should be disallowed
    ;

MultiLineStrExprStart
    : '${' -> pushMode(DEFAULT_MODE)
    ;

MultiLineNL: NL -> type(NL) ;

mode EscapedLineString ;

AT_QUOTE_CLOSE
	: '"' -> popMode
	;

EscapedLineStrRef
	: FieldIdentifier
	;
	
EscapedLineStrText
	:  ~('"' | '$')+ | '$'	// can't escape in escaped string xD duh.. 
	;
	
EscapedLineStrExprStart
	: '${' -> pushMode(DEFAULT_MODE)
	;

mode ExpansionLineString ;

EXPANSION_QUOTE_CLOSE
	: '"' -> popMode
	;

ExpansionLineStrRef
	: FieldIdentifier					// allows $var 
	;
	
ExpansionLineStrText
	: ~('"' | '$')+ | '$'
	;

ExpansionLineStrExprStart
	: '${' -> pushMode(DEFAULT_MODE)	// allows string interpolation in expansions
	;