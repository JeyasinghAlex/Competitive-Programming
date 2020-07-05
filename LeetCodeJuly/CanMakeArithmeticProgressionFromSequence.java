package LeetCodeChallenges.LeetCodeJuly;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        System.out.println(canMakeArithmeticProgression(arr));
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length <= 1)
            return false;

        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 2; i < arr.length; ++i)  {
            if (arr[i] - arr[i - 1] != diff)
                return false;
        }
        return true;
    }
}
