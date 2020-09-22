package LeetCodeChallenges.LeetCodeSep;

public class NonDecreasingArray {

    public boolean checkPossibility(int[] nums) {
        int count = 0;
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] > nums[i + 1]) {
                if (i > 0) {
                    if (nums[i - 1] <= nums[i + 1]) {
                        nums[i] = nums[i + 1];
                    } else {
                        nums[i + 1] = nums[i];
                    }
                }
                ++count;
            }
            ++i;
        }
        return count <= 1;
    }
}
