package LeetCodeChallenges.LeetCodeSep;

public class MaximumXORTwoNumbersArray {

    //Approach1 : Bro
    public int findMaximumXOR(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                max = Math.max(max, nums[i] ^ nums[j]);
            }
        }
        return max;
    }
}
