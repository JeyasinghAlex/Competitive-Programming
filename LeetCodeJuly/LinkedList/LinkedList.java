package LeetCodeChallenges.LeetCodeJuly.LinkedList;

import LeetCodeChallenges.LeetCodeJuly.Tree.TreeNode;

public class LinkedList {

    private Node headNode;
    private Node tailNode;
    private int size;

    public void pushDataBack(TreeNode data) {
        Node newNode = new Node(data);
        if (headNode == null) {
            headNode = newNode;
            tailNode = newNode;
        } else {
            tailNode.next = newNode;
            tailNode = newNode;
        }
        size++;
    }

    public TreeNode popDataFront() {
        if (isEmpty())
            return null;
        TreeNode temp = headNode.data;
        headNode = headNode.next;
        size--;
        /* If only one data :- */
        if (headNode == null)
            tailNode = null;
        return temp;
    }

    public boolean isEmpty() {
        return headNode == null;
    }

    public int getListSize() {
        return size;
    }
}
