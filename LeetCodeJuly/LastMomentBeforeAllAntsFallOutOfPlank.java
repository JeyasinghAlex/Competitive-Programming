package LeetCodeChallenges.LeetCodeJuly;

public class LastMomentBeforeAllAntsFallOutOfPlank {
    public static void main(String[] args) {
        int[] left = {0,1,2,3,4,5,6,7};
        int[] right = {};
        int n = 4;
        System.out.println(getLastMoment(n, left, right));
    }

    private static int getLastMoment(int n, int[] left, int[] right) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < left.length; ++i)
            max = Math.max(max, left[i]);
        for (int i = 0; i < right.length; ++i)
                max = Math.max(max, n - right[i]);
        return max;
    }
}
