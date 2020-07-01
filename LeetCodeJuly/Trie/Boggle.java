package LeetCodeChallenges.LeetCodeJuly.Trie;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Boggle {

    public static void main(String[] args) {
        char[][] board = {{'g', 'i', 'z'}, {'u', 'e', 'k'}, {'q', 's', 'e'}};
        String[] words = {"geeks", "for", "quiz", "go"};
        boolean[][] visited = new boolean[board.length][board[0].length];
        Boggle boggle = new Boggle();
        System.out.println(boggle.findWords(board, words));
    }

    private List<String> findWords(char[][] board, String[] words) {
        Trie trie = new Trie();

        for (String s : words)
            trie.insert(s);

        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                dfs(board, "", i, j, trie);
            }
        }
        return new ArrayList<>(result);
    }

    private Set<String> result = new HashSet<>();
    private void dfs(char[][] board, String str, int row, int col, Trie trie) {
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] == '$')
            return;

        str = str + board[row][col];

        if (!trie.startWith(str))
            return;

        if (trie.search(str))
            result.add(str);

        char ch = board[row][col];
        board[row][col] = '$';
        dfs(board, str, row, col + 1, trie);
        dfs(board, str, row, col - 1, trie);
        dfs(board, str, row - 1, col, trie);
        dfs(board, str, row + 1, col, trie);
        dfs(board, str, row - 1, col - 1, trie);
        dfs(board, str, row + 1, col + 1, trie);
        dfs(board, str, row - 1, col + 1, trie);
        dfs(board, str, row + 1, col - 1, trie);
        board[row][col] = ch;
    }
}
