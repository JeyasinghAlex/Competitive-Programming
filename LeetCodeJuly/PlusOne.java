package LeetCodeChallenges.LeetCodeJuly;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    private static int[] plusOne(int[] digits) {
        int cy = 1;
        for  (int i = digits.length - 1; i >= 0; --i) {
            int temp = digits[i] + cy;
                digits[i] = temp % 10;
                cy = temp / 10;
        }
        if (cy != 0) {
            int[] temp = new int[digits.length + 1];
            temp[0] = cy;
            for (int i = 1; i < temp.length; ++i) {
                temp[i] = digits[i - 1];
            }
            return temp;
        }
        return digits;
    }
}
