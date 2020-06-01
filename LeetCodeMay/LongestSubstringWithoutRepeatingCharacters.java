public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "tmmzuxt";
        int count = 0;
        int max = Integer.MIN_VALUE;
        int index = 0;
        int[] arr = new int[128];
        for (int i = 0; i < s.length(); ++i) {
            if (isRepeat (arr, s.charAt(i))) {
                arr[s.charAt(i)]++;
                count++;
                if (count > max)
                    max = count;
            } else {
                while (index < i) {
                    if (s.charAt(index) != s.charAt(i)) {
                        count--;
                        index++;
                    }
                    else
                        break;
                }
            }
        }
        System.out.println(max);
    }

    private static boolean isRepeat(int[] arr, char ch) {
        return arr[ch] == 0;
    }

    private static void findTotal(String s) {

    }
}
