package LeetCodeChallenges.LeetCodeSep;

import java.util.HashMap;
import java.util.Map;

public class SetMismatch {

    //Approach 1: Brute Force
    public int[] findErrorNums(int[] nums) {
        int dup = -1, mis = -1;
        for (int i = 1; i <= nums.length; ++i) {
            int count = 0;
            for (int j = 0; j < nums.length; ++j) {
                if (nums[j] == i) {
                    count++;
                }
            }
            if (count == 2) {
                dup = i;
            } else if (count == 0) {
                mis = i;
            }
        }
        return new int[]{dup, mis};
    }

    //Approach 2: Using Map
    public int[] findErrorNum(int[] nums) {

        int dup = -1, mis = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int ch : nums) {
            int count = map.getOrDefault(ch, 0);
            map.put(ch, count + 1);
        }

        for (int i = 1; i <= nums.length; ++i) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2) {
                    dup = i;
                }
            } else {
                mis = i;
            }
        }
        return new int[]{dup, mis};
    }

    //Approach 5: Using Extra Array
    public int[] findError(int[] nums) {

        int dup = -1, mis = -1;
        int[] count = new int[nums.length + 1];

        for (int ch : nums) {
            count[ch]++;
        }
        for (int i = 1; i <= nums.length; ++i) {
            if (count[i] == 2) {
                dup = i;
            } else if (count[i] == 0) {
                mis = i;
            }
        }
        return new int[]{dup, mis};
    }
}
