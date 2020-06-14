package LeetCodeChallenges.LeetCodeJun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {
    public static void main(String[] args) {
        int[] arr = {546, 669};
        System.out.println(arr[1] % arr[0]);
        System.out.println(largestDivisibleSubset(arr));
    }

    private static List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if (nums.length == 0)
            return list;

        int[] len = new int[nums.length];
        int max = Integer.MIN_VALUE;
        Arrays.sort(nums);
        Arrays.fill(len, 1);
        for (int i = 1; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[i] % nums[j] == 0 && len[j] >= len[i]) {
                    len[i] = 1 + len[j];
                    max = Math.max(max, len[i]);
                }
            }
        }
        System.out.println(Arrays.toString(len));
        System.out.println(max);
        int prev = -1;
        boolean flag = false;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (max == len[i] && (prev % nums[i] == 0 || prev == -1)) {
                flag = true;
                list.add(nums[i]);
                prev = nums[i];
                max--;
            }
        }
        if (!flag)
            list.add(nums[0]);
        return list;
    }
}