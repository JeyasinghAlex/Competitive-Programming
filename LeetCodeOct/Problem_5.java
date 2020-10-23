package demo;

import java.util.Scanner;

public class Problem_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char[] str = s.toCharArray();
        int[] type = new int[26];
        for (int i = 0; i < str.length; ++i) {
            type[str[i] - 'a']++;
        }
        int amount = 0;
        for (int i = 0; i < 26; ++i) {
            if (type[i] % 2 == 1) {
                amount++;
            }
            amount += (type[i] / 2);
        }
        System.out.println(amount);
    }
}
