package LeetCodeChallenges.LeetCodeJun;

public class UniqueBinarySearchTrees {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(numTrees(n));
        System.out.println(recursive(n));
        System.out.println(memoization(new int[n + 1], n));
    }

    /* Dynamic Program */
    private static int numTrees(int n) {
        if (n <= 2)
            return n;
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;dp[2] = 2;

        for (int i = 3; i <= n; ++i) {
            for (int j = 0; j < i; ++j) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp[n];
    }

    /* Recursive Approach */
    private static int recursive(int n) {
        if (n <= 1)
            return 1;

        int sum = 0;
        for (int i = 0; i < n; ++i) {
            sum += recursive(i) * recursive(n - i - 1);
        }
        return sum;
    }

    /* Memoization Approach */
    private static int memoization(int[] memo, int n) {
        if (memo[n] != 0)
            return memo[n];
        if (n <= 1)
            return 1;

        for (int i = 0; i < n; ++i) {
            memo[n] += memoization(memo, i) * memoization(memo, n - i - 1);
        }
        return memo[n];
    }
}
