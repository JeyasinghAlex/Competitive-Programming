import java.util.Stack;

public class RemoveKDigits {
    public static void main(String[] args) {
        System.out.println(removeKdigits("1432219", 3));
    }

    private static String removeKdigits(String num, int k) {

        if (k >= num.length())
            return "0";

        Stack<Character> stack = new Stack<>();
        for (char c : num.toCharArray()) {

            while (!stack.isEmpty() && k > 0 && stack.peek() > c) {
                stack.pop();
                k--;
            }

            if (!stack.isEmpty() || c != '0')
                stack.push(c);
        }

        while (!stack.isEmpty() && k > 0) {
            stack.pop();
            k--;
        }

        if (stack.isEmpty())
            return "0";

        StringBuilder s = new StringBuilder();

        while (!stack.isEmpty()) {
            s.append(stack.pop());
        }

        return s.reverse().toString();
    }
}
