package LeetCodeChallenges.LeetCodeJuly.BinaryTreeLevelOrderTraversalII;

public class Main {
    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal tree = new BinaryTreeLevelOrderTraversal();
        tree.insert(tree.getHeadNode(), 3);
        tree.insert(tree.getHeadNode(), 2);
        tree.insert(tree.getHeadNode(), 10);
        tree.insert(tree.getHeadNode(), 8);
        tree.insert(tree.getHeadNode(), 12);
        System.out.println(tree.levelOrderBottom(tree.getHeadNode()));
    }
}