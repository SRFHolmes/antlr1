// Generated from D:/antlr\TestCPPPaser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TestCPPPaser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TestCPPPaserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(TestCPPPaser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(TestCPPPaser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#idExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpression(TestCPPPaser.IdExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#unqualifiedId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnqualifiedId(TestCPPPaser.UnqualifiedIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#qualifiedId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedId(TestCPPPaser.QualifiedIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#nestedNameSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedNameSpecifier(TestCPPPaser.NestedNameSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(TestCPPPaser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#lambdaIntroducer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaIntroducer(TestCPPPaser.LambdaIntroducerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#lambdaCapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaCapture(TestCPPPaser.LambdaCaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#captureDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaptureDefault(TestCPPPaser.CaptureDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#captureList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaptureList(TestCPPPaser.CaptureListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture(TestCPPPaser.CaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#simpleCapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCapture(TestCPPPaser.SimpleCaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#initcapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitcapture(TestCPPPaser.InitcaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#lambdaDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaDeclarator(TestCPPPaser.LambdaDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(TestCPPPaser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#typeIdOfTheTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdOfTheTypeId(TestCPPPaser.TypeIdOfTheTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(TestCPPPaser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#pseudoDestructorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoDestructorName(TestCPPPaser.PseudoDestructorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(TestCPPPaser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(TestCPPPaser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#newExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(TestCPPPaser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#newPlacement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewPlacement(TestCPPPaser.NewPlacementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#newTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewTypeId(TestCPPPaser.NewTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#newDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewDeclarator(TestCPPPaser.NewDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#noPointerNewDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPointerNewDeclarator(TestCPPPaser.NoPointerNewDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#newInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewInitializer(TestCPPPaser.NewInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#deleteExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteExpression(TestCPPPaser.DeleteExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#noExceptExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoExceptExpression(TestCPPPaser.NoExceptExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(TestCPPPaser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#pointerMemberExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerMemberExpression(TestCPPPaser.PointerMemberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(TestCPPPaser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(TestCPPPaser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(TestCPPPaser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#shiftOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftOperator(TestCPPPaser.ShiftOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(TestCPPPaser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(TestCPPPaser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(TestCPPPaser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(TestCPPPaser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(TestCPPPaser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(TestCPPPaser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(TestCPPPaser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(TestCPPPaser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(TestCPPPaser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(TestCPPPaser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TestCPPPaser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(TestCPPPaser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TestCPPPaser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(TestCPPPaser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(TestCPPPaser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(TestCPPPaser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#statementSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSeq(TestCPPPaser.StatementSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(TestCPPPaser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(TestCPPPaser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(TestCPPPaser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#forInitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitStatement(TestCPPPaser.ForInitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#forRangeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForRangeDeclaration(TestCPPPaser.ForRangeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#forRangeInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForRangeInitializer(TestCPPPaser.ForRangeInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(TestCPPPaser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#declarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(TestCPPPaser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#declarationseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationseq(TestCPPPaser.DeclarationseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(TestCPPPaser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#blockDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockDeclaration(TestCPPPaser.BlockDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#aliasDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasDeclaration(TestCPPPaser.AliasDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#simpleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDeclaration(TestCPPPaser.SimpleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticAssertDeclaration(TestCPPPaser.StaticAssertDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#emptyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyDeclaration(TestCPPPaser.EmptyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#attributeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeDeclaration(TestCPPPaser.AttributeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#declSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclSpecifier(TestCPPPaser.DeclSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#declSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclSpecifierSeq(TestCPPPaser.DeclSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(TestCPPPaser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpecifier(TestCPPPaser.FunctionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(TestCPPPaser.TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(TestCPPPaser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#trailingTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingTypeSpecifier(TestCPPPaser.TrailingTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#typeSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifierSeq(TestCPPPaser.TypeSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#trailingTypeSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingTypeSpecifierSeq(TestCPPPaser.TrailingTypeSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#simpleTypeLengthModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeLengthModifier(TestCPPPaser.SimpleTypeLengthModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#simpleTypeSignednessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeSignednessModifier(TestCPPPaser.SimpleTypeSignednessModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#simpleTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeSpecifier(TestCPPPaser.SimpleTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#theTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheTypeName(TestCPPPaser.TheTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#decltypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecltypeSpecifier(TestCPPPaser.DecltypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#elaboratedTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElaboratedTypeSpecifier(TestCPPPaser.ElaboratedTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#enumName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumName(TestCPPPaser.EnumNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(TestCPPPaser.EnumSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#enumHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumHead(TestCPPPaser.EnumHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#opaqueEnumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpaqueEnumDeclaration(TestCPPPaser.OpaqueEnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#enumkey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumkey(TestCPPPaser.EnumkeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#enumbase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumbase(TestCPPPaser.EnumbaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(TestCPPPaser.EnumeratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#enumeratorDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorDefinition(TestCPPPaser.EnumeratorDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(TestCPPPaser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#namespaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceName(TestCPPPaser.NamespaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#originalNamespaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOriginalNamespaceName(TestCPPPaser.OriginalNamespaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#namespaceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceDefinition(TestCPPPaser.NamespaceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#namespaceAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceAlias(TestCPPPaser.NamespaceAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#namespaceAliasDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceAliasDefinition(TestCPPPaser.NamespaceAliasDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiednamespacespecifier(TestCPPPaser.QualifiednamespacespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#usingDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingDeclaration(TestCPPPaser.UsingDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#usingDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingDirective(TestCPPPaser.UsingDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#asmDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsmDefinition(TestCPPPaser.AsmDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#linkageSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkageSpecification(TestCPPPaser.LinkageSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#attributeSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSpecifierSeq(TestCPPPaser.AttributeSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#attributeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSpecifier(TestCPPPaser.AttributeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#alignmentspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignmentspecifier(TestCPPPaser.AlignmentspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#attributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeList(TestCPPPaser.AttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(TestCPPPaser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#attributeNamespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeNamespace(TestCPPPaser.AttributeNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#attributeArgumentClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeArgumentClause(TestCPPPaser.AttributeArgumentClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#balancedTokenSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalancedTokenSeq(TestCPPPaser.BalancedTokenSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#balancedtoken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalancedtoken(TestCPPPaser.BalancedtokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(TestCPPPaser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(TestCPPPaser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(TestCPPPaser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#pointerDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerDeclarator(TestCPPPaser.PointerDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#noPointerDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPointerDeclarator(TestCPPPaser.NoPointerDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#parametersAndQualifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersAndQualifiers(TestCPPPaser.ParametersAndQualifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#trailingReturnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingReturnType(TestCPPPaser.TrailingReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#pointerOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerOperator(TestCPPPaser.PointerOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#cvqualifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCvqualifierseq(TestCPPPaser.CvqualifierseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#cvQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCvQualifier(TestCPPPaser.CvQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#refqualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefqualifier(TestCPPPaser.RefqualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#declaratorid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaratorid(TestCPPPaser.DeclaratoridContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#theTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheTypeId(TestCPPPaser.TheTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclarator(TestCPPPaser.AbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#pointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerAbstractDeclarator(TestCPPPaser.PointerAbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#noPointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPointerAbstractDeclarator(TestCPPPaser.NoPointerAbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#abstractPackDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractPackDeclarator(TestCPPPaser.AbstractPackDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#noPointerAbstractPackDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPointerAbstractPackDeclarator(TestCPPPaser.NoPointerAbstractPackDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#parameterDeclarationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarationClause(TestCPPPaser.ParameterDeclarationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarationList(TestCPPPaser.ParameterDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(TestCPPPaser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(TestCPPPaser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(TestCPPPaser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(TestCPPPaser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#braceOrEqualInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraceOrEqualInitializer(TestCPPPaser.BraceOrEqualInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#initializerClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerClause(TestCPPPaser.InitializerClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(TestCPPPaser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#bracedInitList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedInitList(TestCPPPaser.BracedInitListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(TestCPPPaser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#classSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSpecifier(TestCPPPaser.ClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#classHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHead(TestCPPPaser.ClassHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#classHeadName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHeadName(TestCPPPaser.ClassHeadNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#classVirtSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVirtSpecifier(TestCPPPaser.ClassVirtSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#classKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassKey(TestCPPPaser.ClassKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#memberSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberSpecification(TestCPPPaser.MemberSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#memberdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberdeclaration(TestCPPPaser.MemberdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#memberDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaratorList(TestCPPPaser.MemberDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#memberDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclarator(TestCPPPaser.MemberDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#virtualSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtualSpecifierSeq(TestCPPPaser.VirtualSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#virtualSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtualSpecifier(TestCPPPaser.VirtualSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#pureSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPureSpecifier(TestCPPPaser.PureSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#baseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseClause(TestCPPPaser.BaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#baseSpecifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseSpecifierList(TestCPPPaser.BaseSpecifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#baseSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseSpecifier(TestCPPPaser.BaseSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#classOrDeclType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrDeclType(TestCPPPaser.ClassOrDeclTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#baseTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseTypeSpecifier(TestCPPPaser.BaseTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#accessSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessSpecifier(TestCPPPaser.AccessSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#conversionFunctionId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversionFunctionId(TestCPPPaser.ConversionFunctionIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#conversionTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversionTypeId(TestCPPPaser.ConversionTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#conversionDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversionDeclarator(TestCPPPaser.ConversionDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#constructorInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorInitializer(TestCPPPaser.ConstructorInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#memInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemInitializerList(TestCPPPaser.MemInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#memInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemInitializer(TestCPPPaser.MemInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#meminitializerid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeminitializerid(TestCPPPaser.MeminitializeridContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#operatorFunctionId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorFunctionId(TestCPPPaser.OperatorFunctionIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#literalOperatorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralOperatorId(TestCPPPaser.LiteralOperatorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#templateDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateDeclaration(TestCPPPaser.TemplateDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#templateparameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateparameterList(TestCPPPaser.TemplateparameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#templateParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateParameter(TestCPPPaser.TemplateParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(TestCPPPaser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#simpleTemplateId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTemplateId(TestCPPPaser.SimpleTemplateIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#templateId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateId(TestCPPPaser.TemplateIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#templateName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateName(TestCPPPaser.TemplateNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#templateArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateArgumentList(TestCPPPaser.TemplateArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#templateArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateArgument(TestCPPPaser.TemplateArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#typeNameSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNameSpecifier(TestCPPPaser.TypeNameSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#explicitInstantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitInstantiation(TestCPPPaser.ExplicitInstantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#explicitSpecialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitSpecialization(TestCPPPaser.ExplicitSpecializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#tryBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryBlock(TestCPPPaser.TryBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#functionTryBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTryBlock(TestCPPPaser.FunctionTryBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#handlerSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerSeq(TestCPPPaser.HandlerSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandler(TestCPPPaser.HandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#exceptionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionDeclaration(TestCPPPaser.ExceptionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#throwExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowExpression(TestCPPPaser.ThrowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#exceptionSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionSpecification(TestCPPPaser.ExceptionSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#dynamicExceptionSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicExceptionSpecification(TestCPPPaser.DynamicExceptionSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#typeIdList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdList(TestCPPPaser.TypeIdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#twoDimensionalArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoDimensionalArray(TestCPPPaser.TwoDimensionalArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#threeDimensionalArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThreeDimensionalArray(TestCPPPaser.ThreeDimensionalArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#noeExceptSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoeExceptSpecification(TestCPPPaser.NoeExceptSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#twoLoopAndTwoDimensionalArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoLoopAndTwoDimensionalArray(TestCPPPaser.TwoLoopAndTwoDimensionalArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#threeLoopAndThreeDimensionalArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThreeLoopAndThreeDimensionalArray(TestCPPPaser.ThreeLoopAndThreeDimensionalArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#expressionWithArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionWithArray(TestCPPPaser.ExpressionWithArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#continuousLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinuousLoop(TestCPPPaser.ContinuousLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#loopDistribution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopDistribution(TestCPPPaser.LoopDistributionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#branchNestedLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranchNestedLoop(TestCPPPaser.BranchNestedLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#theOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheOperator(TestCPPPaser.TheOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestCPPPaser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(TestCPPPaser.LiteralContext ctx);
}