package org.example.antlr4.generated.simplesql;// Generated from SimpleSql.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleSqlParser}.
 */
public interface SimpleSqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleSqlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleSqlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSqlParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatement(SimpleSqlParser.InsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSqlParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatement(SimpleSqlParser.InsertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(SimpleSqlParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(SimpleSqlParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSqlParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStatement(SimpleSqlParser.UpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSqlParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStatement(SimpleSqlParser.UpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSqlParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(SimpleSqlParser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSqlParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(SimpleSqlParser.DeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSqlParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(SimpleSqlParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSqlParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(SimpleSqlParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSqlParser#valueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(SimpleSqlParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSqlParser#valueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(SimpleSqlParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSqlParser#selectList}.
	 * @param ctx the parse tree
	 */
	void enterSelectList(SimpleSqlParser.SelectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSqlParser#selectList}.
	 * @param ctx the parse tree
	 */
	void exitSelectList(SimpleSqlParser.SelectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSqlParser#assignments}.
	 * @param ctx the parse tree
	 */
	void enterAssignments(SimpleSqlParser.AssignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSqlParser#assignments}.
	 * @param ctx the parse tree
	 */
	void exitAssignments(SimpleSqlParser.AssignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSqlParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SimpleSqlParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSqlParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SimpleSqlParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(SimpleSqlParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(SimpleSqlParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SimpleSqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SimpleSqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SimpleSqlParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SimpleSqlParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SimpleSqlParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SimpleSqlParser.ComparisonOperatorContext ctx);
}