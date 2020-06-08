package LeetCodeChallenges.LeetCodeJun.DesignBrowserHistory;

public class BrowserHistory {

    private Node currentPage = null;

    public BrowserHistory (String homePage) {
        currentPage = new Node(homePage);
    }
    public void visit(String url) {
       /* currentPage.next = new Node(url);
        currentPage.next.prev = currentPage;
        currentPage = currentPage.next;*/

        Node node = new Node(url);
        currentPage.next = node;
        node.prev = currentPage;
        currentPage = node;
    }

    public String back(int steps) {

        for (int i = 0; i < steps; ++i) {
            if (currentPage.prev != null)
                currentPage = currentPage.prev;
            else
                break;
        }
        return currentPage.url;
    }

    public String forward(int steps) {
       for (int i = 0; i < steps; ++i) {
           if (currentPage.next != null)
               currentPage = currentPage.next;
           else
               break;;
       }
       return currentPage.url;
    }
}


/*class BrowserHistory {

    private List<String> history;
    private int currentPage;
    public BrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
        currentPage = 0;
    }

    public void visit(String url) {
        List<String> stack = new ArrayList<>();

        for (int i = 0; i <= currentPage; ++i) {
            stack.add(history.get(i));
        }
        history = stack;
        history.add(url);
        currentPage++;
    }

    public String back(int steps) {
        currentPage -= steps;
        currentPage = Math.max(0, currentPage);
        return history.get(currentPage);
    }

    public String forward(int steps) {
        currentPage += steps;
        currentPage = Math.min(history.size() - 1, currentPage);
        return history.get(currentPage);
    }
}*/

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */