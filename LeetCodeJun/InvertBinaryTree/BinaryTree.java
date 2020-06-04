package LeetCodeChallenges.LeetCodeJun.InvertBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    private Node root = null;

    public void insert(Node root, int data) {
        this.root = constructBinaryTree(root, data);
    }

    public Node getHeadNode() {
        return this.root;
    }

    private Node constructBinaryTree(Node currentNode, int data) {
        if (currentNode == null) {
            return new Node(data);
        } else if (currentNode.getData() > data) {
            currentNode.setLeft(constructBinaryTree(currentNode.getLeft(), data));
        } else {
            currentNode.setRight(constructBinaryTree(currentNode.getRight(), data));
        }
        return currentNode;
    }

    public void invertBinaryTree(Node currentNode) {
        if (currentNode == null)
            return;
        invertBinaryTree(currentNode.getLeft());
        invertBinaryTree(currentNode.getRight());

        Node temp = currentNode.getLeft();
        currentNode.setLeft(currentNode.getRight());
        currentNode.setRight(temp);
        /** Nick White Solution*/
//        if (currentNode == null)
//            return currentNode;
//       Node left = invertBinaryTree(currentNode.left);
//       Node right = invertBinaryTree(currentNode.right);
//       currentNode.left = right;
//       currentNode.right = left;
//       return currentNode
    }
    public void display(Node currentNode) {
        if (currentNode != null) {
            display(currentNode.getLeft());
            System.out.print(currentNode.getData() + " ");
            display(currentNode.getRight());
        }
    }
}
