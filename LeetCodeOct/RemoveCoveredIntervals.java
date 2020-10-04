package LeetCodeChallenges.LeetCodeOct;

import java.util.Arrays;
import java.util.Comparator;

public class RemoveCoveredIntervals {

    public int removeCoveredIntervals(int[][] intervals) {

        intervals = new int[][]{{1, 4}, {3,6}, {2,8}};
        int[] curr = new int[]{-1, -1};
        int res = 0;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] t1, int[] t2) {
                return t1[0] > t2[0] ? 1 : -1;
            }
        });

        for (int[] arr : intervals) {
            if (arr[0] > curr[0] && arr[1] > curr[1]) {
                curr[0] = arr[0];
                ++res;
            }
            curr[1] = Math.max(curr[1], arr[1]);
        }
        return res;
    }
}
