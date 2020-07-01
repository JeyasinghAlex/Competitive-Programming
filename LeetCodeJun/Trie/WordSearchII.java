package LeetCodeChallenges.LeetCodeJun.Trie;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordSearchII {

    /** Refferance link
     * https://www.programcreek.com/2014/06/leetcode-word-search-ii-java/
     * */

    public static void main(String[] args) {
//        char[][] board = {{'o', 'a', 'a', 'n'}, {'e', 't' ,'a' ,'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}};
        char[][] board = {{'a'}, {'a'}};
//        String[] words = {"oath", "pea", "eat", "rain"};
        String[] words = {"a"};
        WordSearchII obj = new WordSearchII();
        System.out.println(obj.findWords(board, words));
    }

    public List<String> findWords(char[][] board, String[] words) {
        Trie trie = new Trie();
        boolean[][] visited = new boolean[board.length][board[0].length];

        for (String s : words)
            trie.insert(s);

        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                dfs(board, visited, "", i, j, trie);
            }
        }
        return new ArrayList<>(result);
    }

    private Set<String> result = new HashSet<>();
    private void dfs(char[][] board, boolean[][] visited, String str, int row, int col, Trie trie) {

        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] == '$')
            return;

//        if (visited[row][col])
//            return;

        str = str + board[row][col];

        if (!trie.startWith(str))
            return;

        if (trie.search(str))
            result.add(str);

        /* Why we need extra space ? */
//        visited[row][col] = true;
        char ch = board[row][col];
        board[row][col] = '$';
        dfs(board, visited, str, row + 1, col, trie);
        dfs(board, visited, str, row - 1, col, trie);
        dfs(board, visited, str, row, col + 1, trie);
        dfs(board, visited, str, row, col - 1, trie);
        board[row][col] = ch;
//        visited[row][col] = false;
    }
}