package LeetCodeChallenges.LeetCodeOct;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        combination(0, target, candidates, list, ans);
        return list;
    }

    private void combination(int start, int target, int[] arr, List<List<Integer>> list, List<Integer> ans) {

        if (target < 0) {
            return;
        }

        if (target == 0) {
            list.add(new ArrayList<>(ans));
        }

        for (int i = start; i < arr.length; ++i) {
            ans.add(arr[i]);
            combination(i, target - arr[i], arr, list, ans);
            ans.remove(ans.size() - 1);
        }
    }
}