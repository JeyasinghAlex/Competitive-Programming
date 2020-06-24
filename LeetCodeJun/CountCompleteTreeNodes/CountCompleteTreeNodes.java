package LeetCodeChallenges.LeetCodeJun.CountCompleteTreeNodes;

import LeetCodeChallenges.LeetCodeJun.InvertBinaryTree.BinaryTree;
import LeetCodeChallenges.LeetCodeJun.InvertBinaryTree.Node;

public class CountCompleteTreeNodes extends BinaryTree {
    private int count = 0;

    public int countNodes(Node root) {
        inorderTraversal(root);
        return count;
    }

    private void inorderTraversal(Node currentNode) {
        if (currentNode != null) {
            inorderTraversal(currentNode.getLeft());
            ++count;
            inorderTraversal(currentNode.getRight());
        }
    }

    /***
     *  2nd approach : level by level checking
     */
    public int countAllNodes(Node root) {
        if (root == null)
            return 0;

        int leftCount = 1;
        int rightCount = 1;
        Node left = root.getLeft();
        Node right = root.getRight();
        while (left != null) {
            leftCount += 1;
            left = left.getLeft();
        }

        while (right != null) {
            rightCount += 1;
            right = right.getRight();
        }

        if (leftCount == rightCount)
            return power(leftCount) - 1;
//        (int)Math.pow(2, leftCount) - 1;

        return 1 + countAllNodes(root.getLeft()) + countAllNodes(root.getRight());
    }

    private int power(int n) {
        int i = 0;
        int pow = 1;
        while (n > i) {
            pow = 2 * pow;
            ++i;
        }
        return pow;
    }

    public int count(Node root, int count) {
        if (root == null)
            return count;
        int cntLeft = count(root.getLeft(), ++count);
        int cntRight = count(root.getRight(), ++count);
        if (cntLeft == cntRight)
            return (int)Math.pow(2, cntLeft) - 1;
        return 1 + count(root.getLeft(), 0) + count(root.getRight(), 0);
    }
}
