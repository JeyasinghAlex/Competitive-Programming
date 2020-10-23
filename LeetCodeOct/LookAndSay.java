package demo;

import java.util.Scanner;

public class LookAndSay {

    private static String result;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the start number - ");
        int start = scan.nextInt();
        result = start + "";
        System.out.print("Enter the end number - ");
        int end = scan.nextInt();

        for (int i = start; i < end + start; ++i) {
            System.out.println(countAndSay(i));
            result = start + "";
        }
    }

    private static String countAndSay(int n) {

        int count = 1;

        for (int i = Integer.parseInt(result); i < n; ++i) {
            StringBuilder sb = new StringBuilder();
            count = 1;
            for (int j = 1; j < result.length(); ++j) {
                if (result.charAt(j) == result.charAt(j - 1)) {
                    ++count;
                } else {
                    sb.append(count);
                    sb.append(result.charAt(j - 1));
                    count = 1;//1, 2
                }
            }//2  1
            sb.append(count);//1,2,1,1
            sb.append(result.charAt(result.length() - 1));
            result = sb.toString();
        }
        return result;
    }
}
