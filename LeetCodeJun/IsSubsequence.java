package LeetCodeChallenges.LeetCodeJun;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "axcc";
        String t = "agxdc";
        System.out.println(isSubsequenceee(s, t));
    }

    private static boolean isSubsequence (String s, String t) {
        if (s.length() > t.length())
            return false;

        if (s.isEmpty())
            return true;

        for (char c : t.toCharArray()) {
            if (s.charAt(0) == c)
                s = s.substring(1, s.length());
            if (s.isEmpty())
                return true;
        }
        return false;
    }

    /**
     * 1 ms -> time complexity :-
     */
    public static boolean isSubsequencee(String s, String t) {
        int index = -1;
        for (char c : s.toCharArray()){
            index = t.indexOf(c, index + 1);
            if (index == -1)
                return false;
        }
        return true;
    }

    /**
     * 2 ms -> time complexity :-
     */

    private static boolean isSubsequenceee(String s, String t) {
        if (s.length() == 0)
            return true;
        if (s.length() > t.length())
            return false;

        int i = 0, j = 0;
        while (j < t.length()) {
            if (s.charAt(i) == t.charAt(j))
                if (++i == s.length())
                    return true;
            ++j;
        }
        return false;
    }
}