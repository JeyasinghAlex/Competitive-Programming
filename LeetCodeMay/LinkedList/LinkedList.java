package LinkedList;

public class LinkedList {
    private Node head = null;
    private Node tail = null;

    public Node getHeadNode() {
        return this.head;
    }
    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        }else {
            tail.next = node;
        }
        tail = node;
    }

    public void display(Node currentNode) {
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }


    public Node oddEven(Node node) {
        if (node == null)
            return null;

          Node oddHead = node;
          Node evenHead = node.next;
          Node oddTail = node;
          Node evenTail = node.next;

          while (evenTail != null && evenTail.next != null) {
              oddTail.next = evenTail.next;
              oddTail = evenTail.next;

              evenTail.next = oddTail.next;
              evenTail = oddTail.next;
          }
          oddTail.next = evenHead;
          return oddHead;
    }

    public void reverseListUsingRecursive(Node currentNode) {
        if (currentNode.next == null) {
            head = currentNode;
            return;
        }
        reverseListUsingRecursive(currentNode.next);
        Node node = currentNode.next;
        node.next = currentNode;
        currentNode.next = null;
    }
}
