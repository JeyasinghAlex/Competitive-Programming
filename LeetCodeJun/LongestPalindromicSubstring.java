package LeetCodeChallenges.LeetCodeJun;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "aaaabbaa";
        System.out.println(findMaxLength(s));
    }

    private static String findMaxLength(String s) {
        if (s.length() <= 1)
            return s;

        boolean[][] dp = new boolean[s.length()][s.length()];
        int max = 0;
        int min = 0;
        for (int i = 0; i < s.length(); ++i)
            dp[i][i] = true;

        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                dp[i - 1][i] = true;
                min = i - 1;
                max = 1;
            }
        }
        for (int i = 2; i < s.length(); ++i) {
            for(int j = 0; j < s.length() - i; ++j) {
                if (s.charAt(j) == s.charAt(i + j) && dp[j + 1][i - 1 + j]) {
                    dp[j][i + j] = true;
                    if (i > max) {
                        max = i;
                        min = j;
                    }
                }
            }
        }
        System.out.println(max +" "+min);
        return s.substring(min, min + max + 1);
    }
}
