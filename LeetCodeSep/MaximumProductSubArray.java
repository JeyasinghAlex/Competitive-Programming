package LeetCodeChallenges.LeetCodeSep;

public class MaximumProductSubArray {

    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int[][] dp = new int[nums.length][nums.length];

        for (int i = 0; i < nums.length; ++i) {
            dp[i][i] = nums[i];
            if (dp[i][i] > max)
                max = dp[i][i];
        }

        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                dp[i][j] = dp[i][j - 1] * nums[j];
                if (dp[i][j] > max) {
                    max = dp[i][j];
                }
            }
        }
        return max;
    }

    public int brutFores(int[] nums) {
        int result = nums[0];
        for (int i = 0; i < nums.length; ++i) {
            int product = 1;
            for (int j = i; j < nums.length; ++j) {
                product *= nums[j];
                result = Math.max(product, result);
            }
        }
        return result;
    }

    //Efficient Solution :
    public int maxProductt(int[] nums) {
        int product = 1;
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            maxProduct = Math.max(maxProduct, product);
            if (product == 0) {
                product = 1;
            }
        }

        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            product *= nums[i];
            maxProduct = Math.max(maxProduct, product);
            if (product == 0) {
                product = 1;
            }
        }

        return maxProduct;
    }
}
