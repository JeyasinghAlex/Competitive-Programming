import java.util.ArrayList;
import java.util.List;

public class Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {

        for (int i = 1; i < triangle.size(); ++i) {
            List<Integer> prev = triangle.get(i - 1);
            List<Integer> curr = triangle.get(i);

            for (int j = 0; j < curr.size(); ++j) {
                if (j == 0) {
                    int ans = prev.get(j) + curr.get(j);
                    curr.set(0, ans);
                } else if (j == curr.size() - 1) {
                    int ans = curr.get(j) + prev.get(j - 1);
                    curr.set(j, ans);
                } else {
                    int ans1 = curr.get(j) + prev.get(j - 1);
                    int ans2 = curr.get(j) + prev.get(j);
                    int min = Math.min(ans1, ans2);
                    curr.set(j, min);
                }
            }

            triangle.set(i, new ArrayList<>(curr));
        }

        int min = Integer.MAX_VALUE;
        for (int a : triangle.get(triangle.size() - 1)) {
            min = Math.min(min, a);
        }

        return min;

    }
}