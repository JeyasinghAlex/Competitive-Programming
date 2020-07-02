package LeetCodeChallenges.LeetCodeJuly.Tree;

public class BinaryTree {

    private TreeNode root;

    public void insert (TreeNode root, int data) {
        this.root = constructBinaryTree(root, data);
    }

    public TreeNode getHeadNode() {
        return this.root;
    }

    private TreeNode constructBinaryTree(TreeNode currentTreeNode, int data) {
        if (currentTreeNode == null)
            return  new TreeNode(data);
        else if (currentTreeNode.data >= data)
            currentTreeNode.left = constructBinaryTree(currentTreeNode.left, data);
        else
            currentTreeNode.right = constructBinaryTree(currentTreeNode.right, data);
        return currentTreeNode;
    }

    public void display(TreeNode currentTreeNode) {
        if (currentTreeNode != null) {
            display(currentTreeNode.left);
            System.out.print(currentTreeNode.data + " ");
            display(currentTreeNode.right);

        }
    }
}
