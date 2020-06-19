package LeetCodeChallenges.LeetCodeJun;

import java.util.Arrays;

public class TheKStrongestValuesInAnArray {
    public static void main(String[] args) {
        int[] arr = {-7,22,17,3};
        int k = 2;
//        Arrays.sort(arr);
        getStrongest(arr, 2);
    }

    private static int[] getStrongest(int[] arr, int k) {
        int m = arr.length / 2;
        int median = arr[m];
        int[] strongest = new int[arr.length];
        for (int i = 0; i < strongest.length; ++i) {
            strongest[i] = (int)Math.abs(arr[i] - median);
        }
        System.out.println(Arrays.toString(strongest));
        sort(arr, strongest);
        System.out.println(Arrays.toString(arr));
        return new int[]{};
    }

    private static void sort(int[] arr, int[] strongest) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = i + 1; j  < arr.length; ++j) {
                if (strongest[i] <= strongest[j]) {
                    int temp = strongest[i];
                    strongest[i] = strongest[j];
                    strongest[j] = temp;

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

/*
class Solution {
    public int[] getStrongest(int[] arr, int k) {
        int n = arr.length;
        Integer[] nums = new Integer[n];
        for(int i = 0; i < n; i++) nums[i] = arr[i];
        Arrays.sort(nums);
        int m = nums[(n - 1) / 2];
        Arrays.sort(nums, (i1, i2) -> Math.abs(i1 - m) != Math.abs(i2 - m) ? Math.abs(i2 - m) - Math.abs(i1 - m) : i2 - i1);
        int [] res = new int[k];
        for(int i = 0; i < k; i++) res[i] = nums[i];
        return res;
    }
}*/
