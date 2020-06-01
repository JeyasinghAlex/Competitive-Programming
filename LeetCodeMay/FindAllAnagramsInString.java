import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInString {

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(sumPreElement(s, p));
        //System.out.println(efficientAns(s, p));
        int count = 0;
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[26];
        int[] slide = new int[26];
        for (char c : p.toCharArray())
            arr[c - 'a']++;
        for (int i = 0; i < p.length() - 1; ++i) {
            slide[s.charAt(i) - 'a']++;
        }
        int index = 0;
        for (int i = p.length() - 1; i < s.length(); ++i) {
            slide[s.charAt(i) - 'a']++;
            if (isAnagram(arr, slide)) {
                list.add(i + 1 - p.length());
                count++;
            }
            slide[s.charAt(index++) - 'a']--;
        }
//        System.out.println(count);
        System.out.println(list);
    }

    public static boolean isAnagram(int[] arr, int[] slide) {
        for (int i = 0; i < 26; ++i) {
            if (arr[i] != slide[i])
                return false;
        }
        return true;
    }

    private static List<Integer> sumPreElement(String s, String p) {
        int sum = 0;
        int index = 0;
        List<Integer> list = new ArrayList<>();

        int[] arr = new int[s.length()];
        char[] chars = s.toCharArray();
        for (char c : p.toCharArray())
            sum += c;

        for (char c : chars)
            arr[index++] = c;

        index = 0;
        for (int i = 1; i < arr.length; ++i)
            arr[i] = arr[i] + arr[i - 1];

        if (arr[p.length() - 1] == sum)
            list.add(index);

        for (int i = p.length(); i < arr.length; ++i) {
            if (isAnagram(sum, arr[i] - arr[index++]))
                list.add(index);
        }
        return list;
    }

    private static boolean isAnagram(int a, int b) {
        return a == b;
    }

    /**
     * Both are doing same operation :
     * @param arr
     * @param slide
     * @return
     */

    public static boolean isEqual(int[] arr, int[] slide) {
        return Arrays.equals(arr, slide);
    }

    public static List<Integer> efficientAns(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s.length() == 0)
            return list;
        int[] count = new int[26];
        for (char c : p.toCharArray())
            count[c - 'a']++;
        int left = 0;
        int right = 0;
        int cnt = p.length();
        while (right < s.length()) {
            if (count[s.charAt(right++) - 'a']-- >= 1) cnt--;
            if (cnt == 0) list.add(left);
            if (right - left == p.length() && count[s.charAt(left--) - 'a']++ >= 0) cnt++;
        }
        return list;
    }
}
