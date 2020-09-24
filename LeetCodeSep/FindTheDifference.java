package LeetCodeChallenges.LeetCodeSep;

public class FindTheDifference {

    public char findDifference(String s, String t) {
        int[] a = new int[26];
        int[] b = new int[26];
        for (char ch : s.toCharArray()) {
            a[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            b[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            if (a[ch - 'a'] != b[ch - 'a']) {
                return ch;
            }
        }
        return 'a';
    }

    public char findTheDifference(String s, String t) {
        int sumT = 0, sumS = 0;
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        for (int i = 0; i < s.length(); ++i) {
            sumS += arrS[i] - 'a';
            sumT += arrT[i] - 'a';
        }
        sumT += arrT[t.length() - 1] - 'a';
        return (char) (sumT - sumS + 'a');
    }
}
