package LeetCodeChallenges.LeetCodeJuly.Tree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(tree.getHeadNode(), 3);
        tree.insert(tree.getHeadNode(), 9);
        tree.insert(tree.getHeadNode(), 20);
        tree.insert(tree.getHeadNode(), 15);
        tree.insert(tree.getHeadNode(), 7);
        tree.display(tree.getHeadNode());
    }
}
