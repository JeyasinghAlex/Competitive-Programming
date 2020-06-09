package LeetCodeChallenges.LeetCodeJun;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }

    private static boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;

        while (n != 1)  {
            if (n % 2 == 1)
                return false;
            n /= 2;
        }
        return true;
    }

    public boolean isPowerOfTwoo(int n) {
        return n > 0 && (n & (n-1)) == 0;
    }
}
