package in.susmitha.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;
public class RunningSum {
    public static void main(String[] args){
    RunningSum obj=new RunningSum();
    Scanner s = new Scanner(System.in);
    System.out.println("Enter size of array");
    int size = s.nextInt();
    int nums [] = new int[size];
    System.out.println("Enter"+size+" elements in to array");
    for(int i=0;i<size;i++){
        nums[i]=s.nextInt();
    }
        int arr[] =obj.runningSum(nums);
        System.out.print("[ ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");

    }

    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0)
                result[i]=nums[i];
            else{
                result[i]=result[i-1]+nums[i];
            }
        }
        return result;
    }
}












