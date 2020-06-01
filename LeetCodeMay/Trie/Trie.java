package Trie;

public class Trie {
    /** Refferance link
     * https://leetcode.com/articles/implement-trie-prefix-tree/
     * https://github.com/gkcs/Competitive-Programming/blob/master/src/main/java/main/java/videos/Tries.java
     */
    private final TrieNode  root;
    public Trie() {
        root = new TrieNode();
    }

    public void insert(String s) {
        TrieNode current = root;
        for (char c : s.toCharArray()) {
            if (current.nodes[c - 'a'] == null) {
                current.nodes[c - 'a'] = new TrieNode();
            }
            current = current.nodes[c - 'a'];
        }
        current.setEnd(true);
    }

    public boolean search(String s) {
        TrieNode current = root;
        for (char c : s.toCharArray()) {
            if (current.nodes[c - 'a'] == null) {
                return false;
            }
            current = current.nodes[c - 'a'];
        }
        return current.isEnd();
    }

    public boolean startWith(String prefix) {
        TrieNode current = root;
        for (char c : prefix.toCharArray()) {
            if (current.nodes[c - 'a'] == null) {
                return false;
            }
            current = current.nodes[c - 'a'];
        }
        return true;
    }

    public boolean delete(String s) {
        TrieNode current = root;
        for (char c : s.toCharArray()) {
            if (current.nodes[c - 'a'] == null) {
                return false;
            }
            current = current.nodes[c - 'a'];
        }
        if (current.isEnd())
            current.setEnd(false);

        return false;
    }

    public void update(String oldStr, String newStr) {
          delete(oldStr);
          insert(newStr);
    }

//    public int search(String s) {
//        TrieNode current = root;
//        for (int i = 0; i < s.length(); ++i) {
//            if (current.nodes[s.charAt(i) - 'a'] == null) {
//                return 0;
//            }
//            current = current.nodes[s.charAt(i) - 'a'];
//        }
//        return current.end;
//    }

/*
    class Trie {

        class TrieNode {
            private TrieNode[] children = new TrieNode[26];
            private boolean isEnd = false;

            public void setEnd() {
                isEnd =true;
            }
            public boolean isEnd() {
                return isEnd;
            }
        }

        //-------------------------------------------------------------------------------------
        private TrieNode root;
        */
/** Initialize your data structure here. *//*

        public Trie() {
            root = new TrieNode();
        }

        */
/** Inserts a word into the trie. *//*

        public void insert(String word) {
            TrieNode p =root;
            for(char c: word.toCharArray()) {
                if(p.children[c-'a'] == null) {
                    p.children[c-'a'] = new TrieNode();
                }
                p= p.children[c-'a'];
            }
            p.setEnd();
        }

        */
/** Returns if the word is in the trie. *//*

        public boolean search(String word) {
            TrieNode p =root;
            for(char c: word.toCharArray()) {
                if(p.children[c-'a'] == null) {
                    return false;
                }
                p= p.children[c-'a'];
            }
            return p.isEnd();
        }

        */
/** Returns if there is any word in the trie that starts with the given prefix. *//*

        public boolean startsWith(String prefix) {
            TrieNode p =root;
            for(char c: prefix.toCharArray()) {
                if(p.children[c-'a'] == null) {
                    return false;
                }
                p= p.children[c-'a'];
            }
            return true;
        }
    }
*/

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
}
