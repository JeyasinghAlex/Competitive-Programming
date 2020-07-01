package LeetCodeChallenges.LeetCodeJuly;

public class ArrangingCoins {

    public static void main(String[] args) {
        int n = 8;
        System.out.println(arrangeCoin(n));
    }

    private static int arrangeCoins(int n) {
         long sum = 0;
         int i = 1;
        for ( ; sum <= n; ++i) {
            sum = sum + i;
        }
        return i - 2;
    }

    private static int arrangeCoin(int k) {
        int rt = 0;
        int lt = k;
        long n = 0;
        long curr = 0;
        while (rt <= lt) {
             n = rt + (lt - rt) / 2;
             curr = n * (n + 1) / 2;
             if (curr == k)
                 return (int)n;
             if (k < curr)
                 lt = (int)n - 1;
             else
                 rt = (int)n  + 1;
        }
        return rt;
    }
}
