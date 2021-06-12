package in.susmitha.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;
public class AddDigits {
    public static void main(String[] args) {
        AddDigits obj = new AddDigits();
        Scanner s = new Scanner(System.in);
        System.out.println(obj.addDigits(s.nextInt()));
    }

        public int addDigits ( int num){
            if (num < 10) {
                return num;
            }
            else {
                int sum = 0;
                int tmp = num;
                while (tmp != 0) {
                    sum += tmp % 10;
                    tmp = tmp / 10;
                }
                return addDigits(sum);
            }
        }
    }

