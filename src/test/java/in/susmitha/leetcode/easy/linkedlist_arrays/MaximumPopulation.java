package in.susmitha.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class MaximumPopulation {
    public static void main(String[] args) {
        MaximumPopulation obj = new MaximumPopulation();
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println(obj.maximumPopulation(matrix));
    }

    public int maximumPopulation(int[][] logs) {
        int years[] = new int[101];
        int i, max, earliest = 0;
        for (i = 0; i < 101; i++)
            years[i] = 0;
        for (i = 0; i < logs.length; i++) {
            years[(logs[i][0] - 1950)] += 1;
            years[(logs[i][1] - 1950)] -= 1;
        }
        for (i = 1; i < 101; i++) {
            years[i] = years[i] + years[i - 1];
        }
        max = years[0];
        for (i = 1; i < 100; i++) {
            if (years[i] > max) {
                max = years[i];
                earliest = i;
            }
        }
        return 1950 + earliest;
    }
}