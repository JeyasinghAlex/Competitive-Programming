import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        System.out.println(largeGroupPositions("abbxxxxzzy"));
    }

    public static List<List<Integer>> largeGroupPositions(String s) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4));
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4));

        int count = 1, index = 0;
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                ++count;
            } else if (count >= 3) {
                ans.add(new ArrayList(Arrays.asList(i - count, i - 1)));
                count = 1;
            } else {
                count = 1;
            }
        }
        return ans;
    }



    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        int max = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i > 0; i--){
            max = Math.max(max, arr[i]);
            res[i-1] = max;
        }
        res[arr.length - 1] = -1;
        return res;
    }
}