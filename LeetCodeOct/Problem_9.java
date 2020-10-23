package demo;

import java.util.Scanner;

public class Problem_9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean flag = true;
        int row = n / 2;
        int col = n / 2;
        int curVal = 1;
        int[][] arr = new int[n][n];
        arr[row][col] = curVal++;
        for (int len = 1; len < n; ++len) {
            if (flag) {
                for (int i = 0; i < len; ++i) {
                    arr[row][++col] = curVal++;
                }
                for (int i = 0; i < len; ++i) {
                    arr[++row][col] = curVal++;
                }
                flag = false;
            } else {
                for (int i = 0; i < len; ++i) {
                    arr[row][--col] = curVal++;
                }
                for (int i = 0; i < len; ++i) {
                    arr[--row][col] = curVal++;
                }
                flag = true;
            }
        }
        for (int i = 1; i < n; ++i) {
            arr[0][i] = curVal++;
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}