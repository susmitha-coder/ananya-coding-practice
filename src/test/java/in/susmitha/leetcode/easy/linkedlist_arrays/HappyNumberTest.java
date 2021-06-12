package in.susmitha.leetcode.easy.linkedlist_arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HappyNumberTest {
    @Test
    public void testCaseLegalInputFalse() {
        HappyNumber un = new HappyNumber();
        boolean result = un.isHappy(9);
        Assertions.assertEquals(false, result);
    }
    @Test
    public void testCaseLegalInputTrue() {
        HappyNumber un = new HappyNumber();
        boolean result = un.isHappy(7);
        Assertions.assertEquals(true, result);
    }

}
