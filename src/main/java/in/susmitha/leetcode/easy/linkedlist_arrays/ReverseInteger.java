package in.susmitha.leetcode.easy.linkedlist_arrays;

public class ReverseInteger {
    public static void main(String[] args){
        ReverseInteger r = new ReverseInteger();
        int x =123;
        int result = r.reverse(x);
        System.out.println("The result is"+result);
    }
    public static int reverse(int n){
         int rev = 0, rm = 0;
        while (n != 0) {
            rm = n%10;
            n /= 10;
            if(rev > Integer.MAX_VALUE/10 || rev <Integer.MIN_VALUE/10)
                return 0;
            rev = rev * 10 + rm;
        }
        return rev;
    }
}


