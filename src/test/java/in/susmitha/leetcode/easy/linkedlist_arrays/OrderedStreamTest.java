package in.susmitha.leetcode.easy.linkedlist_arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderedStreamTest {
    @Test
    public void testCorrectOperation(){
        OrderedStream os= new OrderedStream(5);
        Assertions.assertEquals(os.insert(3,"cccc"),new ArrayList<>());
        Assertions.assertEquals(os.insert(1,"aaaa"),Arrays.asList("aaaa"));
        Assertions.assertEquals(os.insert(2,"bbbb"),Arrays.asList("bbbb","cccc"));
        Assertions.assertEquals(os.insert(5,"eeee"),Arrays.asList());
        Assertions.assertEquals(os.insert(4,"dddd"),Arrays.asList("dddd","eeee"));
    }

}
