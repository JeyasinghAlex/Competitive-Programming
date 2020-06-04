package LeetCodeChallenges.LeetCodeJun;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    private Map<Character, Character> map;
    public ValidParentheses() {
        this.map = new HashMap<>();
        this.map.put(')', '(');
        this.map.put(']', '[');
        this.map.put('}', '{');
    }

    public static void main(String[] args) {
        String s = "";
        ValidParentheses parentheses = new ValidParentheses();
        System.out.println(parentheses.isValid("("));
    }

    private boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                char topElement = stack.isEmpty() ? '*'  : stack.pop();
                if (topElement != this.map.get(c));
                    return false;
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
