package LeetCodeChallenges.LeetCodeSep;

public class PeakIndexMountainArray {

    //Approach 1: Linear Scan
    public int peakIndexInMountainArray(int[] arr) {
        int i = 0;
        while (arr[i] < arr[i + 1]) {
            ++i;
        }
        return i;
    }

    //    Approach 2: Binary Search
    public int peakIndexInAMountainArray(int[] arr) {

        int st = 0, ed = arr.length - 1;
        while (st < ed) {
            int mid = st + (ed - st) / 2;
            if (arr[mid] < arr[mid + 1]) {
                st = mid + 1;
            } else {
                ed = mid;
            }
        }
        return st;
    }
}
