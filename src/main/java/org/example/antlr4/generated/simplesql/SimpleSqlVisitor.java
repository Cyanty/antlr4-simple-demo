package org.example.antlr4.generated.simplesql;// Generated from SimpleSql.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleSqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimpleSqlParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSqlParser#insertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatement(SimpleSqlParser.InsertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSqlParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(SimpleSqlParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSqlParser#updateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStatement(SimpleSqlParser.UpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSqlParser#deleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(SimpleSqlParser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSqlParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(SimpleSqlParser.IdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSqlParser#valueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(SimpleSqlParser.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSqlParser#selectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectList(SimpleSqlParser.SelectListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSqlParser#assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignments(SimpleSqlParser.AssignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSqlParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SimpleSqlParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSqlParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(SimpleSqlParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SimpleSqlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SimpleSqlParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SimpleSqlParser.ComparisonOperatorContext ctx);
}