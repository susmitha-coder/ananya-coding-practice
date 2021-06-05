package in.susmitha.leetcode.easy.linkedlist_arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DiagonalSumTest {
    @Test
    public void testCaseLegalInput(){
        DiagonalSum mat = new DiagonalSum();
        int mat1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int result = mat.diagonalSum(mat1);
        Assertions.assertEquals(25,result);

    }
    @Test
    public void testCasePassingEmptyMatrixAsInput() {
        // set up user
        DiagonalSum mat = new DiagonalSum();
        int mat1[][] = {{}};
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> mat.diagonalSum(mat1));
        Assertions.assertEquals("Empty Matrix not allowed", exception.getMessage());
    }
    @Test
    public void testCasePassingNullAsArgument() {
        DiagonalSum mat = new DiagonalSum();
        int mat1[][] = null;
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> mat.diagonalSum(mat1));
        Assertions.assertEquals("Null value not allowed", exception.getMessage());

    }



}
