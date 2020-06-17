package LeetCodeChallenges.LeetCodeJun;

import java.util.Arrays;

public class SurroundedRegions {
    public static void main(String[] args) {
        char[][] board = {{'X','O','O','X','X','X','O','X','O','O'}, {'X','O','X','X','X','X','X','X','X','X'},
                    {'X','X','X','X','O','X','X','X','X','X'}, {'X','O','X','X','X','O','X','X','X','O'},
                    {'O','X','X','X','O','X','O','X','O','X'}, {'X','X','O','X','X','O','O','X','X','X'},
                    {'O','X','X','O','O','X','O','X','X','O'}, {'O','X','X','X','X','X','O','X','X','X'},
                    {'X','O','O','X','X','O','X','X','O','O'},{'X','X','X','O','O','X','O','X','X','O'}};
        solve(board);
        System.out.println(Arrays.deepToString(board));
    }

    private static void solve(char[][] board) {

        if (board.length <= 2 || board[0].length <= 2 )
            return;

        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] == 'O' && (i == 0 || i == board.length - 1 || j == 0 || j == board[0].length - 1))
                    dfsUtil(board, i, j);
            }
        }

        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] == 'O')
                    board[i][j] = 'X';
                else if(board[i][j] == 'Y')
                    board[i][j] = 'O';
            }
        }
    }
    private static void dfsUtil(char[][] board, int row, int col) {

        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != 'O')
            return;

        if (board[row][col] == 'O')
            board[row][col] = 'Y';

        dfsUtil(board, row, col + 1);
        dfsUtil(board, row, col - 1);
        dfsUtil(board, row + 1, col);
        dfsUtil(board, row - 1, col);
    }
}
