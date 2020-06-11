package LeetCodeChallenges.LeetCodeJun;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsertt(nums, target));
    }

    private static int searchInsertt(int[] nums, int target) {
        int st = 0;
        int ed = nums.length - 1;
        int mid = 0;
        while (st <= ed) {
            mid = st +  (ed - st) / 2;
            if (target == nums[mid])
                return mid;
            if (target > nums[mid])
                st = mid + 1;
            else
                ed = mid - 1;

        }
        return st;
    }
    private static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; ++i) {
            if (target <= nums[i])
                return i;
        }
        return nums.length;
    }
}
