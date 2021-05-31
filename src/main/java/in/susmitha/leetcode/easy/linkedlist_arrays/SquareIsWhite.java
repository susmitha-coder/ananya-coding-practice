package in.susmitha.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;

public class SquareIsWhite {
    public static void main(String[] args){
        SquareIsWhite obj= new SquareIsWhite();
        Scanner s = new Scanner (System.in);
        System.out.println(obj.squareIsWhite(s.next()));
    }
    public boolean squareIsWhite(String coordinates) {
        Character letter = coordinates.charAt(0), num = coordinates.charAt(1);
        int x = letter - 'a' + 1, y = Character.digit(num, 10);
        return (x + y) % 2 == 1;

    }


}
