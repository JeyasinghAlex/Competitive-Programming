public class CountSquareSubMatricesWithAllOnes {

    public static void main(String[] args) {
        int[][] matrix = { {0,1,1,1}, {1,1,1,1}, {0,1,1,1} };
        int row = matrix.length;
        int col = matrix[0].length;
        int count = 0;
        int[][] sub = new int[row][col];
        for (int i = 0; i < row; ++i) {
            sub[i][0] = matrix[i][0];
            count += sub[i][0];
        }

        for (int i = 0; i < col; ++i) {
            sub[0][i] = matrix[0][i];
            count += sub[0][i];
        }

        for (int i = 1; i < row; ++i) {
            for (int j = 1; j < col; ++j) {
                if (matrix[i][j] == 1)
                sub[i][j] = Math.min(Math.min(sub[i - 1][j], sub[i][j - 1]), sub[i - 1][j - 1]) + 1;
                count += sub[i][j];
            }
        }
        System.out.println(count);
    }
}
