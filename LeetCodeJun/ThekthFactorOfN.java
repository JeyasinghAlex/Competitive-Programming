package LeetCodeChallenges.LeetCodeJun;

import java.util.ArrayList;
import java.util.List;

public class ThekthFactorOfN {
    public static void main(String[] args) {

        System.out.println(kthFactor(12, 3));
    }

    public static int kthFactor(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            if (n %  i == 0)
                list.add(i);
        }
        System.out.println(list);
        return k > list.size() ? -1 : list.get(k - 1);
    }
}
