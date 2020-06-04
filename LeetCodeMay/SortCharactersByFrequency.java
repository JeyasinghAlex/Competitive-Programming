package LeetCodeChallenges.LeetCodeMay;

import java.util.Arrays;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s = "tree";
        int[] arr = new int[128+1];
        int[] letters = new int[128+1];

        for (char c : s.toCharArray())
            arr[c]++;

        int ch = 1;
        for (int i = 1; i <= 128; ++i) {
            letters[i] = ch++;
        }
       // sort(arr, letters);
        Arrays.sort(arr);
        Arrays.sort(letters);
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 128; ++i) {
            int a = arr[i];
            for (int j = 1; j <= a; ++j) {
                if (arr[i] != 0) {
                    str.append((char) letters[i]);
                    arr[i]--;
                }
            }
        }
        System.out.println(str);
    }

    private static void sort(int[] arr, int[] letters) {

        for (int i = 0; i < 128; ++i) {
            for (int j = i +1; j < 128; ++j) {
                if (arr[i] < arr[j]) {
                    int tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;

                    int temp = letters[i];
                    letters[i] = letters[j];
                    letters[j] = temp;
                }
            }
        }
    }
}
