package LeetCodeChallenges.LeetCodeJun.SearchInBinarySearchTree;

import LeetCodeChallenges.LeetCodeJun.InvertBinaryTree.BinaryTree;
import LeetCodeChallenges.LeetCodeJun.InvertBinaryTree.Node;

public class BinarySearchTree extends BinaryTree {

    public Node searchBTS(Node currentNode, int data) {

        if (currentNode == null)
            return null;

        if (currentNode.getData() == data)
            return currentNode;
        else if (currentNode.getData() > data)
            return searchBTS(currentNode.getLeft(), data);
        else
            return searchBTS(currentNode.getRight(), data);
    }
}
