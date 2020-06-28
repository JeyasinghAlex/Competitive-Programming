package LeetCodeChallenges.LeetCodeJun;

import java.util.ArrayList;
import java.util.List;

public class PerfectSquares {
    public static void main(String[] args) {
        int n = 43;
        System.out.println(numSquar(n));
    }

    private static int numSquar(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; ++i) {
            dp[i] = i;
            for (int  j = 1;  j * j <= i; ++j) {
                int sqr = j * j;
                dp[i] = Math.min(dp[i], 1 + dp[i - sqr]);
            }
        }
        return dp[n];
    }
    private static int numSquares(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = n; i > 0; --i) {
            if (isPerfectSquare(i))
                list.add(i);
        }
        int count = 0;
        int min = Integer.MAX_VALUE;
        int maxCount = 0;
        for (int i = 0; i < list.size(); ++i) {
            int m = n;
            maxCount = 0;
            for (int j = i; j < list.size(); ++j) {
                count = m / list.get(j);
                maxCount += count;
                m -= count * list.get(j);
            }
            if (maxCount < min)
                min = maxCount;
        }
        System.out.println(list);
        return min;
    }

    private static int numSquare(int n) {
        int res = 0;
        int maxCount = 0;
        int m = n;
        int maxCount1 = 0;
        for (int i  = n; i > 0; --i) {
            if (isPerfectSquare(i)) {
                maxCount = n / i;
                maxCount1 = m / i;
                res += maxCount;
                n -= maxCount * i;

                  if (n == 0)
                      return res;
                  if (maxCount1 * i == m)
                      return maxCount1;
            }
        }
        return res;
    }

    private static boolean isPerfectSquare(int n) {
        for (int i = 1; i * i <= n; ++i) {
            if (i * i == n)
                return true;
        }
        return false;
    }
}
