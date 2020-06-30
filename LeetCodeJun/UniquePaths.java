package LeetCodeChallenges.LeetCodeJun;

public class UniquePaths {

    public static void main(String[] args) {
        int m = 7;
        int n = 3;
        System.out.println(uniquePaths(m, n));
    }

    /* Using Dynamic Programing :- */
    private static int findUniquePathss(int m, int n) {
        int[][] dp = new int[m][n];
//        for (int i = 0; i < m; ++i)
//            dp[i][0] = 1;
//        for (int i = 0; i < n; ++i)
//            dp[0][i] = 1;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i == 0 || j == 0)
                    dp[i][j] = 1;
                else
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }
        return dp[m - 1][n - 1];
    }

    private static int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        boolean[][] path = new boolean[m][n];
        path[m - 1][n - 1] = true;
//        return findUniquePaths(path, 0, 0);
//        return findUniquePathss(memo, 0, 0);
         return findUniquePathss(0, 0);
    }

    /* Using Recursive :- */
    private static int findUniquePaths(boolean[][] path, int row, int col) {
        if (row < 0 || col < 0 || row >= path.length || col >= path[0].length)
            return 0;
        if (path[row][col])
            return 1;

        return findUniquePaths(path, row, col + 1) + findUniquePaths(path, row + 1, col);
    }

    /* Memoization Approach :- */
    private static int findUniquePathss(int[][] memo,  int row, int col) {
        if (row < 0 || col < 0 || row >= memo.length || col >= memo[0].length)
            return 0;

        if (memo[row][col] != 0)
            return memo[row][col];

        if (memo.length - 1 == row && memo[0].length - 1 == col)
            return 1;

        memo[row][col] = findUniquePathss(memo, row, col + 1) + findUniquePathss(memo,row + 1, col);
        return memo[row][col];
    }
}
