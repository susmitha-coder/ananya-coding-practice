package in.susmitha.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;
public class Sqrt {
    public static void main(String[] args) {
        Sqrt sr = new Sqrt();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sr.mySqrt(n));
    }
    public int mySqrt(int x) {
        if(x<=0){
            return 0;
        }
        return (int) Math.sqrt(x);
    }
}
