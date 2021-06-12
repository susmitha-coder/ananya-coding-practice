package in.susmitha.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UglyNumberTest {

@Test
public void testCaseLegalInputTrue() {
    UglyNumber pn = new UglyNumber();
    Assertions.assertEquals(true, pn.isUgly(6));
}

    @Test
    public void testCaseLegalInputFalse(){
        UglyNumber pn = new UglyNumber();
        Assertions.assertEquals(false, pn.isUgly(14));
    }


}