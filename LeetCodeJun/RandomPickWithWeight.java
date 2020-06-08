package LeetCodeChallenges.LeetCodeJun;

public class RandomPickWithWeight {

    int[] bucket;
    public RandomPickWithWeight(int[] w) {
        bucket = new int[w.length];
        int sum = 0;
        for (int i = 0; i < w.length; ++i) {
            sum += w[i];
            bucket[i] = sum;
        }
        System.out.println(pickIndex());
    }

    public int pickIndex() {
        int rand = (int)(bucket[bucket.length - 1] * Math.random());
        int ans = -1;
        int st = 0, ed = bucket.length - 1;

        while (st <= ed) {
            int mid = st + (ed - st) / 2;
            if (rand < bucket[mid]) {
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
