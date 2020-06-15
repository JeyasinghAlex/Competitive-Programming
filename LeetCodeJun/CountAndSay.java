package LeetCodeChallenges.LeetCodeJun;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class CountAndSay {
    public static void main(String[] args) {
        int n = 5;
        String s  = "1";
        for (int i = 0; i < n; ++i) {
            System.out.println(s);
            s = find(s);
        }
    }

    private static String find(String s) {
        int index = 0;
        int count = 0;
        StringBuilder sb = new StringBuilder();
       for (int i = 0; i < s.length(); ++i) {
           if (s.charAt(index) == s.charAt(i)) {
               count++;
           } else {
               sb.append(count).append(s.charAt(index));
               index = i;
               i--;
               count = 0;
           }
       }
       sb.append(count).append(s.charAt(index));
       return new String(sb);
    }
}