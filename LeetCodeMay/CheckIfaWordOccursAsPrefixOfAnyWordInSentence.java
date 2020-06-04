package LeetCodeChallenges.LeetCodeMay;

public class CheckIfaWordOccursAsPrefixOfAnyWordInSentence {

    public static void main(String[] args) {
        String s = "hello from the other side";
        String searchWord = "they";
        System.out.println(isPrefixOfWord(s, searchWord));
    }

     private static int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i].length() >= searchWord.length() && searchWord.equals(arr[i].substring(0, searchWord.length()))) {
                return i + 1;
            }
        }
        return -1;
    }
}
