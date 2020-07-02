package LeetCodeChallenges.LeetCodeJuly.BinaryTreeLevelOrderTraversalII;

import LeetCodeChallenges.LeetCodeJuly.Queue.Queue;
import LeetCodeChallenges.LeetCodeJuly.Tree.BinaryTree;
import LeetCodeChallenges.LeetCodeJuly.Tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeLevelOrderTraversal extends BinaryTree {

        public List<List<Integer>> levelOrderBottom(TreeNode currentNode) {
            Queue queue = new Queue();
            List<List<Integer>> result = new ArrayList<>();

            if (currentNode == null)
                return result;

            queue.enqueue(currentNode);

            while (!queue.isEmpty()) {

                int size = queue.size();
                List<Integer> list = new ArrayList<>();

                for (int i = 0; i < size; ++i) {
                    TreeNode node = queue.dequeue();
                    if (node.getLeft() != null) queue.enqueue(node.getLeft());
                    if (node.getRight() != null) queue.enqueue(node.getRight());
                    list.add(node.getData());
                }
                result.add(list);
            }
            Collections.reverse(result);
//            List<List<Integer>> reverse = new ArrayList<>();
//            for (int i = result.size() - 1; i >= 0; --i) {
//                reverse.add(result.get(i));
//            }
            return result;
        }
}
