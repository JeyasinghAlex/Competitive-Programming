package LeetCodeChallenges.LeetCodeJun;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] num = {3,3,3,3,3,4,4,4,5};
        Arrays.sort(num);
        System.out.println(removeDuplicates(num));
        System.out.println(Arrays.toString(num));
    }

    public static int removeDuplicate(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    private static int removeDuplicates(int[] nums) {
        int point = 0;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[point] != nums[i]) {
                point++;
                nums[point] = nums[i];
            }
        }
        return point + 1;
    }
}