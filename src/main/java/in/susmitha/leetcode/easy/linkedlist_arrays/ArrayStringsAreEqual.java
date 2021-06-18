package in.susmitha.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;
public class ArrayStringsAreEqual {
    public static void main(String[] args){
        ArrayStringsAreEqual obj = new ArrayStringsAreEqual();
        Scanner s = new Scanner(System.in);
        String[] arr1 = {"a","b"};
        String[] arr2 = {"ab"};
        System.out.println(obj.arrayStringsAreEqual(arr1,arr2));
    }



    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }
}