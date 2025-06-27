package org.example.antlr4.visitor;

import org.antlr.v4.runtime.tree.ParseTree;
import org.example.antlr4.generated.simplesql.SimpleSqlBaseVisitor;
import org.example.antlr4.generated.simplesql.SimpleSqlParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SimpleSqlEvalVisitor extends SimpleSqlBaseVisitor<Object> {
    private final static Logger log = LoggerFactory.getLogger(SimpleSqlEvalVisitor.class);

    // 数据库: Map<表名, 表>
    private final Map<String, List<Map<String, Object>>> database;

    public SimpleSqlEvalVisitor(Map<String, List<Map<String, Object>>> database) {
        this.database = database;
    }

    @Override
    public Object visitInsertStatement(SimpleSqlParser.InsertStatementContext ctx) {
        // 获取表名，如果表不存在则自动创建
        String tableName = ctx.tableName.getText();
        database.putIfAbsent(tableName, new ArrayList<>());
        List<Map<String, Object>> table = database.get(tableName);

        // 获取列名字段
        List<String> columns = ctx.columns.ID().stream()
                .map(ParseTree::getText)
                .collect(Collectors.toList());

        // 获取VALUES值
        List<Object> values = ctx.values.value().stream()
                .map(this::visitValue) // 使用 visitValue 方法转换值
                .collect(Collectors.toList());

        if (columns.size() != values.size()) {
            throw new RuntimeException("列的数量和值的数量不匹配!");
        }

        // 创建新行
        Map<String, Object> newRow = new HashMap<>();
        for (int i = 0; i < columns.size(); i++) {
            newRow.put(columns.get(i), values.get(i));
        }

        // 插入新行
        table.add(newRow);
        log.info("表 {} 成功插入1行", tableName);
        return 1;
    }

    @Override
    public Object visitSelectStatement(SimpleSqlParser.SelectStatementContext ctx) {
        String tableName = ctx.tableName.getText();
        List<Map<String, Object>> table = database.get(tableName);

        if (table == null) {
            log.info("表 {} 不存在", tableName);
            return new ArrayList<>();
        }

        // 构建WHERE条件的过滤器
        Predicate<Map<String, Object>> whereFilter = row -> true; // 默认不过滤
        if (ctx.whereClause() != null) {
            whereFilter = createPredicate(ctx.whereClause().expression());
        }

        // 构建行数据的结果集
        List<Map<String, Object>> results = new ArrayList<>();
        for (Map<String, Object> row : table) {
            if (whereFilter.test(row)) {
                Map<String, Object> resultRow = new HashMap<>();
                if (ctx.columns.getText().equals("*")) {
                    resultRow.putAll(row);
                } else {
                    SimpleSqlParser.IdListContext idCtx = ctx.columns.idList();
                    for (org.antlr.v4.runtime.tree.TerminalNode idNode : idCtx.ID()) {
                        String colName = idNode.getText();
                        resultRow.put(colName, row.get(colName));
                    }
                }
                results.add(resultRow);
            }
        }
        return results;
    }

    @Override
    public Object visitUpdateStatement(SimpleSqlParser.UpdateStatementContext ctx) {
        String tableName = ctx.tableName.getText();
        List<Map<String, Object>> table = database.get(tableName);
        if (table == null) return 0;

        Predicate<Map<String, Object>> whereFilter = row -> true; // 如果没有WHERE，更新所有行
        if (ctx.whereClause() != null) {
            whereFilter = createPredicate(ctx.whereClause().expression());
        }

        int updatedCount = 0;
        for (Map<String, Object> row : table) {
            if (whereFilter.test(row)) {
                for (SimpleSqlParser.AssignmentContext assignmentCtx : ctx.assignments().assignment()) {
                    String colName = assignmentCtx.ID().getText();
                    Object value = visitValue(assignmentCtx.value());
                    row.put(colName, value);
                }
                updatedCount++;
            }
        }
        log.info("表 {} 成功更新 {} 行", tableName, updatedCount);
        return updatedCount;
    }

    @Override
    public Object visitDeleteStatement(SimpleSqlParser.DeleteStatementContext ctx) {
        String tableName = ctx.tableName.getText();
        List<Map<String, Object>> table = database.get(tableName);
        if (table == null) return 0;

        Predicate<Map<String, Object>> whereFilter = row -> true;
        if (ctx.whereClause() != null) {
            whereFilter = createPredicate(ctx.whereClause().expression());
        }

        int originalSize = table.size();
        table.removeIf(whereFilter);
        int deletedCount = originalSize - table.size();

        log.info("表 {} 成功删除 {} 行", tableName, deletedCount);
        return deletedCount;
    }

    // 将 value节点 转换为对象
    @Override
    public Object visitValue(SimpleSqlParser.ValueContext ctx) {
        if (ctx.STRING() != null) {
            String str = ctx.STRING().getText();
            return str.substring(1, str.length() - 1); // 去掉首尾的单引号
        }
        if (ctx.NUMBER() != null) {
            String numStr = ctx.NUMBER().getText();
            return Integer.parseInt(numStr); // 简单处理，仅支持整型
        }
        return null;
    }

    // 根据表达式创建用于过滤的 Predicate
    private Predicate<Map<String, Object>> createPredicate(SimpleSqlParser.ExpressionContext expr) {
        String column = expr.left.getText();
        String op = expr.op.getText();
        Object value = visitValue(expr.right);

        return row -> {
            Object rowValue = row.get(column);
            if (rowValue == null) return false;

            // 简单实现，只比较Integer类型
            if (rowValue instanceof Integer && value instanceof Integer) {
                int rowInt = (Integer) rowValue;
                int filterInt = (Integer) value;
                switch (op) {
                    case "=": return rowInt == filterInt;
                    case "!=": return rowInt != filterInt;
                    case ">": return rowInt > filterInt;
                    case "<": return rowInt < filterInt;
                    case ">=": return rowInt >= filterInt;
                    case "<=": return rowInt <= filterInt;
                    default: return false;
                }
            }

            if (rowValue instanceof String && value instanceof String) {
                if ("=".equals(op)) {
                    return rowValue.equals(value);
                }
                if ("!=".equals(op)) {
                    return !rowValue.equals(value);
                }
            }
            return false;
        };
    }

}
