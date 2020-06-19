package LeetCodeChallenges.LeetCodeJun;

import java.util.Arrays;

public class CoinChange2 {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 5;
        int max = change(amount, coins);
        System.out.println(max);
    }

    private static int changee(int amount, int[] coins) {

        if (coins.length == 1 && amount % coins[0] != 0 || coins.length == 0  && amount != 0)
            return 0;
        if (coins.length == 1 && amount % coins[0] == 0 || coins.length == 0)
            return 1;


        int[][] table = new int[coins.length][amount + 1];
//        for (int i = 0; i < coins.length; ++i)
//            table[i][0] = 1;
        //   table[0][0] = 1;

        /** Fill first row :- */
        for (int i = 0; i <= amount; ++i)
            table[0][i] = i % coins[0] == 0 ? 1 : 0;

        for (int i = 1; i < coins.length; ++i) {
            table[i][0] = 1;
            for (int j = 1; j <= amount; ++j) {
                if (coins[i] > j) {
                    table[i][j] = table[i - 1][j];
                } else {
                    table[i][j] = table[i - 1][j] + table[i][j - coins[i]];
                }
            }
        }
        System.out.println(Arrays.deepToString(table));
        return table[coins.length - 1][amount];
    }

    /**Simple solution :- */

    public static int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i-coin];
            }
        }
        return dp[amount];
    }
}
