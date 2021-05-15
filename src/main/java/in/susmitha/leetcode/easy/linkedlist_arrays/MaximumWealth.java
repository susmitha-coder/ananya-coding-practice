package in.susmitha.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;
public class MaximumWealth {
    public static void main(String[] args){
        MaximumWealth obj =  new MaximumWealth();
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int u = s.nextInt();
        int[][] matrix = new int[t][u];
        for(int i=0;i<t;i++){
            for(int j=0;j<u;j++){
                matrix[i][j] = s.nextInt();
            }

    }
        System.out.println(obj.maximumWealth(matrix));
    }
    public int maximumWealth(int[][] accounts) {
        int[] result = new int[accounts.length];
        int sum,max;


        for(int i=0;i<accounts.length;i++){
            sum=0;
            for(int j=0;j<accounts[0].length;j++){
                sum=sum+accounts[i][j];
            }
            result[i]=sum;
        }
        max=result[0];
        for(int i=0;i<result.length;i++)
        {
            if(max<result[i]){
                max=result[i];
            }
        }
        return max;
    }
}



