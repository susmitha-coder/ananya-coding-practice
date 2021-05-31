package in.susmitha.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;
public class DiagonalSum {
    public static void main(String[] args){
        DiagonalSum obj = new DiagonalSum();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int m = s.nextInt();
        System.out.println("Enter number of columns");
        int n = s.nextInt();
        System.out.println("Enter elements of the matrix");
        int[][] matrix = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = s.nextInt();
            }
        }
        System.out.println(obj.diagonalSum(matrix));
    }
    public int diagonalSum(int[][] mat) {
        int diag = 0;
        for(int i=0; i<mat.length; i++) {
            diag+=mat[i][i]+mat[i][mat.length-1-i];
        }
        if(mat.length%2==1){
            diag=diag-mat[mat.length/2][mat.length/2];
            return diag;
        }
        return diag;
    }

}
