package LeetCodeChallenges.LeetCodeJun;

import java.util.*;

public class LeastNumberUniqueIntegersAfterKRemovals {
    public static void main(String[] args) {
        int[] arr = {5,5,4};
        int k = 1;
        System.out.println(findLeastNumOfUniqueIntss(arr, k));
    }

    private static int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; ++i) {
//            count = map.containsKey(arr[i]) ? map.get(arr[i]) : 0;
//            count = map.getOrDefault(arr[i], 0);
//            map.put(arr[i], count + 1);
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int[][] pair = new int[map.size()][2];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pair[index++] = new int[]{entry.getKey(), entry.getValue()};
        }
        System.out.println(Arrays.deepToString(pair));
        Arrays.sort(pair, (a,b) -> (a[1] - b[1]));
        System.out.println(Arrays.deepToString(pair));
        int sum = 0;
        index = 0;
        int rem = 0;
        while (sum < k) {
            sum += pair[index++][1];
            if (sum > k)
                rem--;
            rem++;
        }
        return pair.length - rem;
    }

    /**
     * Efficient solution compare to above solution :
     */
    private static int findLeastNumOfUniqueIntss(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; ++i) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        int index = 0;
        int rem = 0;
        while (k > 0) {
            k -= list.get(index++);
            rem++;
        }
        if (k < 0) rem--;
        return list.size() - rem;
    }
}