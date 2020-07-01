package LeetCodeChallenges.LeetCodeJuly.Trie;

public class TrieNode {

    public TrieNode[] nodes = new TrieNode[26];
    private boolean isEnd;

    public TrieNode[] getNodes() {
        return nodes;
    }

    public void setNodes(TrieNode[] nodes) {
        this.nodes = nodes;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }
}
