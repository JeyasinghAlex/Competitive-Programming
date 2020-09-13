package LeetCodeChallenges.LeetCodeSep;

public class SpecialPositionsBinaryMatrix {

    public int numSpecial(int[][] mat) {

        int ro = mat.length;
        int co = mat[0].length;
        int count = 0;

        int[] row = new int[ro];
        int[] col = new int[co];

        for (int i = 0; i < ro; ++i) {
            for (int j = 0; j < co; ++j) {
                if (mat[i][j] == 1) {
                    row[i]++;
                    col[j]++;
                }
            }
        }

        for (int i = 0; i < ro; ++i) {
            for (int j = 0; j < co; ++j) {
                if (mat[i][j] == 1 && row[i] == 1 && col[j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }
}