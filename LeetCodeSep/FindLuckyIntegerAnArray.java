package LeetCodeChallenges.LeetCodeSep;

import java.util.HashMap;
import java.util.Map;

public class FindLuckyIntegerAnArray {

    //Approach1 :
    public int findLucky(int[] arr) {
        int max = Integer.MIN_VALUE;
        int ans = -1;
        for (int ch : arr) {
            if (ch > max) {
                max = ch;
            }
        }
        int[] frequncy = new int[max + 1];
        for (int i =  0; i < arr.length; ++i) {
            frequncy[arr[i]]++;
        }
        for (int i = 1; i < frequncy.length; ++i) {
            if (frequncy[i] == i) {
                ans = i;
            }
        }
        return ans;
    }

    //Approach2 : Using Map
    public int findLuck(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = -1;

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() == entry.getValue()) {
                answer = Math.max(answer, entry.getKey());
            }
        }

        return answer;
    }
}
