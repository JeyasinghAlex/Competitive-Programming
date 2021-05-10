import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Main {



    public static void main(String[] args) {
//        System.out.println(new Main().peakIndexInMountainArray(new int[]{3,4,5,1}));
//        int a = Arrays.binarySearch(new int[]{1, 3, 5, 5,5,5,5,5, 6}, 5);
//        System.out.println(a);
//        System.out.println(new Main().guessNumber(10));
//        new Main().duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
//        System.out.println(new Main().maximumPopulation(new int[][]{{1950,1961},{1960,1971},{1970,1981}}));
        System.out.println(Math.sqrt(2L));
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