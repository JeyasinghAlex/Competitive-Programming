package LeetCodeChallenges.LeetCodeSep;

import java.util.*;

public class MajorityElement_II {

    //Approach1 : Using Map
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length / 3;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int ch : nums) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                list.add(entry.getKey());
            }
        }
        return list;
    }

    //Approach2 : Using Sort
    public List<Integer> majorityElements(int[] nums) {
        int count = 1;
        int n = nums.length / 3;
        List<Integer> list = new ArrayList<>();

        if (nums.length == 0)
            return list;

        Arrays.sort(nums);
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == nums[i - 1]) {
                ++count;
            } else {
                if (count > n) {
                    list.add(nums[i - 1]);
                }
                count = 1;
            }
        }
        if (count > n) {
            list.add(nums[nums.length - 1]);
        }
        return list;
    }

}
