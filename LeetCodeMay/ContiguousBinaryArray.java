import java.util.HashMap;
import java.util.Map;

public class ContiguousBinaryArray {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0,1};
        int total = 0;
        for (int c : nums)
            total += c;
//        if (total == nums.length || total == 0)
//            return 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            sum += nums[i]  == 0 ? -1 : 1;
            if (sum == 0) {
                max = Math.max(max, i + 1);
            } else if (!map.containsKey(sum)) {
                map.put(sum, i);
            } else {
                max = Math.max(max, i - map.get(sum));
            }
        }
        System.out.println(max);
    }

    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> cnts = new HashMap();
        cnts.put(0, -1);
        int length = 0;
        int count = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 0) {
                count += -1;
            }else{
                count += 1;
            }
            if (cnts.containsKey(count)) {
                length =Math.max(length, i - cnts.get(count));
            }else {
                cnts.put(count, i);
            }
        }
        return length;
    }
}
