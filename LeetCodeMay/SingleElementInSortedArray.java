public class SingleElementInSortedArray {
    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8}));
    }

    private static int singleNonDuplicate(int[] nums) {

        for (int i = 0; i < nums.length-1; i = i + 2) {
            if(nums[i] != nums[i+1])
                return nums[i];
        }
        return nums[nums.length-1];
    }
}
