package in.susmitha.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args){
        PowerOfTwo obj = new PowerOfTwo();
        Scanner s = new Scanner(System.in);
        System.out.println(obj.isPowerOfTwo(s.nextInt()));
    }
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        while(n!=1)
        {
            if(n%2!=0)
                return false;

            n=n>>1;
        }
        return true;
    }
}
