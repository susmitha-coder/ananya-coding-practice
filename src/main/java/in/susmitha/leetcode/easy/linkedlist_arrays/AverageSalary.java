package in.susmitha.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;
import java.util.Arrays;
public class AverageSalary {
    public static void main(String[] args){
        AverageSalary obj = new AverageSalary();
        Scanner s= new Scanner(System.in);
        int arr[] = {4000,3000,1000,2000};
        System.out.println(obj.average(arr));
    }
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum = 0;
        for (int i = 1; i < salary.length - 1; i++) sum += salary[i];
        return sum / (salary.length - 2);
    }
}
