package LeetCodeChallenges.LeetCodeJun.InvertBinaryTree;


import java.util.ArrayList;
import java.util.List;

public class Tree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(tree.getHeadNode(), 1);
        tree.insert(tree.getHeadNode(), 2);
        tree.insert(tree.getHeadNode(), 3);
        tree.insert(tree.getHeadNode(), 4);
        tree.insert(tree.getHeadNode(), 6);
        tree.insert(tree.getHeadNode(), 7);
        tree.insert(tree.getHeadNode(), 9);
        tree.display(tree.getHeadNode());
       tree.invertBinaryTree(tree.getHeadNode());
        System.out.println();
        tree.display(tree.getHeadNode());
    }
}
