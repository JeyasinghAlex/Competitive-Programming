import java.util.HashMap;
import java.util.Map;

public class MajorityElementOrMooreVotingAlgorithm {

    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(isMajority(arr, mooreVotingAlgorithm(arr)) ? mooreVotingAlgorithm(arr) : 0);
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int c : arr) {
//            count = map.containsKey(c) ? map.get(c) : 0;
            count = map.getOrDefault(c, 0);
            map.put(c, count + 1);
            if (map.containsKey(c) && map.get(c) > arr.length / 2) {
                System.out.println(c);
                break;
            }
        }
    }

    private static int mooreVotingAlgorithm(int[] arr) {
        int majorityElement = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] == majorityElement) {
                count++;
            }else {
                count--;
                if (count == 0)  {
                    majorityElement = arr[i];
                    count = 1;
                }
            }
        }
        return majorityElement;
    }

    private static boolean isMajority(int[] arr, int majorityElement) {
        int count = 0;
        for (int c : arr) {
            if (c == majorityElement)
                count++;
            if (count > arr.length / 2)
                return true;
        }
        return false;
    }
}
