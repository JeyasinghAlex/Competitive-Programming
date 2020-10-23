package demo;

import java.util.Scanner;

public class Problem_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int change = b - a;
        if (change % 10 == 0) {
            change++;
        } else {
            change--;
        }
        System.out.println(change);
    }
}