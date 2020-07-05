package LeetCodeChallenges.LeetCodeJuly;

import java.util.ArrayList;
import java.util.List;

public class UglyNumberII {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(nthUglyNumber(n));
        System.out.println(nthUglyNumberr(n));
    }

    /* Brute force Approach :- */
    private static int nthUglyNumber(int n) {
        int count = 1;
        int i = 1;
        while (count < n) {
            i++;
            if (isUglyNumber(i)) {
                count++;
            }
        }
        return i;
    }


    /* Dynamic Programing :- */
    private static int nthUglyNumberr(int n) {
        List<Integer> ugly = new ArrayList<>();
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        ugly.add(1);
        while (ugly.size() < n) {
            int m2 = ugly.get(i2) * 2;
            int m3 = ugly.get(i3) * 3;
            int m5 = ugly.get(i5) * 5;

            int min = getMin(m2, getMin(m3, m5));
            ugly.add(min);

            if (min == m2) {
                i2++;
            }
            if (min == m3) {
                i3++;
            }
            if (min == m5) {
                i5++;
            }
        }
        return ugly.get(ugly.size() - 1);
    }

    private static int getMin(int a, int b) {
        return a > b ? b : a;
    }

    private static boolean isUglyNumber(int number) {
        if (number == 0)
            return false;

        while (number != 1) {
            if (number % 2 == 0) {
                number = number / 2;
                continue;
            }
            if (number % 3 == 0) {
                number = number / 3;
                continue;
            }
            if (number % 5 == 0) {
                number = number / 5;
                continue;
            }
            return false;
        }
        return true;
    }
}