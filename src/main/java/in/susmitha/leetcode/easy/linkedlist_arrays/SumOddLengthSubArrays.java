package in.susmitha.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;

public class SumOddLengthSubArrays {
    public static void main(String[] args){
        SumOddLengthSubArrays obj = new SumOddLengthSubArrays();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=s.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter"+size+"elements in to array");
        for(int i=0;i<size;i++){
             nums[i]= s.nextInt();
        }
        System.out.println(obj.sumOddLengthSubarrays(nums));
    }
    public int sumOddLengthSubarrays(int[] arr) {
        int cnt,s,sum=0,n=arr.length;
        for(int i=0;i<n;i++){4
            s = (n-i)*(i+1);
            cnt=s/2;
            if(s%2!=0){
                cnt++;
            }
            sum += cnt*arr[i];
        }
        return sum;
    }
}
