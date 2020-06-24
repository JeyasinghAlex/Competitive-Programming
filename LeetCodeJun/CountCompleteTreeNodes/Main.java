package LeetCodeChallenges.LeetCodeJun.CountCompleteTreeNodes;

public class Main {
    public static void main(String[] args) {
        CountCompleteTreeNodes tree = new CountCompleteTreeNodes();
        tree.insert(tree.getHeadNode(), 1);
        tree.insert(tree.getHeadNode(), 2);
        tree.insert(tree.getHeadNode(), 3);
        tree.insert(tree.getHeadNode(), 4);
        tree.insert(tree.getHeadNode(), 5);
        tree.insert(tree.getHeadNode(), 6);
        tree.insert(tree.getHeadNode(), 7);
        //System.out.println(tree.countNodes(tree.getHeadNode()));
        //System.out.println(tree.countAllNodes(tree.getHeadNode()));
        System.out.println(tree.count(tree.getHeadNode(), 0) + 1);
    }
}
