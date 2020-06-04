package LeetCodeChallenges.LeetCodeMay;

public class KadaneAlgorithm {
    /**
     * find maximum subArray :-
     * @param arg
     */
    public static void main(String[] arg) {

        int[] arr = {5, -3, 5};
        int sum = 0, sum1 = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int start = 0, end = 0, total = 0;

        for (int i = 0; i < arr.length; ++i) {


            sum += arr[i];
            //            max = Math.max(sum, max);
            //            sum = Math.max(sum, 0);
            if (sum > max) {
                max = sum;
                //end index
                end = i;
            }
            if (sum < 0) {
                sum = 0;
                //start index
                start = i + 1;
            }

            sum1 += arr[i];
            //            min = Math.min(sum1, min);
            //            sum1 = Math.min(sum1, 0);
            if (sum1 < min)
                min = sum1;

            if (sum1 > 0)
                sum1 = 0;

            total += arr[i];
        }

        /** array always  positive or negative value :- */
        //        return max < 0 ? max : Math.max(max, total - min);
        //        return min > 0 ? min : Math.min(min, total - max);
        System.out.println(max + ", " + start +", " + end);
    }
}