package LeetCodeChallenges.LeetCodeJun;

public class UniqueBinarySearchTrees {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(numTrees(n));
    }

    private static int numTrees(int n) {
        if (n <= 2)
            return n;

        int[] dp = new int[n + 1];
        dp[0] = 1;dp[1] = 1;dp[2] = 2;

        for (int i = 3; i <= n; ++i) {
            for (int j = 0; j < i; ++j) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp[n];
    }
}
