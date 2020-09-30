package LeetCodeChallenges.LeetCodeSep;

public class LargestNumber {

    public String largestNumber(int[] nums) {
        nums = new int[]{999999998,999999997,999999999};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (swap(nums[i], nums[j])) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        int sum = 0;
        for (int ch : nums) {
            sum += ch;
            sb.append(ch);
        }
        return sum == 0 ?  "0" : sb.toString();
    }

    private boolean swap(int a, int b) {
        String x = "" + a + b;
        String y = "" + b + a;
        long l = Long.parseLong(x);
        long m = Long.parseLong(y);
        return m > l;
    }
}
