package demo;

import java.util.Scanner;

public class Problem_8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] arr = new int[n][m];
        int upper = 0;
        int lower = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                arr[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m - i; ++j) {
                upper += arr[i][j];
            }
        }

        for (int i = n - 1, st = 0; i >= 0; --i, ++st) {
            for (int j = st; j < m; ++j) {
                lower += arr[i][j];
            }
        }

        if (upper > lower) {
            System.out.println(upper);
        } else {
            System.out.println(lower);
        }
    }
}