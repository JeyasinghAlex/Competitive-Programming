package LeetCodeChallenges.LeetCodeSep;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int[] arr = {10, 1, 2, 7, 6, 1, 5};
//        System.out.println(Arrays.toString(arr));
//        CombinationSum_II obj = new CombinationSum_II();
//        System.out.println(obj.combinationSum2(arr, 8));

        int arr[] = {2, 2};
        SetMismatch obj = new SetMismatch();
        System.out.println(Arrays.toString(obj.findError(arr)));
    }
}
