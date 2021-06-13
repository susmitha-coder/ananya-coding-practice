package in.susmitha.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;
public class CountOdds {
    public static void main(String[] args) {
        CountOdds co = new CountOdds();
        Scanner s = new Scanner(System.in);
        int low1 = s.nextInt();
        int high1 = s.nextInt();
        System.out.println(co.countOdds(low1,high1));
    }
    public int countOdds(int low, int high) {
        int len=high-low+1;
        if(low % 2 == 0) return (len/2);
        else return (len%2==0? len/2: len/2+1);
    }
}
