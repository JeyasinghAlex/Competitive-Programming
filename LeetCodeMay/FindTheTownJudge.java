package LeetCodeChallenges.LeetCodeMay;

public class FindTheTownJudge {
    public static void main(String[] args) {

    }

    private static int findJudge(int N, int[][] trust) {

        int[] cnt = new int[N + 1];

        for (int[] row : trust) {
            cnt[row[0]]--;
            cnt[row[1]]++;
        }

        for (int i = 1; i <= N; ++i) {
            if (cnt[i] == N - 1)
                return i;
        }
        return -1;

    }
}
