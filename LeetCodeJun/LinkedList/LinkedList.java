package LeetCodeChallenges.LeetCodeJun.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LinkedList {

    private Node headNode;
    private Node tailNode;

    public void insert(int data) {
        Node node = new Node(data);
        if (headNode == null)  {
            headNode = node;
        } else {
            tailNode.next = node;
        }
        tailNode = node;
    }

    public void remove(Node currentNode, int data) {
        if (currentNode.data == data) {
            headNode = headNode.next;         /** Start Node remove :-*/
        } else {
            Node nextNode = currentNode.next;
            while (nextNode.data != data) {  // null pointer exception
                nextNode = nextNode.next;
                currentNode = currentNode.next;
            }
            if (nextNode.next == null) {
                currentNode.next = null;         /** Last Node remove :-*/
            } else {
                currentNode.next = nextNode.next; /**Internal Node remove :-*/
            }
        }
    }

    public void delete(Node node, int data) {
        if (!isFirst(node, data))
            if (!isLast(node, data))
                isInternal(node, data);
    }

    public void deleted(Node currentNode, int data) {
        Node temp = currentNode;
        if (currentNode.data == data) {
            headNode = headNode.next;
            return;
        }
        Node previousNode = currentNode;
        while (currentNode.next != null) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        if (currentNode.data == data) {
            previousNode.next = null;
            return;
        }
        isInternal(temp, data);
    }

    private boolean isFirst(Node currentNode, int data) {
        if (currentNode.data == data) {
            headNode = headNode.next;
            return true;
        }
        return false;
    }

    private boolean isLast(Node currentNode, int data) {
        Node previousNode = currentNode;
        while (currentNode.next != null) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        if (currentNode.data == data) {
            previousNode.next = null;
            return true;
        }
        return false;
    }

    private void isInternal(Node currentNode, int data) {
        if (currentNode.data == data) {
            currentNode.data = currentNode.next.data;
            currentNode.next = currentNode.next.next;
            return;
        }
        if (currentNode.next != null)
            isInternal(currentNode.next, data);
    }

    public void display(Node currentNode) {
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }
    public Node getHeadNode() {
        return this.headNode;
    }

    public void removeNthElement(Node currentNode, int n) {
        int i = 1;
        while (i < n - 1) {
            currentNode = currentNode.next;
            i++;
        }
        Node nextNode = currentNode.next;
        currentNode.next = nextNode.next;
    }

    /** My Own :- */
    public void mergeTwoLists(Node list1, Node list2) {
//        if (list1 == null)
//            return list2;
//        if(list2 == null)
//            return list1;

        Node temp = list1;
        while (list1.next != null) {
            list1 = list1.next;
        }
        list1.next = list2;
        sortLinkedList(temp);
    }

    public void sortLinkedList(Node currentNode) {
        Node temp = currentNode;
        List<Integer> list = new ArrayList<>();
        while (currentNode != null) {
            list.add(currentNode.data);
            currentNode = currentNode.next;
        }
        Collections.sort(list);
        while (temp != null) {
            temp.data = list.remove(0);
            temp = temp.next;
        }
    }

    public Node mergeTwoList(Node list1, Node list2) {
        if (list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        Node head = null;
        Node sortingNode = null;
        /** Find Head :- */
        if (list1.data <= list2.data) {
            sortingNode = list1;
            list1 = list1.next;
        } else {
            sortingNode = list2;
            list2 = list2.next;
        }
        head = sortingNode;

        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                sortingNode.next = list1;
                sortingNode = list1;
                list1 = list1.next;
            } else {
                sortingNode.next = list2;
                sortingNode = list2;
                list2 = list2.next;
            }
        }

        if (list1 == null) {
            sortingNode.next = list2;
        }
        if (list2 == null) {
            sortingNode.next = list1;
        }
        return head;
    }
}
