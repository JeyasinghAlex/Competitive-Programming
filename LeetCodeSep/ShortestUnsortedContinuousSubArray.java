package LeetCodeChallenges.LeetCodeSep;

import java.util.Arrays;
import java.util.Stack;

public class ShortestUnsortedContinuousSubArray {

    //Approach 1: Using Sorting
    public int findUnsortedSubarray(int[] nums) {
        int st = nums.length, ed = 0;
        int[] arr = nums.clone();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; ++i) {
            if (arr[i] != nums[i]) {
                st = Math.min(st, i);
                ed = Math.max(ed, i);
            }
        }
        return ed - st > 0 ? ed - st + 1 : 0;
    }

    //Approach 2: Using Stack
    public int findUnsortedSubArray(int[] nums) {
        int st = nums.length, ed = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; ++i) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                st = Math.min(st, stack.pop());
            }
            stack.push(i);
        }
        stack.clear();
        for (int i = nums.length - 1; i >= 0; --i) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                ed = Math.max(ed, stack.pop());
            }
            stack.push(i);
        }
        return ed - st > 0 ? ed - st + 1 : 0;
    }
}