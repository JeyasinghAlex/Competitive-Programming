package LeetCodeChallenges.LeetCodeSep;

import java.util.Arrays;

public class ArrayPartition_I {

    public int arrayPairSum(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i = i + 2) {
            count += nums[i];
        }
        return count;
    }
}
