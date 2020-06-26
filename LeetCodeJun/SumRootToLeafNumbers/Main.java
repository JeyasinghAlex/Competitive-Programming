package LeetCodeChallenges.LeetCodeJun.SumRootToLeafNumbers;

import LeetCodeChallenges.LeetCodeJun.InvertBinaryTree.BinaryTree;

public class Main {

    public static void main(String[] args) {
        SumRootLeafNumbers tree = new SumRootLeafNumbers();
        tree.insert(tree.getHeadNode(), 1);
        tree.insert(tree.getHeadNode(), 0);
//        System.out.println("------   " + tree.sumNumbers(tree.getHeadNode()));
        System.out.println(tree.sumNumbers(tree.getHeadNode()));
    }
}
