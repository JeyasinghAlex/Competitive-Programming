package LeetCodeChallenges.LeetCodeJun;

public class RangeSumQueryImmutable {

    public static void main(String[] args) {
        int[] arr = {-2, 0, 3, -5, 2, -1};
        RangeSumQueryImmutable obj = new RangeSumQueryImmutable(arr);
        System.out.println(obj.sumRangee(0, 5));
    }

    private int[] arr = null;
    public RangeSumQueryImmutable(int[] nums) {
        arr = nums;
    }

    /* Approach #3 (Caching) [Accepted] */
    public int sumRangee(int i, int j) {

        for (int k = 1; k < arr.length; ++k)
            arr[k] = arr[k - 1] + arr[k];

        if (i == 0)
            return arr[j];
        else
            return arr[j] - arr[i - 1];
    }

    /* Approach #1 (Brute Force) [Time Limit Exceeded] */
    public int sumRange(int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += arr[k];
        }
        return sum;
    }

}
