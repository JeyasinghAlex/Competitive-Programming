package LeetCodeChallenges.LeetCodeSep;

public class Main {

    public static void main(String[] args) {
        MaximumProductSubArray obj = new MaximumProductSubArray();
        int[] nums = {2, 0};
        int ans = obj.brutFores(nums);
        System.out.println(ans);
    }
}
