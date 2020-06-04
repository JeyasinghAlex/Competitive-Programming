package LeetCodeChallenges.LeetCodeJun.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.display(list.getHeadNode());
//        list.remove(list.getHeadNode(), 10);
//        System.out.println();
//        list.display(list.getHeadNode());
//        list.delete(list.getHeadNode(), 12);
//        list.delete(list.getHeadNode(), 3);
//        list.delete(list.getHeadNode(), 4);
        list.removeNthElement(list.getHeadNode(), 4);
        System.out.println();
        list.display(list.getHeadNode());
    }
}
