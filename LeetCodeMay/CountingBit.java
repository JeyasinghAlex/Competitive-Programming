package LeetCodeChallenges.LeetCodeMay;

import java.util.Arrays;

public class CountingBit {
    public static void main(String[] args) {
        int num = 2;
        System.out.println(Arrays.toString(countBits(2)));
    }

    private static int[] countBits(int num) {

        int[] arr = new int[num + 1];

        for (int i = 1; i <= num; ++i) {
            arr[i] = arr[i/2] + i %  2;
        }
        return arr;
    }
}
