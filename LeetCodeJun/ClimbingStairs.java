package LeetCodeChallenges.LeetCodeJun;

import java.util.Arrays;

public class ClimbingStairs {
    /* 1 step or 2 step */
    public static void main(String[] args) {
        String s = "alex";
        int n = 7;
        int[] memo = new int[n + 1];
//        int[] arr = {1, 2};
        System.out.println(climbStairs(n));
        System.out.println(climbStairs(memo, n));
        System.out.println(climbStair(n));
        System.out.println(climbStai(n));
    }

    /** Approach 1: Brute Force */
    /*
     * Time complexity : O(2^n)O(2n)
     * Size of recursion tree will be 2^n
     * Space complexity : O(n). The depth of the recursion tree can go upto n.
     */
    private static int climbStairs(int n) {
        if (n <= 2)
            return n;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }


    /** Approach 2: Recursion with Memoization and topDownApproach */
    /*
        Time complexity : O(n). Size of recursion tree can go upto n.
        Space complexity : O(n). The depth of recursion tree can go upto n.
     */
    private static int climbStairs(int[] memo, int n) {
        if (memo[n] != 0)
            return memo[n];
        if (n <= 2)
            return n;
        memo[n] = climbStairs(memo, n - 1) + climbStairs(memo, n - 2);
        return memo[n];
    }

    /** Approach 3: Dynamic Programming and bottomUpApproach */
    /*
    * Time complexity : O(n). Single loop upto n.
    * Space complexity : O(n). dpdp array of size n is used.
    * */
    private static int climbStair(int n) {
        if (n <= 2)
            return n;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < dp.length; ++i)
            dp[i] = dp[i - 1] + dp[i - 2];
        return dp[n];
    }

    /** Approach 4: Fibonacci Number */
    /*
        Time complexity : O(n). Single loop upto nn is required to calculate n^{th} fibonacci number.
        Space complexity : O(1). Constant space is used.
     */
    private static int climbStai(int n) {
        if (n <= 2)
            return n;
        int first = 1;
        int second = 2;
        int third = 0;
        for (int i = 3; i <= n; ++i) {
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }

    /** Approach 5: Binets Method */
}
