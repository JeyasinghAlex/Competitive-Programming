package LeetCodeChallenges.LeetCodeMay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntervalListIntersections {
    public static void main(String[] args) {
        int[][] arr1 = {{0, 2}, {5, 10}, {13, 23}, {24, 25}};
        int[][] arr2 = {{1, 5}, {8, 12}, {15, 24}, {25, 26}};
        List<int[]> list = new ArrayList<>();
        int a = 0, b = 0;
        int x = 0, y = 0;
        while (a < arr1.length && b < arr2.length) {
            if (arr1[a][0] <= arr2[b][1] && arr2[b][0] <= arr1[a][1]) {
                x = Math.max(arr1[a][0], arr2[b][0]);
                y = Math.min(arr1[a][1], arr2[b][1]);
                list.add(new int[]{x, y});
            }
            if (arr2[b][1] > arr1[a][1])
                a++;
            else
                b++;
        }
//        System.out.println(list.toArray(new int[list.size()][]));
        System.out.println(Arrays.deepToString(list.toArray(new int[list.size()][])));
    }
}
