package LeetCodeChallenges.LeetCodeJun;

import java.util.ArrayList;
import java.util.List;

public class LongestSubArrayOf1SAfterDeletingOneElement {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,0,1,1,0,1};
        System.out.println(longestSubarray(arr));
    }

    private static int longestSubarray(int[] nums) {
        int ans = 0;
        int cur = 0;
        int pre = 0;
        boolean isZero = false;
        for (int c : nums) {
            if (c == 0) {
                isZero = true;
                pre = cur;
                cur = 0;
            } else {
                cur++;
            }
            ans = Math.max(ans, pre + cur);
        }
        return isZero ? ans : ans - 1;
    }
}
