package LeetCodeChallenges.LeetCodeJun;

import java.util.Stack;

public class LongestValidParentheses {

    public static void main(String[] args) {
        String s = ")()";
        System.out.println(longestValidParentheses(s));
    }

    private static int longestValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                    count += 2;
                }
            }
            else {
                stack.push(s.charAt(i));
            }
        }
        return count;
    }
}