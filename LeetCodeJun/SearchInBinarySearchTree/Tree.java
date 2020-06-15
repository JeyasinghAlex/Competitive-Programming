package LeetCodeChallenges.LeetCodeJun.SearchInBinarySearchTree;

import LeetCodeChallenges.LeetCodeJun.InvertBinaryTree.Node;

public class Tree {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(tree.getHeadNode(), 4);
        tree.insert(tree.getHeadNode(), 2);
        tree.insert(tree.getHeadNode(), 7);
        tree.insert(tree.getHeadNode(), 3);
        tree.insert(tree.getHeadNode(), 1);
        Node node = tree.searchBTS(tree.getHeadNode(), 2);
        tree.display(node);
    }
}
