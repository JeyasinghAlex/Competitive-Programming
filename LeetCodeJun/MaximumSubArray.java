package LeetCodeChallenges.LeetCodeJun;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
        System.out.println(findMaximumSumSubArray(arr));
//        System.out.println(findMaximumSumSubArrayy(arr));
    }

    /* Kadane algorithm */
    private static int maxSubArray(int[] nums) {
        int sum = 0;
        int st = 0, ed = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; ++i) {
            sum += nums[i];
            if (sum > max) {
                max = sum;
                ed = i;
            }
            if (sum < 0) {
                sum = 0;
                st = i + 1;
            }
        }
        System.out.println(st + " " + ed);
        return max;
    }

    /* Dynamic Program Approach :- */
    private static int findMaximumSumSubArray(int[] dp) {
        int max = dp[0];
        for (int i = 1; i < dp.length; ++i) {
            dp[i] = Math.max(dp[i - 1] + dp[i], dp[i]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    /* Greedy Program Approach :- */
    private static int findMaximumSumSubArrayy(int[] arr) {
        int sum = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            sum = Math.max(sum + arr[i], arr[i]);
            max = Math.max(max, sum);
        }
        return max;
    }
}
