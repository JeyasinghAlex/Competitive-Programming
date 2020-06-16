package LeetCodeChallenges.LeetCodeJun;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubString(s));
    }

    /** brute force approach : - */
    private static int lengthOfLongestSubString(String s) {
        List<Character> list = new ArrayList<>();
        int cnt = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); ++i) {
            cnt = 0;
            for (int j = i; j < s.length(); ++j) {
                if (!list.contains(s.charAt(j))) {
                    list.add(s.charAt(j));
                    if (++cnt > max)
                        max = cnt;
                } else {
                    break;
                }
            }
            list.clear();;
        }
        return max;
    }


    private int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}
