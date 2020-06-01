package Trie;

public class TrieNode {
    private boolean isEnd = false;
    TrieNode[] nodes = new TrieNode[26];

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean isEnd) {
        this.isEnd = isEnd;
    }
}
