package LeetCodeChallenges.LeetCodeJun;

import java.util.Arrays;

public class ValidateIPAddress {
    public static void main(String[] args) {
//        System.out.println(validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
        String s = "2001:0db8:85a3:0:0:8A2E:0370:7334";
        System.out.println(Arrays.toString(s.split(":", -1)));
    }

    private static String validIPAddress(String IP) {
        String[] dot = IP.split("\\.", -1);
        if (dot.length == 4) {
            for (String dt : dot) {
                if (dt.length() == 0 || dt.length() > 3) return "Neither";
                if (dt.charAt(0) == '0' && dt.length() != 1) return "Neither";
                for (char c : dt.toCharArray()) if (!Character.isDigit(c)) return "Neither";
                if (Integer.parseInt(dt) > 255) return "Neither";
            }
            return "IPv4";
        }

        String[] colon = IP.split(":", -1);
        if (colon.length == 8) {
            for (String col : colon) {
                if (col.length() == 0 || col.length() > 4) return "Neither";
                for (char c : col.toCharArray()) if (!(c >= '0' && c <= '9' || c >= 'a' && c <= 'f' || c >= 'A' && c <= 'F')) return "Neither";
            }
            return "IPv6";
        }
        return "Neither";
    }
}
