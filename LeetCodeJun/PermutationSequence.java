package LeetCodeChallenges.LeetCodeJun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationSequence {

    public static void main(String[] args) {
        int n = 3;
        int k = 5;
        System.out.println(getPermutationn(n, k));
    }

    private static String getPermutationn(int n, int k) {
        List<Integer> digit = new ArrayList<>();
        for (int i = 1; i <= n; ++i)
            digit.add(i);
        int[] fact = new int[n];
        fact[0] = 1;
        for (int i = 1; i < n; ++i)
            fact[i] = i * fact[i - 1];
        k = k - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; --i) {
            int index = k / fact[i - 1];
            k = k % fact[i - 1];
            sb.append(digit.remove(index));
        }
        return sb.toString();
    }

    private static String getPermutation(int n, int k) {
        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= n; ++i)
            s.append(i);

         permutation(s.toString(), 0, n - 1);
         return list.get(k);
    }

    private static List<String> list = new ArrayList<>();
    private static void permutation(String str, int l, int r) {
        if (l == r)
            list.add(str);
        else {
            for (int i = l; i <= r; ++i) {
                str = swap(str, l, i);
                permutation(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    private static String swap(String str, int i, int j) {
        char[] arr = str.toCharArray();
        char ch = arr[i];
        arr[i] = arr[j];
        arr[j] = ch;
        return String.valueOf(arr);
    }
}
