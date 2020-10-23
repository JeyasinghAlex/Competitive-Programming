package demo;

import java.util.Scanner;

public class Lift {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the nth value - ");
        int n = scan.nextInt();
        System.out.print("Enter the t value - ");
        int t = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the input - ");
        String s = scan.nextLine();
        char[] arr = s.toCharArray();

        for (int i = 0; i < s.length(); ++i) {
            if (arr[i] == 'u' && n < t) {
                ++n;
            }else if (arr[i] == 'd' && n > 1) {
                --n;
            }
        }
        System.out.println(n);
    }
}
