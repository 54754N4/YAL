// Generated from YalParser.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link YalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface YalParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link YalParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(YalParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#fileAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileAnnotation(YalParser.FileAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#packageHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageHeader(YalParser.PackageHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#importList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportList(YalParser.ImportListContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#importHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportHeader(YalParser.ImportHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#importAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportAlias(YalParser.ImportAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(YalParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#primaryConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryConstructor(YalParser.PrimaryConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#classParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassParameters(YalParser.ClassParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#classParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassParameter(YalParser.ClassParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#delegationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelegationSpecifiers(YalParser.DelegationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#annotatedDelegationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotatedDelegationSpecifier(YalParser.AnnotatedDelegationSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#delegationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelegationSpecifier(YalParser.DelegationSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#constructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorInvocation(YalParser.ConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#explicitDelegation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitDelegation(YalParser.ExplicitDelegationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(YalParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#classMemberDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclarations(YalParser.ClassMemberDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(YalParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#anonymousInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousInitializer(YalParser.AnonymousInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#secondaryConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondaryConstructor(YalParser.SecondaryConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#constructorDelegationCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDelegationCall(YalParser.ConstructorDelegationCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#enumClassBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumClassBody(YalParser.EnumClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#enumEntries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumEntries(YalParser.EnumEntriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#enumEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumEntry(YalParser.EnumEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(YalParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#functionValueParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionValueParameters(YalParser.FunctionValueParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#functionValueParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionValueParameter(YalParser.FunctionValueParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(YalParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#setterParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetterParameter(YalParser.SetterParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(YalParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#objectDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDeclaration(YalParser.ObjectDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#companionObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompanionObject(YalParser.CompanionObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(YalParser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#multiVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiVariableDeclaration(YalParser.MultiVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(YalParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#propertyDelegate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDelegate(YalParser.PropertyDelegateContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#getter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter(YalParser.GetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter(YalParser.SetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#typeAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAlias(YalParser.TypeAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(YalParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(YalParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#typeParameterModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifiers(YalParser.TypeParameterModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(YalParser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#type_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_(YalParser.Type_Context ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#typeModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeModifiers(YalParser.TypeModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#typeModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeModifier(YalParser.TypeModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#parenthesizedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedType(YalParser.ParenthesizedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#nullableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullableType(YalParser.NullableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#typeReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeReference(YalParser.TypeReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(YalParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#receiverType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverType(YalParser.ReceiverTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#userType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserType(YalParser.UserTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#parenthesizedUserType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedUserType(YalParser.ParenthesizedUserTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#simpleUserType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleUserType(YalParser.SimpleUserTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#functionTypeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeParameters(YalParser.FunctionTypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#typeConstraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstraints(YalParser.TypeConstraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#typeConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstraint(YalParser.TypeConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(YalParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(YalParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(YalParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(YalParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(YalParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(YalParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#disjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunction(YalParser.DisjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(YalParser.ConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(YalParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(YalParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#infixOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixOperation(YalParser.InfixOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#elvisExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElvisExpression(YalParser.ElvisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#infixFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixFunctionCall(YalParser.InfixFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#rangeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpression(YalParser.RangeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(YalParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(YalParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#asExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsExpression(YalParser.AsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#prefixUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixUnaryExpression(YalParser.PrefixUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#unaryPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPrefix(YalParser.UnaryPrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#postfixUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixUnaryExpression(YalParser.PostfixUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#postfixUnarySuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixUnarySuffix(YalParser.PostfixUnarySuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#directlyAssignableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectlyAssignableExpression(YalParser.DirectlyAssignableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#assignableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignableExpression(YalParser.AssignableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#assignableSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignableSuffix(YalParser.AssignableSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#indexingSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexingSuffix(YalParser.IndexingSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#navigationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigationSuffix(YalParser.NavigationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#callSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallSuffix(YalParser.CallSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#overridenMethods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverridenMethods(YalParser.OverridenMethodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#valueArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueArguments(YalParser.ValueArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#valueArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueArgument(YalParser.ValueArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#annotatedLambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotatedLambda(YalParser.AnnotatedLambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(YalParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#typeProjection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeProjection(YalParser.TypeProjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#typeProjectionModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeProjectionModifiers(YalParser.TypeProjectionModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#typeProjectionModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeProjectionModifier(YalParser.TypeProjectionModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(YalParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(YalParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#collectionLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionLiteral(YalParser.CollectionLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#listComprehension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListComprehension(YalParser.ListComprehensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#listSplicing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListSplicing(YalParser.ListSplicingContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#literalConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralConstant(YalParser.LiteralConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(YalParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStringLiteral(YalParser.LineStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLineStringLiteral(YalParser.MultiLineStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#escapedLineStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscapedLineStringLiteral(YalParser.EscapedLineStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#lineStringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStringContent(YalParser.LineStringContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#lineStringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStringExpression(YalParser.LineStringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLineStringContent(YalParser.MultiLineStringContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#multiLineStringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLineStringExpression(YalParser.MultiLineStringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#escapedLineStringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscapedLineStringContent(YalParser.EscapedLineStringContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#escapedLineStringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscapedLineStringExpression(YalParser.EscapedLineStringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#lambdaLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaLiteral(YalParser.LambdaLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(YalParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#lambdaParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameter(YalParser.LambdaParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#anonymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousFunction(YalParser.AnonymousFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#functionLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionLiteral(YalParser.FunctionLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(YalParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#thisExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(YalParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#superExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperExpression(YalParser.SuperExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#controlStructureBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlStructureBody(YalParser.ControlStructureBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#ifExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpression(YalParser.IfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#whenExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenExpression(YalParser.WhenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#whenEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenEntry(YalParser.WhenEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#whenCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenCondition(YalParser.WhenConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#rangeTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeTest(YalParser.RangeTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#typeTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTest(YalParser.TypeTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#tryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryExpression(YalParser.TryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#catchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchBlock(YalParser.CatchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(YalParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(YalParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(YalParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(YalParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(YalParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#jumpExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpExpression(YalParser.JumpExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#callableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallableReference(YalParser.CallableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#conjunctionOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunctionOperator(YalParser.ConjunctionOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#disjunctionOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunctionOperator(YalParser.DisjunctionOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#assignmentAndOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentAndOperator(YalParser.AssignmentAndOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#equalityOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityOperator(YalParser.EqualityOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(YalParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#inOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInOperator(YalParser.InOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#isOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsOperator(YalParser.IsOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#additiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOperator(YalParser.AdditiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOperator(YalParser.MultiplicativeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#asOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsOperator(YalParser.AsOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#prefixUnaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixUnaryOperator(YalParser.PrefixUnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#postfixUnaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixUnaryOperator(YalParser.PostfixUnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#memberAccessOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccessOperator(YalParser.MemberAccessOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(YalParser.ModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(YalParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(YalParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#memberModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberModifier(YalParser.MemberModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#visibilityModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibilityModifier(YalParser.VisibilityModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#varianceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarianceModifier(YalParser.VarianceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#functionModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionModifier(YalParser.FunctionModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#propertyModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyModifier(YalParser.PropertyModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#inheritanceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritanceModifier(YalParser.InheritanceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#parameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterModifier(YalParser.ParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#reificationModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReificationModifier(YalParser.ReificationModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#platformModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlatformModifier(YalParser.PlatformModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(YalParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(YalParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#singleAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleAnnotation(YalParser.SingleAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#multiAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiAnnotation(YalParser.MultiAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#annotationUseSiteTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationUseSiteTarget(YalParser.AnnotationUseSiteTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#unescapedAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnescapedAnnotation(YalParser.UnescapedAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleIdentifier(YalParser.SimpleIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(YalParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#shebangLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShebangLine(YalParser.ShebangLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#quest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuest(YalParser.QuestContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#elvis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElvis(YalParser.ElvisContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#safeNav}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSafeNav(YalParser.SafeNavContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#excl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcl(YalParser.ExclContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#semi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemi(YalParser.SemiContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalParser#semis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemis(YalParser.SemisContext ctx);
}