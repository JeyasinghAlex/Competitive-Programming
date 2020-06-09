package LeetCodeChallenges.LeetCodeJun;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] num = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(num, val));
        System.out.println(Arrays.toString(num));
    }

    private static int removeElement(int[] nums, int val) {
        int point = 0;
        for (int c : nums) {
            if (c != val)
                nums[point++] = c;
        }
        return point;
    }
}
