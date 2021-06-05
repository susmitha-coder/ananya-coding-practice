package in.susmitha.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MaximumPopulationYearTest {

    @Test
    public void testcaseMoreYears(){
        MaximumPopulation max = new MaximumPopulation();
        int mat1[][] = {{1993,1999},{2001,2010}};
        int result = max.maximumPopulation(mat1);
        Assertions.assertEquals(1993, result);

    }

    @Test
    public void testcaseEmptyYears(){
        MaximumPopulation max = new MaximumPopulation();
        int years[][] = {{}};
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> max.maximumPopulation(years));
        Assertions.assertEquals("Empty Matrix not allowed", exception.getMessage());

    }
}