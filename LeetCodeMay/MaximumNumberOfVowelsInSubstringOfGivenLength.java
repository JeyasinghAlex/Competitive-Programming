package LeetCodeChallenges.LeetCodeMay;

public class MaximumNumberOfVowelsInSubstringOfGivenLength {

    public static void main(String[] args) {
        String s = "weallloveyou";
        int k = 7, ans = 0;
        System.out.println(maxVowels(s, k));
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= s.length() - k; ++i) {
            ans = isVowels(s.substring(i, k + i));
            if (ans > max)
                   max = ans;
        }
        System.out.println(max);
    }

    private static int isVowels(String sub) {
        int count = 0;
        for (char c : sub.toCharArray()) {
            if (c == 'a'  || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }


    /**
     * Efficient Solution
     * @param
     * @return
     */
    private static boolean check(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' | ch == 'o' || ch == 'u');
    }
    public static int maxVowels(String s, int k) {
        int max = 0, n = s.length();
        int count = 0;
        for(int i = 0; i < k; i++) {
            if(check(s.charAt(i))) count++;
        }
        max = count;
        // build first window size k
        for(int  i = k; i < n; i++) {
            // remove the contribution of the (i - k)th character which is no longer in the window
            if(check(s.charAt(i - k))) count--;
            // add the contribution of the current character
            if(check(s.charAt(i))) count++;
            // update max at for each window of size k
            max = Math.max(max, count);
        }
        return max;
    }
}
