package demo;

import java.util.Scanner;

public class English {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the input - ");
        String s = scan.nextLine();

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'H') {
                System.out.print(s.charAt(i));
            } else if (s.charAt(i) == 'Y') {
                System.out.print("I");
            } else if (s.charAt(i) == 'Z') {
                System.out.print("J");
            } else if (s.charAt(i) >= 'I' && s.charAt(i) <= 'P') {
                System.out.print("+");
                System.out.print((char)(s.charAt(i) - 8));
            } else {
                System.out.print("-");
                System.out.print((char)(s.charAt(i) - 16));
            }
        }
    }
}
