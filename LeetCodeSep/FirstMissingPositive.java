package LeetCodeChallenges.LeetCodeSep;

import java.util.ArrayList;
import java.util.List;

public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {

        if (nums.length == 0)
            return 1;

        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for (int ch : nums) {
            if (ch > max) {
                max = ch;
            }
            list.add(ch);
        }

        for (int i = 1; i <= max; ++i) {
            if (!list.contains(i))
                return i;
        }

        return max < 0 ?  1 : max + 1;
    }
}
