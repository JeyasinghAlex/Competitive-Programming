package LeetCodeChallenges.LeetCodeJun.Trie;

public class Trie {

    private final TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void insert(String s) {
        TrieNode currentNode = root;
        for (char c : s.toCharArray()) {
            if (currentNode.nodes[c - 'a'] == null)
                currentNode.nodes[c - 'a'] = new TrieNode();
            currentNode = currentNode.nodes[c - 'a'];
        }
        currentNode.setEnd(true);
    }

    public boolean startWith(String s) {
        TrieNode currentNode = root;
        for (char c : s.toCharArray()) {
            if (currentNode.nodes[c - 'a'] == null)
                return false;
            currentNode = currentNode.nodes[c - 'a'];
        }
        return true;
    }

    public boolean search(String s) {
        TrieNode currentNode = root;
        for (char c : s.toCharArray()) {
            if (currentNode.nodes[c - 'a'] == null)
                return false;
            currentNode = currentNode.nodes[c - 'a'];
        }
        return currentNode.isEnd();
    }
}
