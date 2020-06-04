package LeetCodeChallenges.LeetCodeMay;

public class ValidPerfectSquare {
    public static void main(String[] args) {

    }

    private static boolean isPerfectSquare(int num) {
        //Binary Search -> find perfect squre :-

        int start = 1;
        int end = num;

        if (num < 1)
            return false;

        if (num == 1)
            return true;

        while (start <= end) {
            int mid = start + (int)Math.floor((end - start)/2);

            if (mid * mid == num) {
                return true;
            }
            else if (mid * mid  > num) {
                end = mid - 1;
            }
            else if (mid * mid < num) {
                start = mid + 1;
            }
        }
        return false;
    }
}
