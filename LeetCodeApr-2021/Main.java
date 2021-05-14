import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Main {



    public static void main(String[] args) {

//        System.out.println(new Main().compress(new char[]{'a','a','b','b','c','c','c'}));
//        System.out.println(String.valueOf(5).toCharArray());
    }


    public int compres(char[] chars) {
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < chars.length) {
            char ch = chars[i];
            while (j < chars.length && chars[i] == chars[j]) {
                ++j;
            }
            int freq = j - i;
            chars[index++] = ch;
            if (freq != 1) {
                for (char c : String.valueOf(freq).toCharArray()) {
                    chars[index++] = c;
                }
            }
            i = j;
        }
        return index;
    }

    public int compress(char[] chars) {

        int count = 1;
        int index = 0;

        for (int i = 1; i < chars.length; ++i) {
            if (chars[i] != chars[i - 1]) {
                chars[index++] = chars[i - 1];
                if (count != 1) {
                    for (char ch : String.valueOf(count).toCharArray())  {
                        chars[index++] = ch;
                    }
                    count = 1;
                }
            } else {
                ++count;
            }
        }
        chars[index++] = chars[chars.length - 1];
        if (count != 1) {
            for (char ch : String.valueOf(count).toCharArray()) {
                chars[index++] = ch;
            }
        }
        return index;
    }


    private int reverse(int n) {
        int reverse = 0;
        while (0 < n) {
            reverse = (reverse * 10) + n % 10;
            n = n / 10;
        }
        return reverse;
    }


    public int findLengthOfShortestSubarray(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j && arr[i] <= arr[i + 1]) {
            ++i;
        }

        if (i == j) {
            return 0;
        }

        while (j > 0 && arr[j] >= arr[j - 1]) {
            --j;
        }

        int minLength = Math.min(arr.length - 1 - i, j);

        int k = i;
        i = 0;

        while (i <= k && j < arr.length) {
            if (arr[i] <= arr[j]) {
                minLength = Math.min(minLength, j - i - 1);
                ++i;
            } else {
                ++j;
            }
        }
        return minLength;
    }

    public int maximumPopulation(int[][] logs) {


        int[] score = new int[101];

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();


        for(int[] arr : logs) {
            score[arr[0] - 1950]++;
            score[arr[1] - 1950]--;
        }
        for (int i = 1; i < score.length; ++i) {
            score[i] = score[i] + score[i - 1];
        }
        System.out.println(Arrays.toString(score));

        int max = Integer.MIN_VALUE;
        int res = 0;

        for (int i = 0; i < score.length; ++i) {
            if (score[i] > max) {
                max = score[i];
                res = i + 1950;
            }
        }
        return res;
    }

    public void duplicateZeros(int[] arr) {

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == 0) {

                for (int j = arr.length - 1; j > i; --j) {
                    arr[j] = arr[j - 1];
                }
                ++i;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = guess(mid);
            if (res == 0)
                return mid;
            else if (res < 0)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    private int guess(int num) {
        int pick = 6;
        return Integer.compare(pick, num);
    }

    public int peakIndexInMountainArray(int[] arr) {

        int lo = 0;
        int hi = arr.length;

        while (lo < hi) {

            int mid = lo + hi >>> 1;
            if (arr[mid] > arr[mid + 1]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    private int lowerBound(int[] nums, int target){
        final int N = nums.length;
        int lo = 0, hi = N;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;

            if (target > nums[mid])
                lo = mid + 1;
            else
                hi = mid;
        }
        return lo;
    }

    public static int minDistance(String word1, String word2) {

        int[] arr = new int[26];

        for (char a : word1.toCharArray()) {
            arr[a - 'a']++;
        }

        for (char a : word2.toCharArray()) {
            arr[a - 'a']--;
        }

        int count = 0;
        for (int i : arr) {
            count += Math.abs(i);
        }

        return count;
    }

    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        int max = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i > 0; i--){
            max = Math.max(max, arr[i]);
            res[i-1] = max;
        }
        res[arr.length - 1] = -1;
        return res;
    }
}