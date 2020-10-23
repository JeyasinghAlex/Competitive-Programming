package LeetCodeChallenges.LeetCodeOct;

public class CountAndSay {

    public String countAndSay(int n) {

        if (n <= 0) {
            return null;
        }

        String result = "1";
        int count = 1;

        for (int i = 1; i < n; ++i) {
            StringBuilder sb = new StringBuilder();
            count = 1;
            for (int j = 1; j < result.length(); ++j) {
                if (result.charAt(j) == result.charAt(j - 1)) {
                    ++count;
                } else {
                    sb.append(count);
                    sb.append(result.charAt(j - 1));
                    count = 1;
                }
            }
            sb.append(count);
            sb.append(result.charAt(result.length() - 1));
            result = sb.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; ++i)
            System.out.println(new CountAndSay().countAndSay(i));
    }
}
