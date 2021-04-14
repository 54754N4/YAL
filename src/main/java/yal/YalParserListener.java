package yal;

// Generated from YalParser.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YalParser}.
 */
public interface YalParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YalParser#functionTypeParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeParameters(@NotNull YalParser.FunctionTypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#functionTypeParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeParameters(@NotNull YalParser.FunctionTypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(@NotNull YalParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(@NotNull YalParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeProjectionModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeProjectionModifier(@NotNull YalParser.TypeProjectionModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeProjectionModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeProjectionModifier(@NotNull YalParser.TypeProjectionModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#enumEntries}.
	 * @param ctx the parse tree
	 */
	void enterEnumEntries(@NotNull YalParser.EnumEntriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#enumEntries}.
	 * @param ctx the parse tree
	 */
	void exitEnumEntries(@NotNull YalParser.EnumEntriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#whenExpression}.
	 * @param ctx the parse tree
	 */
	void enterWhenExpression(@NotNull YalParser.WhenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#whenExpression}.
	 * @param ctx the parse tree
	 */
	void exitWhenExpression(@NotNull YalParser.WhenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeParameterModifiers}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifiers(@NotNull YalParser.TypeParameterModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeParameterModifiers}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifiers(@NotNull YalParser.TypeParameterModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#enumEntry}.
	 * @param ctx the parse tree
	 */
	void enterEnumEntry(@NotNull YalParser.EnumEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#enumEntry}.
	 * @param ctx the parse tree
	 */
	void exitEnumEntry(@NotNull YalParser.EnumEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#isOperator}.
	 * @param ctx the parse tree
	 */
	void enterIsOperator(@NotNull YalParser.IsOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#isOperator}.
	 * @param ctx the parse tree
	 */
	void exitIsOperator(@NotNull YalParser.IsOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#infixFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterInfixFunctionCall(@NotNull YalParser.InfixFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#infixFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitInfixFunctionCall(@NotNull YalParser.InfixFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(@NotNull YalParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(@NotNull YalParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOperator(@NotNull YalParser.AdditiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOperator(@NotNull YalParser.AdditiveOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#classParameter}.
	 * @param ctx the parse tree
	 */
	void enterClassParameter(@NotNull YalParser.ClassParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#classParameter}.
	 * @param ctx the parse tree
	 */
	void exitClassParameter(@NotNull YalParser.ClassParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#nullableType}.
	 * @param ctx the parse tree
	 */
	void enterNullableType(@NotNull YalParser.NullableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#nullableType}.
	 * @param ctx the parse tree
	 */
	void exitNullableType(@NotNull YalParser.NullableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#directlyAssignableExpression}.
	 * @param ctx the parse tree
	 */
	void enterDirectlyAssignableExpression(@NotNull YalParser.DirectlyAssignableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#directlyAssignableExpression}.
	 * @param ctx the parse tree
	 */
	void exitDirectlyAssignableExpression(@NotNull YalParser.DirectlyAssignableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull YalParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull YalParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#prefixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixUnaryExpression(@NotNull YalParser.PrefixUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#prefixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixUnaryExpression(@NotNull YalParser.PrefixUnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void enterCatchBlock(@NotNull YalParser.CatchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void exitCatchBlock(@NotNull YalParser.CatchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull YalParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull YalParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#setterParameter}.
	 * @param ctx the parse tree
	 */
	void enterSetterParameter(@NotNull YalParser.SetterParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#setterParameter}.
	 * @param ctx the parse tree
	 */
	void exitSetterParameter(@NotNull YalParser.SetterParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#explicitDelegation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitDelegation(@NotNull YalParser.ExplicitDelegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#explicitDelegation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitDelegation(@NotNull YalParser.ExplicitDelegationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(@NotNull YalParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(@NotNull YalParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#multiVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMultiVariableDeclaration(@NotNull YalParser.MultiVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#multiVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMultiVariableDeclaration(@NotNull YalParser.MultiVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(@NotNull YalParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(@NotNull YalParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#receiverType}.
	 * @param ctx the parse tree
	 */
	void enterReceiverType(@NotNull YalParser.ReceiverTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#receiverType}.
	 * @param ctx the parse tree
	 */
	void exitReceiverType(@NotNull YalParser.ReceiverTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#multiAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMultiAnnotation(@NotNull YalParser.MultiAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#multiAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMultiAnnotation(@NotNull YalParser.MultiAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleIdentifier(@NotNull YalParser.SimpleIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleIdentifier(@NotNull YalParser.SimpleIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void enterRangeExpression(@NotNull YalParser.RangeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void exitRangeExpression(@NotNull YalParser.RangeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#propertyDelegate}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDelegate(@NotNull YalParser.PropertyDelegateContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#propertyDelegate}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDelegate(@NotNull YalParser.PropertyDelegateContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#postfixUnarySuffix}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnarySuffix(@NotNull YalParser.PostfixUnarySuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#postfixUnarySuffix}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnarySuffix(@NotNull YalParser.PostfixUnarySuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterObjectDeclaration(@NotNull YalParser.ObjectDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitObjectDeclaration(@NotNull YalParser.ObjectDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(@NotNull YalParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(@NotNull YalParser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(@NotNull YalParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(@NotNull YalParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#singleAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleAnnotation(@NotNull YalParser.SingleAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#singleAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleAnnotation(@NotNull YalParser.SingleAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#classParameters}.
	 * @param ctx the parse tree
	 */
	void enterClassParameters(@NotNull YalParser.ClassParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#classParameters}.
	 * @param ctx the parse tree
	 */
	void exitClassParameters(@NotNull YalParser.ClassParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#controlStructureBody}.
	 * @param ctx the parse tree
	 */
	void enterControlStructureBody(@NotNull YalParser.ControlStructureBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#controlStructureBody}.
	 * @param ctx the parse tree
	 */
	void exitControlStructureBody(@NotNull YalParser.ControlStructureBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#semis}.
	 * @param ctx the parse tree
	 */
	void enterSemis(@NotNull YalParser.SemisContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#semis}.
	 * @param ctx the parse tree
	 */
	void exitSemis(@NotNull YalParser.SemisContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#functionValueParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionValueParameter(@NotNull YalParser.FunctionValueParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#functionValueParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionValueParameter(@NotNull YalParser.FunctionValueParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(@NotNull YalParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(@NotNull YalParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull YalParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull YalParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#annotatedLambda}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedLambda(@NotNull YalParser.AnnotatedLambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#annotatedLambda}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedLambda(@NotNull YalParser.AnnotatedLambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#postfixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnaryExpression(@NotNull YalParser.PostfixUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#postfixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnaryExpression(@NotNull YalParser.PostfixUnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#parenthesizedUserType}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedUserType(@NotNull YalParser.ParenthesizedUserTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#parenthesizedUserType}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedUserType(@NotNull YalParser.ParenthesizedUserTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#indexingSuffix}.
	 * @param ctx the parse tree
	 */
	void enterIndexingSuffix(@NotNull YalParser.IndexingSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#indexingSuffix}.
	 * @param ctx the parse tree
	 */
	void exitIndexingSuffix(@NotNull YalParser.IndexingSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportList(@NotNull YalParser.ImportListContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportList(@NotNull YalParser.ImportListContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#delegationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDelegationSpecifiers(@NotNull YalParser.DelegationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#delegationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDelegationSpecifiers(@NotNull YalParser.DelegationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(@NotNull YalParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(@NotNull YalParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(@NotNull YalParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(@NotNull YalParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#importAlias}.
	 * @param ctx the parse tree
	 */
	void enterImportAlias(@NotNull YalParser.ImportAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#importAlias}.
	 * @param ctx the parse tree
	 */
	void exitImportAlias(@NotNull YalParser.ImportAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringContent(@NotNull YalParser.MultiLineStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringContent(@NotNull YalParser.MultiLineStringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#jumpExpression}.
	 * @param ctx the parse tree
	 */
	void enterJumpExpression(@NotNull YalParser.JumpExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#jumpExpression}.
	 * @param ctx the parse tree
	 */
	void exitJumpExpression(@NotNull YalParser.JumpExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#memberAccessOperator}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessOperator(@NotNull YalParser.MemberAccessOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#memberAccessOperator}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessOperator(@NotNull YalParser.MemberAccessOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(@NotNull YalParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(@NotNull YalParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#primaryConstructor}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryConstructor(@NotNull YalParser.PrimaryConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#primaryConstructor}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryConstructor(@NotNull YalParser.PrimaryConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#parenthesizedType}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedType(@NotNull YalParser.ParenthesizedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#parenthesizedType}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedType(@NotNull YalParser.ParenthesizedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull YalParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull YalParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(@NotNull YalParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(@NotNull YalParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#semi}.
	 * @param ctx the parse tree
	 */
	void enterSemi(@NotNull YalParser.SemiContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#semi}.
	 * @param ctx the parse tree
	 */
	void exitSemi(@NotNull YalParser.SemiContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpression(@NotNull YalParser.IfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpression(@NotNull YalParser.IfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#rangeTest}.
	 * @param ctx the parse tree
	 */
	void enterRangeTest(@NotNull YalParser.RangeTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#rangeTest}.
	 * @param ctx the parse tree
	 */
	void exitRangeTest(@NotNull YalParser.RangeTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeTest}.
	 * @param ctx the parse tree
	 */
	void enterTypeTest(@NotNull YalParser.TypeTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeTest}.
	 * @param ctx the parse tree
	 */
	void exitTypeTest(@NotNull YalParser.TypeTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(@NotNull YalParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(@NotNull YalParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(@NotNull YalParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(@NotNull YalParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#asOperator}.
	 * @param ctx the parse tree
	 */
	void enterAsOperator(@NotNull YalParser.AsOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#asOperator}.
	 * @param ctx the parse tree
	 */
	void exitAsOperator(@NotNull YalParser.AsOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(@NotNull YalParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(@NotNull YalParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#inOperator}.
	 * @param ctx the parse tree
	 */
	void enterInOperator(@NotNull YalParser.InOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#inOperator}.
	 * @param ctx the parse tree
	 */
	void exitInOperator(@NotNull YalParser.InOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull YalParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull YalParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(@NotNull YalParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(@NotNull YalParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(@NotNull YalParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(@NotNull YalParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#functionValueParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionValueParameters(@NotNull YalParser.FunctionValueParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#functionValueParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionValueParameters(@NotNull YalParser.FunctionValueParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#assignableSuffix}.
	 * @param ctx the parse tree
	 */
	void enterAssignableSuffix(@NotNull YalParser.AssignableSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#assignableSuffix}.
	 * @param ctx the parse tree
	 */
	void exitAssignableSuffix(@NotNull YalParser.AssignableSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(@NotNull YalParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(@NotNull YalParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(@NotNull YalParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(@NotNull YalParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull YalParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull YalParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstraint(@NotNull YalParser.TypeConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstraint(@NotNull YalParser.TypeConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#varianceModifier}.
	 * @param ctx the parse tree
	 */
	void enterVarianceModifier(@NotNull YalParser.VarianceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#varianceModifier}.
	 * @param ctx the parse tree
	 */
	void exitVarianceModifier(@NotNull YalParser.VarianceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull YalParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull YalParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#delegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDelegationSpecifier(@NotNull YalParser.DelegationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#delegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDelegationSpecifier(@NotNull YalParser.DelegationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeProjectionModifiers}.
	 * @param ctx the parse tree
	 */
	void enterTypeProjectionModifiers(@NotNull YalParser.TypeProjectionModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeProjectionModifiers}.
	 * @param ctx the parse tree
	 */
	void exitTypeProjectionModifiers(@NotNull YalParser.TypeProjectionModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void enterEqualityOperator(@NotNull YalParser.EqualityOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void exitEqualityOperator(@NotNull YalParser.EqualityOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#simpleUserType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleUserType(@NotNull YalParser.SimpleUserTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#simpleUserType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleUserType(@NotNull YalParser.SimpleUserTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#excl}.
	 * @param ctx the parse tree
	 */
	void enterExcl(@NotNull YalParser.ExclContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#excl}.
	 * @param ctx the parse tree
	 */
	void exitExcl(@NotNull YalParser.ExclContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#assignableExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignableExpression(@NotNull YalParser.AssignableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#assignableExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignableExpression(@NotNull YalParser.AssignableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#propertyModifier}.
	 * @param ctx the parse tree
	 */
	void enterPropertyModifier(@NotNull YalParser.PropertyModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#propertyModifier}.
	 * @param ctx the parse tree
	 */
	void exitPropertyModifier(@NotNull YalParser.PropertyModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#shebangLine}.
	 * @param ctx the parse tree
	 */
	void enterShebangLine(@NotNull YalParser.ShebangLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#shebangLine}.
	 * @param ctx the parse tree
	 */
	void exitShebangLine(@NotNull YalParser.ShebangLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterSetter(@NotNull YalParser.SetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitSetter(@NotNull YalParser.SetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeAlias}.
	 * @param ctx the parse tree
	 */
	void enterTypeAlias(@NotNull YalParser.TypeAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeAlias}.
	 * @param ctx the parse tree
	 */
	void exitTypeAlias(@NotNull YalParser.TypeAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#elvisExpression}.
	 * @param ctx the parse tree
	 */
	void enterElvisExpression(@NotNull YalParser.ElvisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#elvisExpression}.
	 * @param ctx the parse tree
	 */
	void exitElvisExpression(@NotNull YalParser.ElvisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#memberModifier}.
	 * @param ctx the parse tree
	 */
	void enterMemberModifier(@NotNull YalParser.MemberModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#memberModifier}.
	 * @param ctx the parse tree
	 */
	void exitMemberModifier(@NotNull YalParser.MemberModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(@NotNull YalParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(@NotNull YalParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#annotatedDelegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedDelegationSpecifier(@NotNull YalParser.AnnotatedDelegationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#annotatedDelegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedDelegationSpecifier(@NotNull YalParser.AnnotatedDelegationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#topLevelObject}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelObject(@NotNull YalParser.TopLevelObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#topLevelObject}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelObject(@NotNull YalParser.TopLevelObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(@NotNull YalParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(@NotNull YalParser.GetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(@NotNull YalParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(@NotNull YalParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#whenEntry}.
	 * @param ctx the parse tree
	 */
	void enterWhenEntry(@NotNull YalParser.WhenEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#whenEntry}.
	 * @param ctx the parse tree
	 */
	void exitWhenEntry(@NotNull YalParser.WhenEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#collectionLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCollectionLiteral(@NotNull YalParser.CollectionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#collectionLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCollectionLiteral(@NotNull YalParser.CollectionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOperator(@NotNull YalParser.MultiplicativeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOperator(@NotNull YalParser.MultiplicativeOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#quest}.
	 * @param ctx the parse tree
	 */
	void enterQuest(@NotNull YalParser.QuestContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#quest}.
	 * @param ctx the parse tree
	 */
	void exitQuest(@NotNull YalParser.QuestContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#superExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperExpression(@NotNull YalParser.SuperExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#superExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperExpression(@NotNull YalParser.SuperExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#secondaryConstructor}.
	 * @param ctx the parse tree
	 */
	void enterSecondaryConstructor(@NotNull YalParser.SecondaryConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#secondaryConstructor}.
	 * @param ctx the parse tree
	 */
	void exitSecondaryConstructor(@NotNull YalParser.SecondaryConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#inheritanceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInheritanceModifier(@NotNull YalParser.InheritanceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#inheritanceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInheritanceModifier(@NotNull YalParser.InheritanceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#navigationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterNavigationSuffix(@NotNull YalParser.NavigationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#navigationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitNavigationSuffix(@NotNull YalParser.NavigationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#valueArgument}.
	 * @param ctx the parse tree
	 */
	void enterValueArgument(@NotNull YalParser.ValueArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#valueArgument}.
	 * @param ctx the parse tree
	 */
	void exitValueArgument(@NotNull YalParser.ValueArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#visibilityModifier}.
	 * @param ctx the parse tree
	 */
	void enterVisibilityModifier(@NotNull YalParser.VisibilityModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#visibilityModifier}.
	 * @param ctx the parse tree
	 */
	void exitVisibilityModifier(@NotNull YalParser.VisibilityModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#valueArguments}.
	 * @param ctx the parse tree
	 */
	void enterValueArguments(@NotNull YalParser.ValueArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#valueArguments}.
	 * @param ctx the parse tree
	 */
	void exitValueArguments(@NotNull YalParser.ValueArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#constructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterConstructorInvocation(@NotNull YalParser.ConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#constructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitConstructorInvocation(@NotNull YalParser.ConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(@NotNull YalParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(@NotNull YalParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void enterTypeReference(@NotNull YalParser.TypeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void exitTypeReference(@NotNull YalParser.TypeReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterLineStringLiteral(@NotNull YalParser.LineStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitLineStringLiteral(@NotNull YalParser.LineStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(@NotNull YalParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(@NotNull YalParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#enumClassBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumClassBody(@NotNull YalParser.EnumClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#enumClassBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumClassBody(@NotNull YalParser.EnumClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#fileAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterFileAnnotation(@NotNull YalParser.FileAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#fileAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitFileAnnotation(@NotNull YalParser.FileAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(@NotNull YalParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(@NotNull YalParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#infixOperation}.
	 * @param ctx the parse tree
	 */
	void enterInfixOperation(@NotNull YalParser.InfixOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#infixOperation}.
	 * @param ctx the parse tree
	 */
	void exitInfixOperation(@NotNull YalParser.InfixOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#lineStringExpression}.
	 * @param ctx the parse tree
	 */
	void enterLineStringExpression(@NotNull YalParser.LineStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#lineStringExpression}.
	 * @param ctx the parse tree
	 */
	void exitLineStringExpression(@NotNull YalParser.LineStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(@NotNull YalParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(@NotNull YalParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#companionObject}.
	 * @param ctx the parse tree
	 */
	void enterCompanionObject(@NotNull YalParser.CompanionObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#companionObject}.
	 * @param ctx the parse tree
	 */
	void exitCompanionObject(@NotNull YalParser.CompanionObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#assignmentAndOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentAndOperator(@NotNull YalParser.AssignmentAndOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#assignmentAndOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentAndOperator(@NotNull YalParser.AssignmentAndOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#prefixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterPrefixUnaryOperator(@NotNull YalParser.PrefixUnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#prefixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitPrefixUnaryOperator(@NotNull YalParser.PrefixUnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringLiteral(@NotNull YalParser.MultiLineStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringLiteral(@NotNull YalParser.MultiLineStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#postfixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnaryOperator(@NotNull YalParser.PostfixUnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#postfixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnaryOperator(@NotNull YalParser.PostfixUnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#importHeader}.
	 * @param ctx the parse tree
	 */
	void enterImportHeader(@NotNull YalParser.ImportHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#importHeader}.
	 * @param ctx the parse tree
	 */
	void exitImportHeader(@NotNull YalParser.ImportHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#unaryPrefix}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPrefix(@NotNull YalParser.UnaryPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#unaryPrefix}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPrefix(@NotNull YalParser.UnaryPrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#asExpression}.
	 * @param ctx the parse tree
	 */
	void enterAsExpression(@NotNull YalParser.AsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#asExpression}.
	 * @param ctx the parse tree
	 */
	void exitAsExpression(@NotNull YalParser.AsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#lineStringContent}.
	 * @param ctx the parse tree
	 */
	void enterLineStringContent(@NotNull YalParser.LineStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#lineStringContent}.
	 * @param ctx the parse tree
	 */
	void exitLineStringContent(@NotNull YalParser.LineStringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#functionLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFunctionLiteral(@NotNull YalParser.FunctionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#functionLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFunctionLiteral(@NotNull YalParser.FunctionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#annotationUseSiteTarget}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationUseSiteTarget(@NotNull YalParser.AnnotationUseSiteTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#annotationUseSiteTarget}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationUseSiteTarget(@NotNull YalParser.AnnotationUseSiteTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#userType}.
	 * @param ctx the parse tree
	 */
	void enterUserType(@NotNull YalParser.UserTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#userType}.
	 * @param ctx the parse tree
	 */
	void exitUserType(@NotNull YalParser.UserTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#anonymousInitializer}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousInitializer(@NotNull YalParser.AnonymousInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#anonymousInitializer}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousInitializer(@NotNull YalParser.AnonymousInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(@NotNull YalParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(@NotNull YalParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#unescapedAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterUnescapedAnnotation(@NotNull YalParser.UnescapedAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#unescapedAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitUnescapedAnnotation(@NotNull YalParser.UnescapedAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousFunction(@NotNull YalParser.AnonymousFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousFunction(@NotNull YalParser.AnonymousFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull YalParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull YalParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(@NotNull YalParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(@NotNull YalParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#classMemberDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclarations(@NotNull YalParser.ClassMemberDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#classMemberDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclarations(@NotNull YalParser.ClassMemberDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#packageHeader}.
	 * @param ctx the parse tree
	 */
	void enterPackageHeader(@NotNull YalParser.PackageHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#packageHeader}.
	 * @param ctx the parse tree
	 */
	void exitPackageHeader(@NotNull YalParser.PackageHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull YalParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull YalParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#lambdaLiteral}.
	 * @param ctx the parse tree
	 */
	void enterLambdaLiteral(@NotNull YalParser.LambdaLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#lambdaLiteral}.
	 * @param ctx the parse tree
	 */
	void exitLambdaLiteral(@NotNull YalParser.LambdaLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeModifier(@NotNull YalParser.TypeModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeModifier(@NotNull YalParser.TypeModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeConstraints}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstraints(@NotNull YalParser.TypeConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeConstraints}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstraints(@NotNull YalParser.TypeConstraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#tryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTryExpression(@NotNull YalParser.TryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#tryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTryExpression(@NotNull YalParser.TryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#parameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterParameterModifier(@NotNull YalParser.ParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#parameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitParameterModifier(@NotNull YalParser.ParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#reificationModifier}.
	 * @param ctx the parse tree
	 */
	void enterReificationModifier(@NotNull YalParser.ReificationModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#reificationModifier}.
	 * @param ctx the parse tree
	 */
	void exitReificationModifier(@NotNull YalParser.ReificationModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull YalParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull YalParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#platformModifier}.
	 * @param ctx the parse tree
	 */
	void enterPlatformModifier(@NotNull YalParser.PlatformModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#platformModifier}.
	 * @param ctx the parse tree
	 */
	void exitPlatformModifier(@NotNull YalParser.PlatformModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull YalParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull YalParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#functionModifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionModifier(@NotNull YalParser.FunctionModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#functionModifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionModifier(@NotNull YalParser.FunctionModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#elvis}.
	 * @param ctx the parse tree
	 */
	void enterElvis(@NotNull YalParser.ElvisContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#elvis}.
	 * @param ctx the parse tree
	 */
	void exitElvis(@NotNull YalParser.ElvisContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#lambdaParameter}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameter(@NotNull YalParser.LambdaParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#lambdaParameter}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameter(@NotNull YalParser.LambdaParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeModifiers}.
	 * @param ctx the parse tree
	 */
	void enterTypeModifiers(@NotNull YalParser.TypeModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeModifiers}.
	 * @param ctx the parse tree
	 */
	void exitTypeModifiers(@NotNull YalParser.TypeModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#constructorDelegationCall}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDelegationCall(@NotNull YalParser.ConstructorDelegationCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#constructorDelegationCall}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDelegationCall(@NotNull YalParser.ConstructorDelegationCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(@NotNull YalParser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(@NotNull YalParser.DisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull YalParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull YalParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#safeNav}.
	 * @param ctx the parse tree
	 */
	void enterSafeNav(@NotNull YalParser.SafeNavContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#safeNav}.
	 * @param ctx the parse tree
	 */
	void exitSafeNav(@NotNull YalParser.SafeNavContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(@NotNull YalParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(@NotNull YalParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(@NotNull YalParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(@NotNull YalParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#typeProjection}.
	 * @param ctx the parse tree
	 */
	void enterTypeProjection(@NotNull YalParser.TypeProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#typeProjection}.
	 * @param ctx the parse tree
	 */
	void exitTypeProjection(@NotNull YalParser.TypeProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull YalParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull YalParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#callableReference}.
	 * @param ctx the parse tree
	 */
	void enterCallableReference(@NotNull YalParser.CallableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#callableReference}.
	 * @param ctx the parse tree
	 */
	void exitCallableReference(@NotNull YalParser.CallableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#thisExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(@NotNull YalParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#thisExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(@NotNull YalParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#whenCondition}.
	 * @param ctx the parse tree
	 */
	void enterWhenCondition(@NotNull YalParser.WhenConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#whenCondition}.
	 * @param ctx the parse tree
	 */
	void exitWhenCondition(@NotNull YalParser.WhenConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#callSuffix}.
	 * @param ctx the parse tree
	 */
	void enterCallSuffix(@NotNull YalParser.CallSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#callSuffix}.
	 * @param ctx the parse tree
	 */
	void exitCallSuffix(@NotNull YalParser.CallSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#kotlinFile}.
	 * @param ctx the parse tree
	 */
	void enterKotlinFile(@NotNull YalParser.KotlinFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#kotlinFile}.
	 * @param ctx the parse tree
	 */
	void exitKotlinFile(@NotNull YalParser.KotlinFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#literalConstant}.
	 * @param ctx the parse tree
	 */
	void enterLiteralConstant(@NotNull YalParser.LiteralConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#literalConstant}.
	 * @param ctx the parse tree
	 */
	void exitLiteralConstant(@NotNull YalParser.LiteralConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(@NotNull YalParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(@NotNull YalParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_(@NotNull YalParser.Type_Context ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_(@NotNull YalParser.Type_Context ctx);
	/**
	 * Enter a parse tree produced by {@link YalParser#multiLineStringExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringExpression(@NotNull YalParser.MultiLineStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalParser#multiLineStringExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringExpression(@NotNull YalParser.MultiLineStringExpressionContext ctx);
}