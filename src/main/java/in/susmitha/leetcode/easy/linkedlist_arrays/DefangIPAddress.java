package in.susmitha.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;
public class DefangIPAddress {
    public static void main(String[] args) {
        DefangIPAddress obj = new DefangIPAddress();
        Scanner s = new Scanner(System.in);
        System.out.println(obj.defangIPaddr(s.next()));
    }
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}

