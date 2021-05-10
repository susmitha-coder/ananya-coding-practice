package in.susmitha.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;
public class ShuffleArray {
    public static void main(String[] args) {
        ShuffleArray obj = new ShuffleArray();
        Scanner s = new Scanner(System.in);
        int[] nums = new int[100];
        System.out.println("Enter size of the array");
        int size= s.nextInt();
        System.out.println("Enter "+size+" elements of the array");
        for(int i=0;i<size;i++){
            nums[i] = s.nextInt();
        }

        System.out.println("Enter n value of the array");
        int n1 = s.nextInt();
        int a[] =obj.shuffle(nums,n1);
        for(int i=06;i<size;i++){
            System.out.println(a[i]);

        }

    }
    public int[] shuffle(int[] nums, int n) {
        int[] arr= new int[nums.length];
        int s=0,t=n;
        for(int i=0;i<n;i++){
            arr[s++]=nums[i];
            arr[s++]=nums[t++];
        }
        return arr;

    }
        }



