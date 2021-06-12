package in.susmitha.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerOfThreeTest {

    @Test
    public  void testCaseLegalInput(){
        PowerOfThree pt = new PowerOfThree();
        boolean result = pt.isPowerOfThree(5);
        Assertions.assertEquals(false ,result);
    }
    @Test
    public  void testCaseLegalInputTrue(){
        PowerOfThree pt = new PowerOfThree();
        boolean result = pt.isPowerOfThree(3);
        Assertions.assertEquals(true,result);
    }
}
