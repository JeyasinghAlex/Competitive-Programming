package LeetCodeChallenges.LeetCodeMay.Tree;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Tree {
    public static void main(String[] args) {
//        8,5,1,7,10,12
        BinaryTree tree = new BinaryTree();
        tree.insert(tree.getRootNode(), 8);
        tree.insert(tree.getRootNode(), 5);
        tree.insert(tree.getRootNode(), 1);
        tree.insert(tree.getRootNode(), 7);
        tree.insert(tree.getRootNode(), 10);
        tree.insert(tree.getRootNode(), 12);
        tree.traversePreOrder(tree.getRootNode());
        Queue<Integer> queue = new ArrayDeque<>();

    }
}
