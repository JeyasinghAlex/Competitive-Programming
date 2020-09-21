package LeetCodeChallenges.LeetCodeSep;

public class CarPooling {

    public boolean carPooling(int[][] trips, int capacity) {

        int[] count = new int[1001];
        for (int[] a : trips) {
            count[a[1]] += a[0];
            count[a[2]] -= a[0];
        }
        for (int ch : count) {
            capacity -= ch;
            if (capacity < 0) {
                return false;
            }
        }
        return true;
    }

    public boolean carPoolin(int[][] trips, int capacity) {

        int st = Integer.MAX_VALUE;
        int ed = Integer.MIN_VALUE;

        for (int[] ar : trips) {
            st = ar[1] < st ? ar[1] : st;
            ed = ar[2] > ed ? ar[2] : ed;
        }

        int[] count = new int[ed + 1];

        for (int[] a : trips) {
            count[a[1]] += a[0];
            count[a[2]] -= a[0];
        }
        for (int ch : count) {
            capacity -= ch;
            if (capacity < 0) {
                return false;
            }
        }
        return true;
    }
}
