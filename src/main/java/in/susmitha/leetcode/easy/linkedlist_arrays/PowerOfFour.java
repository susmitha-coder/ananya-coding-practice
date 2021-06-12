package in.susmitha.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;
public class PowerOfFour {
    public static void main(String[] args){
        PowerOfFour obj = new PowerOfFour();
        Scanner s = new Scanner(System.in);
        System.out.println(obj.isPowerOfFour(s.nextInt()));
    }
    public boolean isPowerOfFour(int n) {
        double x = Math.log(n) / (Math.log(4)) ;

        if( x == (int)x){
            return true ;
        }
        else {
            return false ;
        }
    }
}


