package LeetCodeChallenges.LeetCodeMay;

public class PrintMatrixDiagonal {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int row = arr.length;
        int col = arr[0].length;
        int ro = 0, co = 0;
        for (int i = 0; i < row; ++i) {
            ro = i;
            co = 0;
            while (ro >= 0) {
                System.out.print(arr[ro][co] + " ");
                ro--;
                co++;
            }
        }

        for (int i = 1; i < col; ++i) {
            ro = row - 1;
            co = i;
            while (co < col) {
                System.out.print(arr[ro][co] + " ");
                ro--;
                co++;
            }
        }
    }
}
