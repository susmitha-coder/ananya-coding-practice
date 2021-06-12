package in.susmitha.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber obj = new PalindromeNumber();
        Scanner s = new Scanner(System.in);
        System.out.println(obj.isPalindrome(s.nextInt()));

    }

    public boolean isPalindrome(int x) {
        int r = 0;
        int a = x;
        if (x < 0) return false;


        while (a > 0) {
            int n = a % 10;
            r = r * 10 + n;
            a /= 10;
        }

        return r == x;
    }
}












