package LeetCodeChallenges.LeetCodeSep;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {

    public List<Integer> sequentialDigits(int low, int high) {

        int len1 = Integer.toString(low).length();
        int len2 = Integer.toString(high).length();
        String s = "123456789";
        List<Integer> list = new ArrayList<>();

        for (int i = len1; i <= len2; ++i) {
            for (int j = 0; j < 10 - i; ++j) {
                String str = s.substring(j, j + i);
                int num = Integer.parseInt(str);
                if (num >= low && num <= high)
                    list.add(num);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new SequentialDigits().sequentialDigits(1000, 13000));
    }
}
