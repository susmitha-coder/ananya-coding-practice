package in.susmitha.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class CountConsistentStrings {
    public static void main(String[] args) {
        CountConsistentStrings obj = new CountConsistentStrings();
        Scanner s = new Scanner(System.in);
        int size;
        System.out.println("Enter size");
        size = s.nextInt();
        String[] arr = new String[size];
        for(int j = 0; j <size;j++)
        {
            arr[j] = s.next();
        }
        System.out.println("Enter string to be matched");
        String all = s.next();
        System.out.println(obj.countConsistentStrings(all,arr));

    }

    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();

        for (char ch : allowed.toCharArray()) {
            set.add(ch);
        }

        int res = 0;
        for (String w : words) {
            boolean match = true;

            for (char ch : w.toCharArray()) {
                if (!set.contains(ch)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                res++;
            }
        }

        return res;


    }


    }
