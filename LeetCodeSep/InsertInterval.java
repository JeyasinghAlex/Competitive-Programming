package LeetCodeChallenges.LeetCodeSep;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> result = new ArrayList<>();
        for (int[] row : intervals) {
            if (row[1] < newInterval[0]) {
                result.add(row);
            } else if (row[0] > newInterval[1]) {
                result.add(newInterval);
                newInterval = row;
            } else {
                newInterval[0] = Math.min(row[0], newInterval[0]);
                newInterval[1] = Math.max(row[1], newInterval[1]);
            }
        }
        result.add(newInterval);
        return result.toArray(new int[result.size()][]);
    }
}
