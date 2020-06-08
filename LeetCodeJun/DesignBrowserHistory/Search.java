package LeetCodeChallenges.LeetCodeJun.DesignBrowserHistory;

public class Search {
    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory("leetcode.com");
        history.visit("google.com");
        history.visit("facebook.com");
        history.visit("youtube.com");
        System.out.println(history.back(1));
        System.out.println(history.back(1));
        System.out.println(history.forward(1));
        history.visit("linkedin.com");
        System.out.println(history.forward(2));
        System.out.println(history.back(2));
        System.out.println(history.back(7));
    }
}
