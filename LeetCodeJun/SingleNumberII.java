package LeetCodeChallenges.LeetCodeJun;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,1,99};
        System.out.println(singleNumber(arr));
        System.out.println(singleNumberr(arr));
    }

    private static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i = i + 3) {
            if (nums[i] != nums[i + 2])
                return nums[i];
        }
        return nums[nums.length- 1];
    }
    private static int singleNumberr(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int c : nums) {
//            int count = map.getOrDefault(c, 0);
//            map.put(c, count + 1);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int c : nums) {
            if (map.get(c) == 1)
                return c;
        }
        return 0;
    }
}
