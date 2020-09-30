package LeetCodeChallenges.LeetCodeSep;

public class SubarrayProductLessThan_K {

    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int count = 0;
        int mul = 1;
        int right = 0;
        int left = 0;

        if (k <= 1)
            return 0;

        while (right < nums.length) {
            mul *= nums[right];
            while (mul >= k) {
                mul = mul / nums[left++];
            }
            count += 1 + (right - left);
            right++;
        }
        return count;
    }
}
