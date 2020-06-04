package LeetCodeChallenges.LeetCodeMay.Tree;

public class BinaryTree {

    private Node root;

    public Node getRootNode() {
        return root;
    }

    public void insert(Node root, int data) {
        this.root = constructBinarySearchTree(root, data);
    }

    private Node constructBinarySearchTree(Node currentNode, int data) {
        if (currentNode == null)
            return new Node(data);
        else if (currentNode.data >= data)
            currentNode.left = constructBinarySearchTree(currentNode.left, data);
        else
            currentNode.right = constructBinarySearchTree(currentNode.right, data);
        return currentNode;
    }

    public void traversePreOrder(Node currentNode) {

        if (currentNode != null)  {
            System.out.print(currentNode.data + " ");
            traversePreOrder(currentNode.left);
            traversePreOrder(currentNode.right);
        }
    }

    public boolean isCousins(Node root, int x, int y) {

        int first = findDepth(root, x, 0);
        int second = findDepth(root, y, 0);

        if (first != second)
            return false;

        Node node = findParant(root, root, y);

        if (node.left == null || node.right == null)
            return true;

        if (node.left.data == x && node.right.data == y || node.left.data == y && node.right.data == x)
            return false;

        return true;

    }

    private Node findParant(Node root, Node parantNode, int data) {
        if (root == null)
            return null;

        if (root.data == data)
            return parantNode;

        Node nod = findParant(root.left, root, data);

        return (nod != null) ? nod : findParant(root.right, root, data);

    }

    private int findDepth(Node root, int data, int dpt) {
        if (root == null)
            return 0;

        if (root.data == data)
            return dpt;

        int level = findDepth(root.left, data, dpt + 1);

        return (level != 0) ? level : findDepth(root.right, data, dpt + 1);

    }
    
}
