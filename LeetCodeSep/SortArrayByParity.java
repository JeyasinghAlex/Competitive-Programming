package LeetCodeChallenges.LeetCodeSep;

import java.util.Arrays;

public class SortArrayByParity {

    //    Approach 1: Sort
    public int[] sortArrayByParity(int[] A) {
        for (int i = 0; i < A.length; ++i) {
            if (A[i] % 2 == 0) {
                A[i] = -A[i];
            }
        }
        Arrays.sort(A);
        for (int i = 0; i < A.length; ++i) {
            A[i] = A[i] < 0 ? -A[i] : A[i];
        }
        return A;
    }

    //    Approach 2: Using Extra Array
    public int[] sortArrayParity(int[] A) {

        int[] ans = new int[A.length];
        int index = 0;
        for (int i = 0; i < A.length; ++i) {
            if (A[i] % 2 == 0) {
                ans[index++] = A[i];
            }
        }

        for (int i = 0; i < A.length; ++i) {
            if (A[i] % 2 == 1) {
                ans[index++] = A[i];
            }
        }
        return ans;
    }

    //    Approach 3: Swapping
    public int[] sortArrayParit(int[] A) {
        int index = 0;
        for (int i = 0; i < A.length; ++i) {
            if (A[i] % 2 == 0) {
                int temp = A[index];
                A[index] = A[i];
                index++;
            }
        }
        return A;
    }
}