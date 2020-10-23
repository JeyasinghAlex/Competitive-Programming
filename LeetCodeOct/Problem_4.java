package demo;

import java.util.Scanner;

public class Problem_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int level = 0;
        int n = scan.nextInt();
        while (n > 0) {
            n = n >> 1;// n = 5, >> 1 0 1
            level++;
        }
        System.out.println(level);
    }
}
