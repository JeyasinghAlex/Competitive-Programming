package LeetCodeChallenges.LeetCodeJun;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static void main(String[] args) {
//        System.out.println(validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
        String s = "2001:0db8:85a3:0:0:8A2E:0370:7334";
        s = "172.16.254.1";
        System.out.println(validIp(s));
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

    private static String validIp(String ip) {
        String pattern = "(([0-9 ] | [1-9][0-9] | 1[0-9][0-9] | 2[0-4][0-9] | 25[0-5]) \\.){3}(_)";
        Pattern paten = Pattern.compile(pattern);
        Matcher matcher = paten.matcher(ip);
        if(matcher.find())
            return "IPv4";
        pattern = "((([0-9a-fA-F]){1,4})\\:){7} (([0-9a-fA-F]){1,4})";
        paten = Pattern.compile(pattern);
        matcher = paten.matcher(ip);
        if (matcher.find())
            return "IPv6";
        return "Neither";
    }
}
