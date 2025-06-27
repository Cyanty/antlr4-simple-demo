package test;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.example.antlr4.generated.calculator.CalculatorLexer;
import org.example.antlr4.generated.calculator.CalculatorParser;
import org.example.antlr4.visitor.CalculatorEvalVisitor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorEvalVisitorTest {

    @Test
    public void testSimpleCalculate() {
        final String expr = "1+2*3+1\n";
        Number result = calculate(expr);
        assertEquals(8, result);
    }

    @Test
    public void testComplexCalculate() {
        final String expr = "6/(1+1)\n";
        Number result = calculate(expr);
        assertEquals(3, result);
    }

    @Test
    public void testDoubleCalculate(){
        final String expr = "1.3+2.2\n";
        Number result = calculate(expr);
        assertEquals(3.5, result);
    }

    @Test
    public void testAlgebraicCalculate(){
        final String expr = "a=1.3\n" +
                "b=3.1\n" +
                "c=7\n" +
                "a+b*(c-5)\n";
        Number result = calculate(expr);
        assertEquals(7.5, result);
    }

    private Number calculate(String expr) {
        CalculatorLexer lexer = new CalculatorLexer(CharStreams.fromString(expr));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokenStream);

        CalculatorParser.ProgContext tree = parser.prog();
        CalculatorEvalVisitor eval = new CalculatorEvalVisitor();
        return eval.visit(tree);
    }
}
