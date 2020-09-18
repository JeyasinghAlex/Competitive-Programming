package LeetCodeChallenges.LeetCodeSep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class K_DiffPairsAnArray {

    //Approach1 : Using two pointers:
    public int findPairs(int[] nums, int k) {

        int count = 0;
        if (k < 0 || nums.length <= 1)
            return 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; ++i) {
            if (i != 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;

            while (j < nums.length) {
                if (nums[j] > nums[i] + k)
                    break;
                if (nums[j] == nums[i] + k) {
                    ++count;
                    break;
                }
                ++j;
            }
        }
        return count;
    }

    //Approach2 : Using Map
    public int findPair(int[] nums, int k) {

        if (k < 0 || nums.length <= 1)
            return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; ++i) {

            if (!map.containsKey(nums[i])) {
                if (map.containsKey(nums[i] + k)) {
                    ++count;
                }
                if (map.containsKey(nums[i] - k)) {
                    ++count;
                }
            } else if (k == 0 && map.get(nums[i]) == 1) {
                ++count;
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return count;
    }
}
