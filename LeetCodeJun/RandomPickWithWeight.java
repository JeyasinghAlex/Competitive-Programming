package LeetCodeChallenges.LeetCodeJun;

public class RandomPickWithWeight {

    int[] cumSum;
    public RandomPickWithWeight(int[] w) {
        cumSum = new int[w.length];
        int sum = 0;
        for (int i = 0; i < w.length; ++i) {
            sum += w[i];
            cumSum[i] = sum;
        }
    }

    public int pickIndex() {
        int rand = (int)(cumSum[cumSum.length - 1] * Math.random());
        int ans = -1;
        int st = 0, ed = cumSum.length - 1;

        while (st <= ed) {
            int mid = st + (ed - st) / 2;
            if (rand < cumSum[mid]) {
                ans = mid;
                ed = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
