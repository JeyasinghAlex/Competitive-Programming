package LeetCodeChallenges.LeetCodeJun;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4, 7};
        int n =  3;
        System.out.println(Arrays.toString(shuffle(arr, n)));
    }

    private static int[] shuffle(int[] nums, int n) {
        int index = 0;
        int[] temp = new int[nums.length];
        for (int i = 0, j = nums.length/2; i < n; ++i) {
            temp[index++] = nums[i];
            temp[index++] = nums[j + i];
        }
        return temp;
    }
}
