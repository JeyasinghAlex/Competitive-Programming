package LeetCodeChallenges.LeetCodeJun;

import java.util.Arrays;

public class NumberOfIsland {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 1, 1}};
        System.out.println(numOfIslands(arr));
    }

    private static int numOfIslands(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[0].length; ++j) {
                if (arr[i][j] == 1) {
                    count++;
                    markCurrentIsland(arr, i, j);
                }
            }
        }
        return count;
    }

    private static void markCurrentIsland(int[][] arr, int row, int col) {
        if (row < 0 || row >= arr.length || col < 0 || col >= arr[0].length || arr[row][col] != 1)
            return;

        if (arr[row][col] == 1)
            arr[row][col] = 2;

        markCurrentIsland(arr, row, col + 1);
        markCurrentIsland(arr, row, col - 1);
        markCurrentIsland(arr, row + 1, col);
        markCurrentIsland(arr, row - 1, col);
    }
}
