package LeetCodeChallenges.LeetCodeJun;

import java.util.*;

public class FindTheDuplicateNumber {

    /* Note:
        You must not modify the array (assume the array is read only).
        You must use only constant, O(1) extra space.
        Your runtime complexity should be less than O(n2).
        There is only one duplicate number in the array, but it could be repeated more than once.
        * */
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,2};
        System.out.println(findDuplicateNum(arr));
        System.out.println(findDuplicateNums(arr));
        System.out.println(findDuplicate(arr));
        System.out.println(findDuplicatee(arr));
    }

    /* In this approach only eligible for values will be in array size range. */
    private static int findDuplicateNum(int[] nums) {
        if (nums.length == 0)
            return 0;
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    /* This method only used for positive Integer only*/
    private static int findDuplicateNums(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            if (nums[Math.abs(nums[i])] < 0) {
                return Math.abs(nums[i]);
            } else {
                nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])];
            }
        }
        return -1;
    }

    private static int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int c : nums) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
            int count = map.getOrDefault(c, 0) + 1;
            if (count == 1)
                map.put(c, count);
            else
                return c;
        }
        return -1;
    }

    private static int findDuplicatee(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int c : nums) {
            if (set.contains(c))
                return c;
            set.add(c);
        }
        return -1;
    }

    public int findDuplicateee(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return nums[i];
            }
        }
        return -1;
    }
}
