package org.example.antlr4.visitor;

import org.example.antlr4.generated.calculator.CalculatorBaseVisitor;
import org.example.antlr4.generated.calculator.CalculatorParser;

import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleBinaryOperator;

public class CalculatorEvalVisitor extends CalculatorBaseVisitor<Number> {

    private final Map<String, Number> memory = new HashMap<>();

    private final MathTool mathTool = new MathTool();

    @Override
    public Number visitExpression(CalculatorParser.ExpressionContext ctx) {
        if (ctx.expr() != null) {
            return visit(ctx.expr());
        }
        return super.visitExpression(ctx);
    }

    @Override
    public Number visitAssign(CalculatorParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        Number value = visit(ctx.expr());
        memory.put(id, value);
        return value;
    }

    @Override
    public Number visitNum(CalculatorParser.NumContext ctx) {
        String numberValue = ctx.number().getText();
        if (numberValue.contains(".")) {
            return Double.parseDouble(numberValue);
        }
        return Integer.parseInt(numberValue);
    }

    @Override
    public Number visitId(CalculatorParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (memory.containsKey(id)) {
            return memory.get(id);
        }
        return 0;
    }

    @Override
    public Number visitMulDiv(CalculatorParser.MulDivContext ctx) {
        Number left = visit(ctx.expr(0));
        Number right = visit(ctx.expr(1));
        if (ctx.op.getType() == CalculatorParser.MUL) {
            return mathTool.mul(left, right);
        }
        return mathTool.div(left, right);
    }

    @Override
    public Number visitAddSub(CalculatorParser.AddSubContext ctx) {
        Number left = visit(ctx.expr(0));
        Number right = visit(ctx.expr(1));
        if (ctx.op.getType() == CalculatorParser.Add) {
            return mathTool.add(left, right);
        }
        return mathTool.sub(left, right);
    }

    @Override
    public Number visitParens(CalculatorParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    public static class MathTool {
        public Number mul(Number left, Number right) {
            return operate(OperationType.MULTIPLY, left, right);
        }

        public Number div(Number left, Number right) {
            return operate(OperationType.DIVIDE, left, right);
        }

        public Number add(Number left, Number right) {
            return operate(OperationType.ADD, left, right);
        }

        public Number sub(Number left, Number right) {
            return operate(OperationType.SUBTRACT, left, right);
        }

        private Number operate(OperationType opType, Number left, Number right) {
            if (left instanceof Integer && right instanceof Integer) {
                return (int) opType.apply(left.intValue(), right.intValue());
            }
            return opType.apply(left.doubleValue(), right.doubleValue());
        }
    }

    private enum OperationType {
        MULTIPLY((a, b) -> a * b),
        DIVIDE((a, b) -> a / b),
        ADD((a, b) -> a + b),
        SUBTRACT((a, b) -> a - b);

        private final DoubleBinaryOperator operation;

        OperationType(DoubleBinaryOperator operation) {
            this.operation = operation;
        }

        public double apply(double a, double b) {
            return operation.applyAsDouble(a, b);
        }
    }

}
