package in.susmitha.leetcode.easy.linkedlist_arrays;
import java.util.ArrayList;
import java.util.List;
public class OrderedStream {
    public static void main(String[] args){
        OrderedStream obj= new OrderedStream(5);
        System.out.println(obj.insert(3,"cccc"));
        System.out.println(obj.insert(1,"aaaa"));
        System.out.println(obj.insert(2,"bbbb"));
        System.out.println(obj.insert(5,"eeee"));
        System.out.println(obj.insert(4,"dddd"));
    }
    private String[] values;
    private int i = 0;
    public OrderedStream(int n) {
        values = new String[n];
    }

    public List<String> insert(int idKey, String value) {

        values[idKey - 1] = value;
        List<String> res = new ArrayList<>();
        while (i < values.length && values[i] != null) {
            res.add(values[i]);
            i++;
        }
        return res;
    }
}
