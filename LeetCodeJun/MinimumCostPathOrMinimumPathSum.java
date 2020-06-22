package LeetCodeChallenges.LeetCodeJun;

public class MinimumCostPathOrMinimumPathSum {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 1}, {2, 3, 2}, {4, 3, 1}};
        int[][] memo = new int[arr.length][arr[0].length];
//        int[][] arr = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        System.out.println(recursiveApproach(arr, 0, 0));
        System.out.println(memoization(arr, memo, 0, 0));
        System.out.println(dynamicProgram(arr));
    }

    private static int recursiveApproach(int[][] arr, int row, int col) {
        if (row < 0 || col < 0 || row >= arr.length || col >= arr[0].length)
            return Integer.MAX_VALUE;
        if (row == arr.length - 1 && col == arr[0].length - 1)
            return arr[row][col];
//        int a = recursiveApproach(arr, row, col + 1);
//        int b = recursiveApproach(arr, row +  1, col);
//        int min = Math.min(a, b);
//        return arr[row][col] + min;
        return arr[row][col] + Math.min(recursiveApproach(arr, row, col + 1), recursiveApproach(arr, row + 1, col));
    }

     private static int memoization(int[][] arr, int[][] memo, int row, int col) {
        if (row < 0 || col < 0 || row >= arr.length || col >= arr[0].length)
            return Integer.MAX_VALUE;

        if (row == arr.length - 1 && col == arr[0].length - 1)
            return arr[row][col];

        if (memo[row][col] != 0)
            return memo[row][col];

        memo[row][col] = arr[row][col] + Math.min(memoization(arr, memo, row, col + 1), memoization(arr, memo, row + 1, col));
        return memo[row][col];
    }

    private static int dynamicProgram(int[][] arr) {
        int[][] dp = new int[arr.length][arr[0].length];
        dp[0][0] = arr[0][0];

        for (int i = 1; i < arr.length; ++i)
            dp[0][i] = dp[0][i - 1] + arr[0][i];

        for (int i = 1; i < arr[0].length; ++i)
            dp[i][0] = dp[i - 1][0] + arr[i][0];

        for (int i = 1; i < arr.length; ++i) {
            for (int j = 1; j < arr[0].length; ++j) {
                dp[i][j] = arr[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[arr.length - 1][arr[0].length - 1];
    }
}