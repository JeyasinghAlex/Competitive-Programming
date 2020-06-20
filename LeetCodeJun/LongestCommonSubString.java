package LeetCodeChallenges.LeetCodeJun;

import java.util.Stack;

public class LongestCommonSubString {
    public static void main(String[] args) {
        String s1 = "bala";
        String s2 = "alexbala";
        System.out.println(findCommonSubString(s1, s2));
    }

    private static String findCommonSubString(String s1, String s2) {
        if (s1.isEmpty()  || s2.isEmpty())
            return "";
        boolean isSame = false;
        int max = Integer.MIN_VALUE;
        int st = 0;
        int ed = 0;
        int[][] dp = new int[s1.length()][s2.length()];
        for (int i = 0; i < s1.length(); ++i) {
            for (int j = 0; j < s2.length(); ++j) {
                isSame = s1.charAt(i) == s2.charAt(j);
                if (isSame && (i == 0 || j == 0))
                    dp[i][j] = 1;
                else if(isSame) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > max) {
                        max = dp[i][j];
                        st = i;
                        ed = j;
                    }
                }
                else
                    dp[i][j] = 0;
            }
        }

        Stack<Character> stack = new Stack<>();
        while (st >= 0 && ed >= 0 && dp[st][ed] != 0) {
            stack.push(s1.charAt(st));
            st--;
            ed--;
        }
        System.out.println("stack length -> " + stack.size());
        StringBuilder s = new StringBuilder();
        while (!stack.isEmpty()) {
            s.append(stack.pop());
        }
        return s.toString();
    }
}
