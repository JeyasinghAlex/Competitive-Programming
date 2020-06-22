package LeetCodeChallenges.LeetCodeJun;

public class DungeonGame {
    public static void main(String[] args) {
        int[][] arr = {{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}};
        System.out.println(calculateMinimumHP(arr));
    }

    private static int calculateMinimumHP(int[][] dungeon) {
        int row = dungeon.length;
        int col = dungeon[0].length;
        int[][] dp = new int[row][col];
        for (int i = row - 1; i >= 0; --i) {
            for (int j = col - 1; j >= 0; --j) {
                if (i == row - 1 && j == col - 1)
                    dp[i][j] = Math.min(0, dungeon[i][j]);
                else if (i == row - 1)
                    dp[i][j] = Math.min(0, dungeon[i][j] + dp[i][j + 1]);
                else if (j == col - 1)
                    dp[i][j] = Math.min(0, dungeon[i][j] + dp[i + 1][j]);
                else
                    dp[i][j] = Math.min(0, dungeon[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j]));
            }
        }
        return Math.abs(dp[0][0]) + 1;
    }
}
