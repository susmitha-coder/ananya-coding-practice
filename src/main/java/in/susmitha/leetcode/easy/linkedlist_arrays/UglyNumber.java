package in.susmitha.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;
public class UglyNumber {
    public static void main(String[] args){
        UglyNumber obj= new UglyNumber();
        Scanner s= new Scanner(System.in);
        System.out.println(obj.isUgly(s.nextInt()));
    }
    public boolean isUgly(int n) {
        if(n <= 0) return false;

        while(n%2==0) n /= 2;

        while(n%5==0) n /= 5;

        while(n%3==0) n /= 3;

        return n==1;
    }
}
