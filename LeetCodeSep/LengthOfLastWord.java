package LeetCodeChallenges.LeetCodeSep;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {

        String[] arr = s.split(" ");
        if (arr.length == 0) {
            return 0;
        }
        return arr[arr.length - 1].length();
    }

    public int lengthofLastWord(String s) {

        int i = s.length() - 1;
        int count = 0;
        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                --i;
            } else {
                break;
            }
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            ++count;
            --i;
        }
        return count;
    }
}
