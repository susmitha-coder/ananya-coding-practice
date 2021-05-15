package in.susmitha.simple_interpreter_part_two.service;

import in.susmitha.simple_interpreter_part_two.service.service.Expr;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class ExprTest {

    @Test
    public void testCaseEvalPlus() {
        Expr expr = new Expr();
        int result = expr.evaluate("10 + 10");
        Assertions.assertEquals(20,result);
    }

    @Test
    public void testCaseEvalMinus() {
        Expr expr = new Expr();
        int result = expr.evaluate("20 - 10");
        Assertions.assertEquals(10,result);
    }

    @Test
    public void testCaseEvalMutliply() {
        Expr expr = new Expr();
        int result = expr.evaluate("10 * 10");
        Assertions.assertEquals(100,result);
    }

    @Test
    public void testCaseEvalDivision() {
        Expr expr = new Expr();
        int result = expr.evaluate("100 / 10");
        Assertions.assertEquals(10,result);
    }

    @Test
    public void testCaseEvalIllegalInput() {
        // set up user
        Expr expr = new Expr();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> expr.evaluate("+1023"));
        Assertions.assertEquals("The input is invalid : Valid is : <int>operator<int> where <int> cab be any digit " +
                "and allowed operators are [+,-,*,/]", exception.getMessage());
    }

    @Test
    public void testCaseZeroDivideError() {
        Expr expr = new Expr();
        Throwable exception = Assertions.assertThrows( IllegalArgumentException.class,
                () -> expr.evaluate("20/0"));
        Assertions.assertEquals("The input is invalid : Valid is : <int>/<int> where second <int> should be a value greater than zero", exception.getMessage());
//        int result = expr.evaluate("20/0");
//        Assertions.assertEquals(0,0);






    }

    @Test
    public void testCasePassingNullAsArgument() {
        Expr expr = new Expr();
        Throwable exception = Assertions.assertThrows( IllegalArgumentException.class,
                () -> expr.evaluate(null));
        Assertions.assertEquals("null value not allowed", exception.getMessage());
//        int result = expr.evaluate("20/0");
//        Assertions.assertEquals(0,0);
//        expr.evaluate(null);







    }


    @Test
    public void testCasePassingEmptyStringAsInput() {
        Expr expr = new Expr();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> expr.evaluate(""));
        Assertions.assertEquals("Empty String not allowed", exception.getMessage());

    }


}


