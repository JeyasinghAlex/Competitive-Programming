
import java.util.*;

public class Solution {
    public static void main(String[] arg) {
        /** Prefix sum algorithm */
        int[] arr = {5,6,3,2,8,-3,20,-7};
        for (int i = 1; i < arr.length; ++i) {
            arr[i] = arr[i] + arr[i - 1];
        }
        for (int i : arr)
            System.out.print(i + " ");
        int start = 2;
        int end = 6;
        System.out.println();
        System.out.println(start != 0 ? arr[end] : arr[end] - arr[start - 1]);
    }
}