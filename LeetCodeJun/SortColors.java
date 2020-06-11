package LeetCodeChallenges.LeetCodeJun;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int[] arr = {2,0,2,1,1,0};
        int[] temp = new int[arr.length];
        for (int c : arr) {
            if (c > max)
                max = c;
        }
        int[] cnt = new int[max +  1];
        for (int c : arr) {
            cnt[c]++;
        }
        for (int i = 1; i < cnt.length; ++i)  {
            cnt[i] = cnt[i] + cnt[i - 1];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            temp[--cnt[arr[i]]] = arr[i];
        }
        System.out.println(Arrays.toString(temp));
    }
}
