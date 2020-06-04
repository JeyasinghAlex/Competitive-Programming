package LeetCodeChallenges.LeetCodeJun;

public class ReverseString {

    public static void main(String[] args) {
        char[] arr = {'j', 'e', 'y', 'a', 's', 'i', 'n', 'g', 'h'};
        reverseString(arr);
        System.out.println(arr);
    }
    private static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        char temp = ' ';
        while (i < j) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
