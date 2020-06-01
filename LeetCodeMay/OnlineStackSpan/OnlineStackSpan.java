package OnlineStackSpan;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class OnlineStackSpan {

    private Stack<Integer> price;
    private Stack<Integer> span;

    public OnlineStackSpan() {
        price = new Stack<>();
        span = new Stack<>();
    }

    public int next(int amount) {
        int total = 1;

        while (!price.isEmpty() && price.peek() <= amount) {
            price.pop();
            total += span.pop();
        }
        price.push(amount);
        span.push(total);
        return total;
    }
}
