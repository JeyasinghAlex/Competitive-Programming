package LeetCodeChallenges.LeetCodeSep;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_II {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combination(0, target, candidates, result, new ArrayList<>());
        return result;
    }

    private void combination(int start, int n, int[] arr, List<List<Integer>> result, List<Integer> list) {
        if (n == 0) {
            result.add(new ArrayList<>(list));
        }
        for (int i = start; i < arr.length; ++i) {
            list.add(arr[i]);
            combination(i + 1, n - arr[i], arr, result, list);
            list.remove(list.size() - 1);
        }
    }
}

//candidates = [10,1,2,7,6,1,5],