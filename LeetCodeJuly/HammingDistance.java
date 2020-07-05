package LeetCodeChallenges.LeetCodeJuly;

public class HammingDistance {

    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        System.out.println(hammingDistance(a, b));
    }

    private static int hammingDistance(int x, int y) {
       int distance = 0;
       int a = 0;
       int b = 0;
       while (x != 0 || y != 0) {

            a = x == 0 ? 0 : x % 2;
            b = y == 0 ? 0 : y % 2;
            distance += a == b ? 0 : 1;
            x /= 2;
            y /= 2;
       }
       return distance;
    }
}
