package test;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.antlr4.generated.prompt.PromptTemplateLexer;
import org.example.antlr4.generated.prompt.PromptTemplateParser;
import org.example.antlr4.visitor.PromptTemplateEvalVisitor;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class PromptTemplateEvalVisitorTest {
    @Test
    public void testPromptTemplateEval() {
       String template = "Go go go {word_a} 黑咖啡{word_b}有多浓 我只要汽水的{word_c}";

       CharStream input = CharStreams.fromString(template);
       PromptTemplateLexer lexer = new PromptTemplateLexer(input);
       TokenStream tokens = new CommonTokenStream(lexer);
       PromptTemplateParser parser = new PromptTemplateParser(tokens);

       ParseTree tree = parser.template();

       Map<String, Object> context = new HashMap<>();
       context.put("word_a", "出发喽~");
       context.put("word_b", "品味");
       context.put("word_c", "轻松~!");

       PromptTemplateEvalVisitor renderer = new PromptTemplateEvalVisitor(context);
       String result = renderer.visit(tree);

       System.out.println(result);
       assert "Go go go 出发喽~ 黑咖啡品味有多浓 我只要汽水的轻松~!".equals(result);
   }

}
