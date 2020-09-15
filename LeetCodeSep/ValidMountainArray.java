package LeetCodeChallenges.LeetCodeSep;

public class ValidMountainArray {
    public boolean validMountainArray(int[] nums) {

        int i = 0;
        int n = nums.length - 1;
        while (i < n && nums[i] < nums[i + 1]) {
            ++i;
        }
        if (i == 0 || i == n) {
            return false;
        }
        while (i < n && nums[i] > nums[i + 1]) {
            ++i;
        }
        return i == n;
    }
}
