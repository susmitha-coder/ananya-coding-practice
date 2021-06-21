package in.susmitha.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageSalaryTest {



    @Test
    public void testCaseLegalInput() {
        AverageSalary av = new AverageSalary();
        int arr1[] = {400, 300, 200, 100};
        double result = av.average(arr1);
        Assertions.assertEquals(250.00000, result);


    }
}