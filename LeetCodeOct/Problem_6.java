package demo;

import java.util.Scanner;

public class Problem_6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int curTopSpeed = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0, x = 0; i < n; ++i) {
            x = scan.nextInt();
            if (x <= curTopSpeed) {
                curTopSpeed = x;
                ans++;
            }
        }
        System.out.println(ans);
    }
}