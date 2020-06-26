package LeetCodeChallenges.LeetCodeJun.SumRootToLeafNumbers;

import LeetCodeChallenges.LeetCodeJun.InvertBinaryTree.BinaryTree;
import LeetCodeChallenges.LeetCodeJun.InvertBinaryTree.Node;

import java.util.ArrayList;
import java.util.List;

public class SumRootLeafNumbers extends BinaryTree {


    public int sumNumbers(Node root) {

        /* First Method */
        sumOfLeafNode(root, "");
        int sum = 0;
        for (String s  : list) {
            sum += Integer.parseInt(s);
        }

        /* Second Method */
          sumOfLeafNodes(root, "");

        /* Third Method */
          dfs(root, 0);
          return sum;
    }

    private List<String> list = new ArrayList<>();
    private void sumOfLeafNode(Node currentNode, String s) {
        if (currentNode == null)
            return ;
         s += currentNode.getData();
        sumOfLeafNode(currentNode.getLeft(), s);
        if (currentNode.getLeft() == null && currentNode.getRight() == null)
            list.add(s);
        sumOfLeafNode(currentNode.getRight(), s);
    }

    private int sum = 0;
    private void sumOfLeafNodes(Node currentNode, String sb) {
        if (currentNode == null)
            return;

        sb += (currentNode.getData());

        if (currentNode.getLeft() == null && currentNode.getRight() == null) {
            sum += Integer.parseInt(sb);
            return;
        }

        sumOfLeafNodes(currentNode.getLeft(), sb);
        sumOfLeafNodes(currentNode.getRight(), sb);
    }

    private void dfs(Node currentNode, int data) {
        if (currentNode == null)
            return;

        if (currentNode.getLeft() == null && currentNode.getRight() == null) {
            sum += data * 10 + currentNode.getData();
            return;
        }

        data = data * 10 + currentNode.getData();
        dfs(currentNode.getLeft(), data);
        dfs(currentNode.getRight(), data);
    }
}
