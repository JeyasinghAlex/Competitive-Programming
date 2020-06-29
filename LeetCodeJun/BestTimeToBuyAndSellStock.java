package LeetCodeChallenges.LeetCodeJun;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProf(arr));
    }

    /* Approach 1: Brute Force :- */
    private static int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; ++i) {
            for (int j = i + 1; j < prices.length; ++j) {
                if (prices[i] < prices[j] && prices[j] - prices[i] > max) {
                    max = prices[j] - prices[i];
                }
            }
        }
        return Math.max(max, 0);
    }

    /* Approach 2: One Pass :- */
    private static int maxProf(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; ++i) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
}
