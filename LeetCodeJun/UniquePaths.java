package LeetCodeChallenges.LeetCodeJun;

public class UniquePaths {

    public static void main(String[] args) {
        int m = 7;
        int n = 3;
        System.out.println(uniquePath(m, n));
    }

    /* Using Dynamic Programing :- */
    private static int uniquePath(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; ++i)
            dp[i][0] = 1;
        for (int i = 0; i < n; ++i)
            dp[0][i] = 1;
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }
        return dp[m - 1][n - 1];
    }

    /* Using Recursive :- */
    private static int uniquePaths(int m, int n) {
        boolean[][] path = new boolean[m][n];
        path[m - 1][n - 1] = true;
        findUniquePaths(path, 0, 0);
        return count;
    }

    private static int count = 0;
    private static void findUniquePaths(boolean[][] path, int row, int col) {
        if (row < 0 || col < 0 || row >= path.length || col >= path[0].length)
            return;
        if (path[row][col])
            count++;

        findUniquePaths(path, row, col + 1);
        findUniquePaths(path, row + 1, col);
    }
}
