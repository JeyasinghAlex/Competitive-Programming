package LeetCodeChallenges.LeetCodeJuly;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrisonCellsAfterNDays {

    public static void main(String[] args) {
        int[] cells = {0, 1, 0, 1, 1, 0, 0, 1};
        int n = 7;
        int[] arr = prisonAfterNDay(cells, n);
        System.out.println(Arrays.toString(arr));
    }

    /* Brute force Approach :- */
    public static int[] prisonAfterNDays(int[] cells, int n) {
        for (int i = 1; i <= n; ++i) {
            cells = nextDayState(cells);
        }
        return cells;
    }

    public static int[] prisonAfterNDay(int[] cells, int n) {
        Set<String> set = new HashSet<>();
        boolean cycle = false;
        int len = 0;
        for (int i = 1; i <= n; ++i) {
            cells = nextDayState(cells);
            String s = Arrays.toString(cells);
            if (set.contains(s)) {
                cycle = true;
                break;
            }
            set.add(s);
            len++;
        }
        if (cycle)
            prisonAfterNDay(cells, n % len);
        return cells;
    }

    private static int[] nextDayState(int[] cells) {
        int[] next = new int[cells.length];
        for (int i = 1; i < cells.length - 1; ++i) {
            next[i] = cells[i - 1] == cells[i + 1] ? 1 : 0;
        }
        return next;
    }

    /* Efficient solution :- */


}
