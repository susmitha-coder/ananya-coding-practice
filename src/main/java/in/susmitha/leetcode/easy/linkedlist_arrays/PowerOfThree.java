package in.susmitha.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;
public class PowerOfThree {
    public static void main(String[] args){
        PowerOfThree obj = new PowerOfThree();
        Scanner s= new Scanner(System.in);
        System.out.println(obj.isPowerOfThree(s.nextInt()));
    }
    public boolean isPowerOfThree(int n) {
        if(n==1)
            return true;
        if(n<=0 || n%3!=0 )
            return false;
        while(n!=1){

            if(n%3!=0) return false;
            n=n/3;

        }

        return true;
    }
}
