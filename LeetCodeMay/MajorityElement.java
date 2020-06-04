package LeetCodeChallenges.LeetCodeMay;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    private static int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            int cnt = map.containsKey(i) ? map.get(i) : 0;
            map.put(i, cnt+1);
            if (map.containsKey(i) && map.get(i) > nums.length/2) {
                return i;
            }
        }
        return -1;
    }
}
