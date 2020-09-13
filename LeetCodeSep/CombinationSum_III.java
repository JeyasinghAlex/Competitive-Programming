package LeetCodeChallenges.LeetCodeSep;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_III {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList();
        combinations(1, n, k, new ArrayList(), result);
        return result;
    }

    private void combinations(int start, int n, int k, List<Integer> list, List<List<Integer>> result) {
        if (n == 0 && list.size() == k) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i <= 9; i++) {
            list.add(i);
            combinations(i + 1, n - i, k, list, result);
            //back tracking always remove last element
            list.remove(list.size() - 1);
        }
    }
}
