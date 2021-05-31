package in.susmitha.leetcode.easy.linkedlist_arrays;

import in.susmitha.simple_interpreter_part_two.service.service.Expr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareIsWhiteTest {
    @Test
    public void testCasePassingNullAsArgument() {
        SquareIsWhite sq = new  SquareIsWhite();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () ->  sq.squareIsWhite(null));
        Assertions.assertEquals("Null value not allowed", exception.getMessage());

    }

    @Test
    public void testCasePassingEmptyStringAsInput() {
        SquareIsWhite sq = new  SquareIsWhite();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () ->  sq. squareIsWhite(""));
        Assertions.assertEquals("Empty String not allowed", exception.getMessage());

    }
}
