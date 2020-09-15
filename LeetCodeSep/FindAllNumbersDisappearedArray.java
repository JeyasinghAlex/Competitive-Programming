package LeetCodeChallenges.LeetCodeSep;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedArray {

    //Approach1 : Without using extra space:
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i]) - 1;
//            nums[index] = Math.abs(nums[j]) * -1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }
        return list;
    }

    //Approach2 : With using extra space:
    public List<Integer> findDisappearedAnNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] count = new int[nums.length + 1];
        for (int ch : nums) {
            count[ch]++;
        }

        for (int i = 1; i < nums.length; ++i) {
            if (count[i] == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
