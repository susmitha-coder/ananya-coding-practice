package in.susmitha.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        Scanner s = new Scanner(System.in);
        int[] nums = new int[100];

        System.out.println("Enter size of the array");
        int size = s.nextInt();

        System.out.println("Enter " + size + " elements of the array");
        for (int i = 0; i < size; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println("Enter target of the array");
        int target = s.nextInt();
        int arr[] = obj.twoSum(nums, target);
        System.out.println("The indices are " + arr[0] + " " + arr[1]);
    }
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                    return new int[] {i,j};
            }
        }
        throw new IllegalArgumentException("No twoSum solution");
    }

















    }
