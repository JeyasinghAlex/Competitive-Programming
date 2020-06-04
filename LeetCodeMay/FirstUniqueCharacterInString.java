package LeetCodeChallenges.LeetCodeMay;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }

    private static int firstUniqChar(String s) {
        int[] arr = new int[26];
        int cnt = 0;

        for (char c : s.toCharArray())
            ++arr[c-'a'];

        for (char  c : s.toCharArray()){
            if (arr[c-'a'] ==  1)
                return cnt;
            ++cnt;
        }
        return -1;

    }
}
