package LeetCodeChallenges.LeetCodeJun;

import LeetCodeChallenges.LeetCodeJun.LinkedList.LinkedList;
import LeetCodeChallenges.LeetCodeJun.LinkedList.Node;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.insert(1);
        list1.insert(2);
        list1.insert(4);
        list2.insert(1);
        list2.insert(3);
        list2.insert(4);

        list1.display(list1.getHeadNode());
        System.out.println();
        list2.display(list2.getHeadNode());
        System.out.println();
        Node node = list1.mergeTwoList(list1.getHeadNode(), list2.getHeadNode());
        list1.display(node);
//       list1.mergeTwoLists(list1.getHeadNode(), list2.getHeadNode());
//        System.out.println();
//       list1.display(list1.getHeadNode());
    }
}
