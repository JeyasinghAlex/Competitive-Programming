package demo;

import java.util.Scanner;

public class Problem_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char[] str = s.toCharArray();
        int num = 0;
        for (int i = 0; i < s.length(); ++i) {
            num = (num * 10) + (str[i] - '0');
        }
        System.out.println(num);
    }
}
