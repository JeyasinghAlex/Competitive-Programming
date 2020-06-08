package LeetCodeChallenges.LeetCodeJun.DesignBrowserHistory;

public class Node {
    String url;
    Node next;
    Node prev;

    public Node (String url) {
        this.url = url;
        this.next = null;
        this.prev = null;
    }
}
