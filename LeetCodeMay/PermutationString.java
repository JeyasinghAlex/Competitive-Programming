package LeetCodeChallenges.LeetCodeMay;

public class PermutationString {

    public static void main(String[] args) {

        generatePermutation("alex", 0, 4);

        String s1 = "ab";
        String s2 = "eidboaoo";
        int[] cnt = new int[26];
        int[] count = new int[26];
        for (char c : s1.toCharArray())
            cnt[c - 'a']++;
        for (int i = 0; i < s1.length()-1; ++i) {
            count[s2.charAt(i) - 'a']++;
        }
        int index = 0;
        for (int i = s1.length() - 1; i < s2.length(); ++i) {
            count[s2.charAt(i) - 'a']++;
            if(isPermutationAvailable(cnt, count)) {
                System.out.println("True");
            }
            count[s2.charAt(index++) - 'a']--;
        }
    }

    private static boolean isPermutationAvailable(int[] a, int[] b) {
        for (int i = 0; i < 26; ++i) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    private static void generatePermutation(String str, int start, int end) {
        //Prints the permutations
        if (start == end-1)
            System.out.println(str);
        else
        {
            for (int i = start; i < end; i++)
            {
                //Swapping the string by fixing a character
                str = swapString(str,start,i);
                //Recursively calling function generatePermutation() for rest of the characters
                generatePermutation(str,start+1,end);
                //Backtracking and swapping the characters again.
                str = swapString(str,start,i);
            }
        }
    }

    private static String swapString(String a, int i, int j) {
        char[] b =a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }
}
