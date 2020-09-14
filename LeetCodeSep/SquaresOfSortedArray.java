package LeetCodeChallenges.LeetCodeSep;

import java.util.Arrays;

public class SquaresOfSortedArray {

    //Approach 1: Sort
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; ++i) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }

    //Approach 2: Two Pointer
    public int[] sortedSquare(int[] arr) {
        int j = 0;
        int index = 0;
        int[] ans = new int[arr.length];
        while (arr[j] < 0) {
            ++j;
        }
        int i = j - 1;
        while (i >= 0 && j < arr.length) {
            if (arr[i] * arr[i] < arr[j] * arr[j]) {
                ans[index++] = arr[i] * arr[i];
                i--;
            } else {
                ans[index++] = arr[j] * arr[j];
                j++;
            }
        }

        while (i >= 0) {
            ans[index++] = arr[i] * arr[i];
            i--;
        }
        while (j < arr.length) {
            ans[index++] = arr[j] * arr[j];
            j++;
        }
        return ans;
    }

    public int[] sortedSqr(int[] arr) {
        int  st = 0;
        int ed = arr.length - 1;
        int index = ed;
        int[] ans = new int[arr.length];

        while (st <= ed) {
            int left = arr[st] * arr[st];
            int right = arr[ed] * arr[ed];
            if (right > left) {
                ans[index--] = right;
                ed--;
            }else {
                ans[index--] = left;
                st++;
            }
        }
        return ans;
    }

}
