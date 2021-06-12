package in.susmitha.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {

    @Test
    public void testCaseLegalInputTrue(){
        PalindromeNumber pn = new PalindromeNumber();
        Assertions.assertEquals(true,pn.isPalindrome(121));


    }
    @Test
    public void testCaseLegalInputFalse(){
        PalindromeNumber pn = new PalindromeNumber();
        Assertions.assertEquals(false,pn.isPalindrome(1211));


    }

}
