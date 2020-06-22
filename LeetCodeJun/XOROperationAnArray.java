package LeetCodeChallenges.LeetCodeJun;

public class XOROperationAnArray {
    public static void main(String[] args) {
        int n = 1;
        int start = 7;
        System.out.println(xorOperation(n, start));
    }

    private static int xorOperation(int n, int start) {
        int xor = 0;
        for (int  i = 0; i < n; ++i) {
            int sum = start + 2 * i;
            xor = xor ^ sum;
        }
        return xor;
    }
}
