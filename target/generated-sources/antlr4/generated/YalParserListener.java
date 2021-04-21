// Generated from YalParser.g4 by ANTLR 4.9.1

package generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YalParser}.
 */
public interface YalParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(YalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(YalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#fileAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterFileAnnotation(YalParser.FileAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#fileAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitFileAnnotation(YalParser.FileAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#packageHeader}.
	 * @param ctx the parse tree
	 */
	void enterPackageHeader(YalParser.PackageHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#packageHeader}.
	 * @param ctx the parse tree
	 */
	void exitPackageHeader(YalParser.PackageHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#importHeader}.
	 * @param ctx the parse tree
	 */
	void enterImportHeader(YalParser.ImportHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#importHeader}.
	 * @param ctx the parse tree
	 */
	void exitImportHeader(YalParser.ImportHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#importAlias}.
	 * @param ctx the parse tree
	 */
	void enterImportAlias(YalParser.ImportAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#importAlias}.
	 * @param ctx the parse tree
	 */
	void exitImportAlias(YalParser.ImportAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(YalParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(YalParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#primaryConstructor}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryConstructor(YalParser.PrimaryConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#primaryConstructor}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryConstructor(YalParser.PrimaryConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#classParameters}.
	 * @param ctx the parse tree
	 */
	void enterClassParameters(YalParser.ClassParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#classParameters}.
	 * @param ctx the parse tree
	 */
	void exitClassParameters(YalParser.ClassParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#classParameter}.
	 * @param ctx the parse tree
	 */
	void enterClassParameter(YalParser.ClassParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#classParameter}.
	 * @param ctx the parse tree
	 */
	void exitClassParameter(YalParser.ClassParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#delegationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDelegationSpecifiers(YalParser.DelegationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#delegationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDelegationSpecifiers(YalParser.DelegationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#annotatedDelegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedDelegationSpecifier(YalParser.AnnotatedDelegationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#annotatedDelegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedDelegationSpecifier(YalParser.AnnotatedDelegationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#delegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDelegationSpecifier(YalParser.DelegationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#delegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDelegationSpecifier(YalParser.DelegationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#constructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterConstructorInvocation(YalParser.ConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#constructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitConstructorInvocation(YalParser.ConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#explicitDelegation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitDelegation(YalParser.ExplicitDelegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#explicitDelegation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitDelegation(YalParser.ExplicitDelegationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(YalParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(YalParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#classMemberDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclarations(YalParser.ClassMemberDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#classMemberDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclarations(YalParser.ClassMemberDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(YalParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(YalParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#anonymousInitializer}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousInitializer(YalParser.AnonymousInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#anonymousInitializer}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousInitializer(YalParser.AnonymousInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#secondaryConstructor}.
	 * @param ctx the parse tree
	 */
	void enterSecondaryConstructor(YalParser.SecondaryConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#secondaryConstructor}.
	 * @param ctx the parse tree
	 */
	void exitSecondaryConstructor(YalParser.SecondaryConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#constructorDelegationCall}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDelegationCall(YalParser.ConstructorDelegationCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#constructorDelegationCall}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDelegationCall(YalParser.ConstructorDelegationCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#enumClassBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumClassBody(YalParser.EnumClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#enumClassBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumClassBody(YalParser.EnumClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#enumEntries}.
	 * @param ctx the parse tree
	 */
	void enterEnumEntries(YalParser.EnumEntriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#enumEntries}.
	 * @param ctx the parse tree
	 */
	void exitEnumEntries(YalParser.EnumEntriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#enumEntry}.
	 * @param ctx the parse tree
	 */
	void enterEnumEntry(YalParser.EnumEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#enumEntry}.
	 * @param ctx the parse tree
	 */
	void exitEnumEntry(YalParser.EnumEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(YalParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(YalParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#functionValueParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionValueParameters(YalParser.FunctionValueParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#functionValueParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionValueParameters(YalParser.FunctionValueParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#functionValueParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionValueParameter(YalParser.FunctionValueParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#functionValueParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionValueParameter(YalParser.FunctionValueParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(YalParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(YalParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#setterParameter}.
	 * @param ctx the parse tree
	 */
	void enterSetterParameter(YalParser.SetterParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#setterParameter}.
	 * @param ctx the parse tree
	 */
	void exitSetterParameter(YalParser.SetterParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(YalParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(YalParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterObjectDeclaration(YalParser.ObjectDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitObjectDeclaration(YalParser.ObjectDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#companionObject}.
	 * @param ctx the parse tree
	 */
	void enterCompanionObject(YalParser.CompanionObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#companionObject}.
	 * @param ctx the parse tree
	 */
	void exitCompanionObject(YalParser.CompanionObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(YalParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(YalParser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#multiVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMultiVariableDeclaration(YalParser.MultiVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#multiVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMultiVariableDeclaration(YalParser.MultiVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(YalParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(YalParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#propertyDelegate}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDelegate(YalParser.PropertyDelegateContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#propertyDelegate}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDelegate(YalParser.PropertyDelegateContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(YalParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(YalParser.GetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterSetter(YalParser.SetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitSetter(YalParser.SetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeAlias}.
	 * @param ctx the parse tree
	 */
	void enterTypeAlias(YalParser.TypeAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeAlias}.
	 * @param ctx the parse tree
	 */
	void exitTypeAlias(YalParser.TypeAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(YalParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(YalParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(YalParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(YalParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeParameterModifiers}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifiers(YalParser.TypeParameterModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeParameterModifiers}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifiers(YalParser.TypeParameterModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(YalParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(YalParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_(YalParser.Type_Context ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_(YalParser.Type_Context ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeModifiers}.
	 * @param ctx the parse tree
	 */
	void enterTypeModifiers(YalParser.TypeModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeModifiers}.
	 * @param ctx the parse tree
	 */
	void exitTypeModifiers(YalParser.TypeModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeModifier(YalParser.TypeModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeModifier(YalParser.TypeModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#parenthesizedType}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedType(YalParser.ParenthesizedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#parenthesizedType}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedType(YalParser.ParenthesizedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#nullableType}.
	 * @param ctx the parse tree
	 */
	void enterNullableType(YalParser.NullableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#nullableType}.
	 * @param ctx the parse tree
	 */
	void exitNullableType(YalParser.NullableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void enterTypeReference(YalParser.TypeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void exitTypeReference(YalParser.TypeReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(YalParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(YalParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#receiverType}.
	 * @param ctx the parse tree
	 */
	void enterReceiverType(YalParser.ReceiverTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#receiverType}.
	 * @param ctx the parse tree
	 */
	void exitReceiverType(YalParser.ReceiverTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#userType}.
	 * @param ctx the parse tree
	 */
	void enterUserType(YalParser.UserTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#userType}.
	 * @param ctx the parse tree
	 */
	void exitUserType(YalParser.UserTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#parenthesizedUserType}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedUserType(YalParser.ParenthesizedUserTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#parenthesizedUserType}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedUserType(YalParser.ParenthesizedUserTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#simpleUserType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleUserType(YalParser.SimpleUserTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#simpleUserType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleUserType(YalParser.SimpleUserTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#functionTypeParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeParameters(YalParser.FunctionTypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#functionTypeParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeParameters(YalParser.FunctionTypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeConstraints}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstraints(YalParser.TypeConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeConstraints}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstraints(YalParser.TypeConstraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstraint(YalParser.TypeConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstraint(YalParser.TypeConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(YalParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(YalParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(YalParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(YalParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(YalParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(YalParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(YalParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(YalParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(YalParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(YalParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(YalParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(YalParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(YalParser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(YalParser.DisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(YalParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(YalParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(YalParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(YalParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(YalParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(YalParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#infixOperation}.
	 * @param ctx the parse tree
	 */
	void enterInfixOperation(YalParser.InfixOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#infixOperation}.
	 * @param ctx the parse tree
	 */
	void exitInfixOperation(YalParser.InfixOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#elvisExpression}.
	 * @param ctx the parse tree
	 */
	void enterElvisExpression(YalParser.ElvisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#elvisExpression}.
	 * @param ctx the parse tree
	 */
	void exitElvisExpression(YalParser.ElvisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#infixFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterInfixFunctionCall(YalParser.InfixFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#infixFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitInfixFunctionCall(YalParser.InfixFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void enterRangeExpression(YalParser.RangeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void exitRangeExpression(YalParser.RangeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(YalParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(YalParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(YalParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(YalParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#asExpression}.
	 * @param ctx the parse tree
	 */
	void enterAsExpression(YalParser.AsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#asExpression}.
	 * @param ctx the parse tree
	 */
	void exitAsExpression(YalParser.AsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#prefixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixUnaryExpression(YalParser.PrefixUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#prefixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixUnaryExpression(YalParser.PrefixUnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#unaryPrefix}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPrefix(YalParser.UnaryPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#unaryPrefix}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPrefix(YalParser.UnaryPrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#postfixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnaryExpression(YalParser.PostfixUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#postfixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnaryExpression(YalParser.PostfixUnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#complexExpression}.
	 * @param ctx the parse tree
	 */
	void enterComplexExpression(YalParser.ComplexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#complexExpression}.
	 * @param ctx the parse tree
	 */
	void exitComplexExpression(YalParser.ComplexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#postfixUnarySuffix}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnarySuffix(YalParser.PostfixUnarySuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#postfixUnarySuffix}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnarySuffix(YalParser.PostfixUnarySuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#directlyAssignableExpression}.
	 * @param ctx the parse tree
	 */
	void enterDirectlyAssignableExpression(YalParser.DirectlyAssignableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#directlyAssignableExpression}.
	 * @param ctx the parse tree
	 */
	void exitDirectlyAssignableExpression(YalParser.DirectlyAssignableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#assignableExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignableExpression(YalParser.AssignableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#assignableExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignableExpression(YalParser.AssignableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#assignableSuffix}.
	 * @param ctx the parse tree
	 */
	void enterAssignableSuffix(YalParser.AssignableSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#assignableSuffix}.
	 * @param ctx the parse tree
	 */
	void exitAssignableSuffix(YalParser.AssignableSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#indexingSuffix}.
	 * @param ctx the parse tree
	 */
	void enterIndexingSuffix(YalParser.IndexingSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#indexingSuffix}.
	 * @param ctx the parse tree
	 */
	void exitIndexingSuffix(YalParser.IndexingSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#navigationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterNavigationSuffix(YalParser.NavigationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#navigationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitNavigationSuffix(YalParser.NavigationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#callSuffix}.
	 * @param ctx the parse tree
	 */
	void enterCallSuffix(YalParser.CallSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#callSuffix}.
	 * @param ctx the parse tree
	 */
	void exitCallSuffix(YalParser.CallSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#overridenMethods}.
	 * @param ctx the parse tree
	 */
	void enterOverridenMethods(YalParser.OverridenMethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#overridenMethods}.
	 * @param ctx the parse tree
	 */
	void exitOverridenMethods(YalParser.OverridenMethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#valueArguments}.
	 * @param ctx the parse tree
	 */
	void enterValueArguments(YalParser.ValueArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#valueArguments}.
	 * @param ctx the parse tree
	 */
	void exitValueArguments(YalParser.ValueArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#valueArgument}.
	 * @param ctx the parse tree
	 */
	void enterValueArgument(YalParser.ValueArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#valueArgument}.
	 * @param ctx the parse tree
	 */
	void exitValueArgument(YalParser.ValueArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#annotatedLambda}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedLambda(YalParser.AnnotatedLambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#annotatedLambda}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedLambda(YalParser.AnnotatedLambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(YalParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(YalParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeProjection}.
	 * @param ctx the parse tree
	 */
	void enterTypeProjection(YalParser.TypeProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeProjection}.
	 * @param ctx the parse tree
	 */
	void exitTypeProjection(YalParser.TypeProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeProjectionModifiers}.
	 * @param ctx the parse tree
	 */
	void enterTypeProjectionModifiers(YalParser.TypeProjectionModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeProjectionModifiers}.
	 * @param ctx the parse tree
	 */
	void exitTypeProjectionModifiers(YalParser.TypeProjectionModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeProjectionModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeProjectionModifier(YalParser.TypeProjectionModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeProjectionModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeProjectionModifier(YalParser.TypeProjectionModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(YalParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(YalParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(YalParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(YalParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#collectionLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCollectionLiteral(YalParser.CollectionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#collectionLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCollectionLiteral(YalParser.CollectionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#listComprehension}.
	 * @param ctx the parse tree
	 */
	void enterListComprehension(YalParser.ListComprehensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#listComprehension}.
	 * @param ctx the parse tree
	 */
	void exitListComprehension(YalParser.ListComprehensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#listSplicing}.
	 * @param ctx the parse tree
	 */
	void enterListSplicing(YalParser.ListSplicingContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#listSplicing}.
	 * @param ctx the parse tree
	 */
	void exitListSplicing(YalParser.ListSplicingContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#literalConstant}.
	 * @param ctx the parse tree
	 */
	void enterLiteralConstant(YalParser.LiteralConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#literalConstant}.
	 * @param ctx the parse tree
	 */
	void exitLiteralConstant(YalParser.LiteralConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(YalParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(YalParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterLineStringLiteral(YalParser.LineStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitLineStringLiteral(YalParser.LineStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringLiteral(YalParser.MultiLineStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringLiteral(YalParser.MultiLineStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#escapedLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterEscapedLineStringLiteral(YalParser.EscapedLineStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#escapedLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitEscapedLineStringLiteral(YalParser.EscapedLineStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#expansionLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterExpansionLineStringLiteral(YalParser.ExpansionLineStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#expansionLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitExpansionLineStringLiteral(YalParser.ExpansionLineStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#lineStringContent}.
	 * @param ctx the parse tree
	 */
	void enterLineStringContent(YalParser.LineStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#lineStringContent}.
	 * @param ctx the parse tree
	 */
	void exitLineStringContent(YalParser.LineStringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#lineStringExpression}.
	 * @param ctx the parse tree
	 */
	void enterLineStringExpression(YalParser.LineStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#lineStringExpression}.
	 * @param ctx the parse tree
	 */
	void exitLineStringExpression(YalParser.LineStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringContent(YalParser.MultiLineStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringContent(YalParser.MultiLineStringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#multiLineStringExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringExpression(YalParser.MultiLineStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#multiLineStringExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringExpression(YalParser.MultiLineStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#escapedLineStringContent}.
	 * @param ctx the parse tree
	 */
	void enterEscapedLineStringContent(YalParser.EscapedLineStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#escapedLineStringContent}.
	 * @param ctx the parse tree
	 */
	void exitEscapedLineStringContent(YalParser.EscapedLineStringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#escapedLineStringExpression}.
	 * @param ctx the parse tree
	 */
	void enterEscapedLineStringExpression(YalParser.EscapedLineStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#escapedLineStringExpression}.
	 * @param ctx the parse tree
	 */
	void exitEscapedLineStringExpression(YalParser.EscapedLineStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#expansionLineStringContent}.
	 * @param ctx the parse tree
	 */
	void enterExpansionLineStringContent(YalParser.ExpansionLineStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#expansionLineStringContent}.
	 * @param ctx the parse tree
	 */
	void exitExpansionLineStringContent(YalParser.ExpansionLineStringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#expansionLineStringExpression}.
	 * @param ctx the parse tree
	 */
	void enterExpansionLineStringExpression(YalParser.ExpansionLineStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#expansionLineStringExpression}.
	 * @param ctx the parse tree
	 */
	void exitExpansionLineStringExpression(YalParser.ExpansionLineStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#lambdaLiteral}.
	 * @param ctx the parse tree
	 */
	void enterLambdaLiteral(YalParser.LambdaLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#lambdaLiteral}.
	 * @param ctx the parse tree
	 */
	void exitLambdaLiteral(YalParser.LambdaLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(YalParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(YalParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#lambdaParameter}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameter(YalParser.LambdaParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#lambdaParameter}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameter(YalParser.LambdaParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousFunction(YalParser.AnonymousFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousFunction(YalParser.AnonymousFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#functionLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFunctionLiteral(YalParser.FunctionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#functionLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFunctionLiteral(YalParser.FunctionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(YalParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(YalParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#thisExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(YalParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#thisExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(YalParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#superExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperExpression(YalParser.SuperExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#superExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperExpression(YalParser.SuperExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#controlStructureBody}.
	 * @param ctx the parse tree
	 */
	void enterControlStructureBody(YalParser.ControlStructureBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#controlStructureBody}.
	 * @param ctx the parse tree
	 */
	void exitControlStructureBody(YalParser.ControlStructureBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpression(YalParser.IfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpression(YalParser.IfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#whenExpression}.
	 * @param ctx the parse tree
	 */
	void enterWhenExpression(YalParser.WhenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#whenExpression}.
	 * @param ctx the parse tree
	 */
	void exitWhenExpression(YalParser.WhenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#whenEntry}.
	 * @param ctx the parse tree
	 */
	void enterWhenEntry(YalParser.WhenEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#whenEntry}.
	 * @param ctx the parse tree
	 */
	void exitWhenEntry(YalParser.WhenEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#whenCondition}.
	 * @param ctx the parse tree
	 */
	void enterWhenCondition(YalParser.WhenConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#whenCondition}.
	 * @param ctx the parse tree
	 */
	void exitWhenCondition(YalParser.WhenConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#rangeTest}.
	 * @param ctx the parse tree
	 */
	void enterRangeTest(YalParser.RangeTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#rangeTest}.
	 * @param ctx the parse tree
	 */
	void exitRangeTest(YalParser.RangeTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeTest}.
	 * @param ctx the parse tree
	 */
	void enterTypeTest(YalParser.TypeTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeTest}.
	 * @param ctx the parse tree
	 */
	void exitTypeTest(YalParser.TypeTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#tryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTryExpression(YalParser.TryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#tryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTryExpression(YalParser.TryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void enterCatchBlock(YalParser.CatchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void exitCatchBlock(YalParser.CatchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(YalParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(YalParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(YalParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(YalParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(YalParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(YalParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(YalParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(YalParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(YalParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(YalParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#jumpExpression}.
	 * @param ctx the parse tree
	 */
	void enterJumpExpression(YalParser.JumpExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#jumpExpression}.
	 * @param ctx the parse tree
	 */
	void exitJumpExpression(YalParser.JumpExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#callableReference}.
	 * @param ctx the parse tree
	 */
	void enterCallableReference(YalParser.CallableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#callableReference}.
	 * @param ctx the parse tree
	 */
	void exitCallableReference(YalParser.CallableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#conjunctionOperator}.
	 * @param ctx the parse tree
	 */
	void enterConjunctionOperator(YalParser.ConjunctionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#conjunctionOperator}.
	 * @param ctx the parse tree
	 */
	void exitConjunctionOperator(YalParser.ConjunctionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#disjunctionOperator}.
	 * @param ctx the parse tree
	 */
	void enterDisjunctionOperator(YalParser.DisjunctionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#disjunctionOperator}.
	 * @param ctx the parse tree
	 */
	void exitDisjunctionOperator(YalParser.DisjunctionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#assignmentAndOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentAndOperator(YalParser.AssignmentAndOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#assignmentAndOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentAndOperator(YalParser.AssignmentAndOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void enterEqualityOperator(YalParser.EqualityOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void exitEqualityOperator(YalParser.EqualityOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(YalParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(YalParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#inOperator}.
	 * @param ctx the parse tree
	 */
	void enterInOperator(YalParser.InOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#inOperator}.
	 * @param ctx the parse tree
	 */
	void exitInOperator(YalParser.InOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#isOperator}.
	 * @param ctx the parse tree
	 */
	void enterIsOperator(YalParser.IsOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#isOperator}.
	 * @param ctx the parse tree
	 */
	void exitIsOperator(YalParser.IsOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOperator(YalParser.AdditiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOperator(YalParser.AdditiveOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOperator(YalParser.MultiplicativeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOperator(YalParser.MultiplicativeOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#asOperator}.
	 * @param ctx the parse tree
	 */
	void enterAsOperator(YalParser.AsOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#asOperator}.
	 * @param ctx the parse tree
	 */
	void exitAsOperator(YalParser.AsOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#prefixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterPrefixUnaryOperator(YalParser.PrefixUnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#prefixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitPrefixUnaryOperator(YalParser.PrefixUnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#postfixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnaryOperator(YalParser.PostfixUnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#postfixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnaryOperator(YalParser.PostfixUnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#memberAccessOperator}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessOperator(YalParser.MemberAccessOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#memberAccessOperator}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessOperator(YalParser.MemberAccessOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(YalParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(YalParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(YalParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(YalParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(YalParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(YalParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#memberModifier}.
	 * @param ctx the parse tree
	 */
	void enterMemberModifier(YalParser.MemberModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#memberModifier}.
	 * @param ctx the parse tree
	 */
	void exitMemberModifier(YalParser.MemberModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#visibilityModifier}.
	 * @param ctx the parse tree
	 */
	void enterVisibilityModifier(YalParser.VisibilityModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#visibilityModifier}.
	 * @param ctx the parse tree
	 */
	void exitVisibilityModifier(YalParser.VisibilityModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#varianceModifier}.
	 * @param ctx the parse tree
	 */
	void enterVarianceModifier(YalParser.VarianceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#varianceModifier}.
	 * @param ctx the parse tree
	 */
	void exitVarianceModifier(YalParser.VarianceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#functionModifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionModifier(YalParser.FunctionModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#functionModifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionModifier(YalParser.FunctionModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#propertyModifier}.
	 * @param ctx the parse tree
	 */
	void enterPropertyModifier(YalParser.PropertyModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#propertyModifier}.
	 * @param ctx the parse tree
	 */
	void exitPropertyModifier(YalParser.PropertyModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#inheritanceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInheritanceModifier(YalParser.InheritanceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#inheritanceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInheritanceModifier(YalParser.InheritanceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#parameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterParameterModifier(YalParser.ParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#parameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitParameterModifier(YalParser.ParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#reificationModifier}.
	 * @param ctx the parse tree
	 */
	void enterReificationModifier(YalParser.ReificationModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#reificationModifier}.
	 * @param ctx the parse tree
	 */
	void exitReificationModifier(YalParser.ReificationModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#platformModifier}.
	 * @param ctx the parse tree
	 */
	void enterPlatformModifier(YalParser.PlatformModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#platformModifier}.
	 * @param ctx the parse tree
	 */
	void exitPlatformModifier(YalParser.PlatformModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(YalParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(YalParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(YalParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(YalParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#singleAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleAnnotation(YalParser.SingleAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#singleAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleAnnotation(YalParser.SingleAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#multiAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMultiAnnotation(YalParser.MultiAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#multiAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMultiAnnotation(YalParser.MultiAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#annotationUseSiteTarget}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationUseSiteTarget(YalParser.AnnotationUseSiteTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#annotationUseSiteTarget}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationUseSiteTarget(YalParser.AnnotationUseSiteTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#unescapedAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterUnescapedAnnotation(YalParser.UnescapedAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#unescapedAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitUnescapedAnnotation(YalParser.UnescapedAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleIdentifier(YalParser.SimpleIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleIdentifier(YalParser.SimpleIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(YalParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(YalParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#shebangLine}.
	 * @param ctx the parse tree
	 */
	void enterShebangLine(YalParser.ShebangLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#shebangLine}.
	 * @param ctx the parse tree
	 */
	void exitShebangLine(YalParser.ShebangLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#quest}.
	 * @param ctx the parse tree
	 */
	void enterQuest(YalParser.QuestContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#quest}.
	 * @param ctx the parse tree
	 */
	void exitQuest(YalParser.QuestContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#elvis}.
	 * @param ctx the parse tree
	 */
	void enterElvis(YalParser.ElvisContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#elvis}.
	 * @param ctx the parse tree
	 */
	void exitElvis(YalParser.ElvisContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#safeNav}.
	 * @param ctx the parse tree
	 */
	void enterSafeNav(YalParser.SafeNavContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#safeNav}.
	 * @param ctx the parse tree
	 */
	void exitSafeNav(YalParser.SafeNavContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#excl}.
	 * @param ctx the parse tree
	 */
	void enterExcl(YalParser.ExclContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#excl}.
	 * @param ctx the parse tree
	 */
	void exitExcl(YalParser.ExclContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#semi}.
	 * @param ctx the parse tree
	 */
	void enterSemi(YalParser.SemiContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#semi}.
	 * @param ctx the parse tree
	 */
	void exitSemi(YalParser.SemiContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#semis}.
	 * @param ctx the parse tree
	 */
	void enterSemis(YalParser.SemisContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#semis}.
	 * @param ctx the parse tree
	 */
	void exitSemis(YalParser.SemisContext ctx);
}