package LeetCodeChallenges.LeetCodeJuly.Queue;

import LeetCodeChallenges.LeetCodeJuly.LinkedList.LinkedList;
import LeetCodeChallenges.LeetCodeJuly.Tree.TreeNode;

public class Queue {

    private LinkedList list = new LinkedList();
    public void enqueue (TreeNode node) {
        list.pushDataBack(node);
    }

    public TreeNode dequeue () {
        return list.popDataFront();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.getListSize();
    }
}
