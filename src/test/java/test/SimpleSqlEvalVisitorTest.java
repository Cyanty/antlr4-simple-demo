package test;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.example.antlr4.generated.simplesql.SimpleSqlLexer;
import org.example.antlr4.generated.simplesql.SimpleSqlParser;
import org.example.antlr4.visitor.SimpleSqlEvalVisitor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleSqlEvalVisitorTest {

    private final Map<String, List<Map<String, Object>>> database = new HashMap<String, List<Map<String, Object>>>();

    @BeforeEach
    public void setupTest() {
        execute("INSERT INTO users (id, name, age) VALUES (1, 'Alice', 30);");
        execute("INSERT INTO users (id, name, age) VALUES (2, 'Bob', 25);");
        execute("INSERT INTO users (id, name, age) VALUES (3, 'Charlie', 35);");
    }

    @Test
    public void testSimpleSqlInsert() {
        for (Map<String, Object> user : database.get("users")) {
            Integer id = (Integer) user.get("id");
            if (id == 1) {
                assertEquals("Alice", user.get("name"));
                assertEquals(30, user.get("age"));
            } else if (id == 2) {
                assertEquals("Bob", user.get("name"));
                assertEquals(25, user.get("age"));
            } else if (id == 3) {
                assertEquals("Charlie", user.get("name"));
                assertEquals(35, user.get("age"));
            } else {
                fail("Invalid id");
            }
        }

        printResults(database.get("users"));
    }

    @Test
    public void testSimpleSqlSelect() {
        String expr = "select * from users where id = 1";
        List<Map<String, Object>> users = (List<Map<String, Object>>) execute(expr);
        assertEquals(1, users.size());
        assertEquals(1, users.get(0).get("id"));
        assertEquals("Alice", users.get(0).get("name"));
        assertEquals(30, users.get(0).get("age"));

        printResults(users);
    }

    @Test
    public void testSimpleSqlSelect2() {
        String expr = "select name, age from users where id = 1";
        List<Map<String, Object>> users = (List<Map<String, Object>>) execute(expr);
        assertEquals(1, users.size());
        assertNull(users.get(0).get("id"));
        assertEquals("Alice", users.get(0).get("name"));
        assertEquals(30, users.get(0).get("age"));

        printResults(users);
    }

    @Test
    public void testSimpleSqlUpdate() {
        String expr = "update users set name = 'Dylan' where id = 1";
        Object result = execute(expr);
        assertEquals(1, result);
        assertEquals("Dylan", database.get("users").get(0).get("name"));

        printResults(database.get("users"));
    }

    @Test
    public void testSimpleSqlDelete() {
        String expr = "delete from users where id = 1";
        Object result = execute(expr);
        assertEquals(1, result);
        assertEquals(2, database.get("users").size());
        assertEquals(2, database.get("users").get(0).get("id"));

        printResults(database.get("users"));
    }

    private Object execute(String expr) {
        SimpleSqlLexer lexer = new SimpleSqlLexer(CharStreams.fromString(expr));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SimpleSqlParser parser = new SimpleSqlParser(tokenStream);

        SimpleSqlParser.StatementContext tree = parser.statement();
        SimpleSqlEvalVisitor eval = new SimpleSqlEvalVisitor(database);
        return eval.visit(tree);
    }

    // 输出表格形式的行记录
    private void printResults(List<Map<String, Object>> results) {
        if (results == null || results.isEmpty()) {
            System.out.println("[] (0 rows)");
            return;
        }

        results.get(0).keySet().forEach(key -> System.out.printf("%-15s", key));
        System.out.println();
        System.out.println("---------------------------------------------");

        for (Map<String, Object> row : results) {
            row.values().forEach(val -> System.out.printf("%-15s", val));
            System.out.println();
        }
        System.out.printf("(%d rows)\n", results.size());
    }
}
