package LeetCodeChallenges.LeetCodeMay;

public class MaximumSumCircularSubArray {

    public static void main(String[] args) {
        int[] arr = {-2,-3,-1};
        System.out.println(maxSubarraySumCircular(arr));
    }

    private static int maxSubarraySumCircular(int[] A) {

        if (A == null || A.length == 0)
            return 0;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0, sum1 = 0;
        int total = 0;

        for (int i = 0; i < A.length; ++i) {
            sum += A[i];

            if (sum < min)
                min = sum;

            if (sum > 0)
                sum = 0;

            sum1 += A[i];

            if (sum1 > max)
                max = sum1;

            if (sum1 < 0)
                sum1 = 0;

            total += A[i];
        }
        return  max < 0 ? max : Math.max(max, total - min);
    }
}
