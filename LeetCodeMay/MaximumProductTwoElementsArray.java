import java.util.Arrays;
import java.util.Collections;

public class MaximumProductTwoElementsArray {
    public static void main(String[] args) {
        int[] arr = {3,7};
        System.out.println(maxProduct(arr));
    }

    private static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length;
//        while (i < j) {
//            int temp = nums[i];
//            nums[i] = nums[nums.length - i - 1];
//            nums[nums.length - i - 1] = temp;
//            i++;
//            j--;
//        }
        System.out.println(Arrays.toString(nums));
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
}
