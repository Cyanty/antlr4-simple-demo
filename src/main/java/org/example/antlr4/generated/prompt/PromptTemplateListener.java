package org.example.antlr4.generated.prompt;// Generated from PromptTemplate.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PromptTemplateParser}.
 */
public interface PromptTemplateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PromptTemplateParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(PromptTemplateParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PromptTemplateParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(PromptTemplateParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PromptTemplateParser#segment}.
	 * @param ctx the parse tree
	 */
	void enterSegment(PromptTemplateParser.SegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PromptTemplateParser#segment}.
	 * @param ctx the parse tree
	 */
	void exitSegment(PromptTemplateParser.SegmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PromptTemplateParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PromptTemplateParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PromptTemplateParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PromptTemplateParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PromptTemplateParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(PromptTemplateParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link PromptTemplateParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(PromptTemplateParser.TextContext ctx);
}