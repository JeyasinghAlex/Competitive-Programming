package LeetCodeChallenges.LeetCodeJun;

public class ImplementStrStr {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";
        System.out.println(haystack.indexOf(needle));
        System.out.println(str(haystack, needle));
    }

    /**
     * https://leetcode.com/problems/implement-strstr/discuss/676727/Pointer-solution
     * @param haystack
     * @param needle
     * @return
     */

    private static int str(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;

        if (needle.length() > haystack.length())
            return -1;

        int i = 0, j = 0;
        while (j < haystack.length()) {
            if (needle.charAt(i) == haystack.charAt(j)) {
                if (++i == needle.length())
                    return j - i + 1;
            } else {
                j = j - i;
                i = 0;
            }
            ++j;
        }
        return -1;
    }

    private static int strStr(String haystack, String needle) {
        String subStr = "";
        if (needle.length() == 0)
            return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); ++i) {
//            if (haystack.substring(i, i + needle.length()).equals(needle)) return i;
            subStr = haystack.substring(i, i + needle.length());
            if (subStr.equals(needle))
                return i;
        }
        return -1;
    }
}
