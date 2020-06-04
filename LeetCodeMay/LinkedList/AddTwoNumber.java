package LeetCodeChallenges.LeetCodeMay.LinkedList;

public class AddTwoNumber {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(3);
        list.insert(4);
        list.insert(2);
        LinkedList list1 = new LinkedList();
        list1.insert(4);
        list1.insert(6);
        list1.insert(5);
        list.reverseListUsingRecursive(list.getHeadNode());
        list1.reverseListUsingRecursive(list1.getHeadNode());
        Node node = addLinkedList(list.getHeadNode(), list1.getHeadNode());
        LinkedList list2 = new LinkedList();
        list2.reverseListUsingRecursive(node);
        list2.display(list2.getHeadNode());
    }

    public static Node addLinkedList(Node node1, Node node2) {
        Node node = new Node(0);
        Node head = node;
        int data1 = 0, data2 = 0, cy = 0, total = 0, digit = 0;
        while (node1 != null || node2 != null)  {

             data1 = (node1 != null) ? node1.data : 0;
             data2 = (node2 != null) ? node2.data : 0;

             total = data1 + data2 + cy;
             cy = total / 10;
             digit = total % 10;

             Node newNode = new Node(digit);
             node.next = newNode;
             node = newNode;

             if (node1 != null)
                 node1 = node1.next;

             if (node2 != null)
                 node2 = node2.next;
        }

        if (cy != 0) {
//            Node cyNode = new Node(cy);
//            node.next = cyNode;
            node.next = new Node(cy);
        }
        return head.next;
    }
}
