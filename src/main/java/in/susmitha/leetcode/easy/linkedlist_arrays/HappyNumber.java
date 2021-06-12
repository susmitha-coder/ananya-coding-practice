package in.susmitha.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;
public class HappyNumber {
    public static void main(String[] args){
        HappyNumber obj = new HappyNumber();
        Scanner s =new Scanner(System.in);
        System.out.println(obj.isHappy (s.nextInt()));
    }
    public boolean isHappy(int n) {

        if (n == 1 || n == 7) return true;
        if (n < 10) return false;

        int  s = 0;

        while (n > 0) {
            int dig = n % 10;
            s += Math.pow(dig, 2);
            n /= 10;
        }

        return isHappy(s);

    }
}
