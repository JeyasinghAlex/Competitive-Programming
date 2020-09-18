package LeetCodeChallenges.LeetCodeSep;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {

    /* Approach 1: Brute Force :- */
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; ++i) {
            for (int j = i + 1; j < prices.length; ++j) {
                if (prices[j] - prices[i] > max) {
                    max = prices[j] - prices[i];
                }
            }
        }
        return max;
    }

    /* Approach 2: One Pass :- */
    public int maxProf(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; ++i) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit =  Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }

    /* Approach 3: DB Solution :- */
    public int max(int[] prices) {
        if(prices.length <= 1) return 0;
        // dp to maintain the highest price from right
        int[] dp = new int[prices.length];
        dp[prices.length-1] = prices[prices.length-1];
        for(int i = prices.length - 2; i >= 0; i--) {
            dp[i] = Math.max(prices[i], dp[i+1]);
        }
        int max = 0;
        for(int i = 0; i < prices.length; i++) {
            int currMax = dp[i] - prices[i];
            max = Math.max(currMax, max);
        }
        return max;
    }
}
