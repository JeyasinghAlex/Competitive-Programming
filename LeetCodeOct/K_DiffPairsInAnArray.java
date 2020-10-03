package LeetCodeChallenges.LeetCodeOct;

import java.util.*;

public class K_DiffPairsInAnArray {

    //Approach1 : Using Map
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        Arrays.sort(nums);
        for (int ch : nums) {
            if (!map.containsKey(ch)) {
                if (map.containsKey(ch + k)) {
                    ++count;
                }
                if (map.containsKey(ch - k)) {
                    ++count;
                }
            } else if (k == 0 && map.get(ch) == 1) {
                ++count;
            }
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return count;
    }

    public int findPair(int[] nums, int k) {

        int count = 0;
        if (k < 0 || nums.length <= 1) {
            return 0;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; ++i) {
            if (i != 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            while (j < nums.length) {
                if (nums[j] > nums[i] + k) {
                    break;
                }
                if (nums[j] == nums[i] + k) {
                    ++count;
                    break;
                }
                ++j;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new K_DiffPairsInAnArray().findPairs(new int[]{1, 2, 3, 4, 5}, 1));
    }
}