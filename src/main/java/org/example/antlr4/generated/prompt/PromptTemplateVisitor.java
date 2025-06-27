package org.example.antlr4.generated.prompt;// Generated from PromptTemplate.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PromptTemplateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PromptTemplateVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PromptTemplateParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(PromptTemplateParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PromptTemplateParser#segment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment(PromptTemplateParser.SegmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PromptTemplateParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PromptTemplateParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PromptTemplateParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(PromptTemplateParser.TextContext ctx);
}