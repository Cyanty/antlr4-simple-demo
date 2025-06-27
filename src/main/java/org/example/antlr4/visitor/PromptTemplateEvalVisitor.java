package org.example.antlr4.visitor;

import org.example.antlr4.generated.prompt.PromptTemplateBaseVisitor;
import org.example.antlr4.generated.prompt.PromptTemplateParser;

import java.util.Map;

public class PromptTemplateEvalVisitor extends PromptTemplateBaseVisitor<String> {

    private final Map<String, Object> context;

    public PromptTemplateEvalVisitor(Map<String, Object> context) {
        this.context = context;
    }

    @Override
    public String visitTemplate(PromptTemplateParser.TemplateContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (org.antlr.v4.runtime.tree.ParseTree child : ctx.children) {
            sb.append(visit(child));
        }
        return sb.toString();
    }

    @Override
    public String visitText(PromptTemplateParser.TextContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitVariable(PromptTemplateParser.VariableContext ctx) {
        String varName = ctx.ID().getText();
        Object value = context.get(varName);
        return value != null ? value.toString() : "";
    }

}
