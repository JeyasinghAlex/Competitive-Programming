import java.util.Arrays;

public class SquaresOfSortedArray {

    public static void main(String[] args) {
        int[] A = {-4,-1,0,3,10};
        sortedSquares(A);
        for (int i = 0; i < A.length; ++i) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        int key = 0, j = 0;
        /** Insertion sort*/
        for (int i = 1; i < A.length; ++i) {
            key = A[i];
            j = i - 1;

            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
        System.out.println(Arrays.toString(A));
    }

    private static void sortedSquares(int[] arr) {
        /**
         * pos -> positiveNumberPosition
         * neg -> negativeNumberPosition
         */
        int len = arr.length;
        int pos = 0;
        int[] sqr = new int[len];
        int index = 0;

        while (pos < len && arr[pos] < 0)
            pos++;

        int neg = pos - 1;

        while (neg >= 0 && pos < len) {
            if (arr[neg] * arr[neg] < arr[pos] * arr[pos]) {
                sqr[index++] = arr[neg] * arr[neg];
                neg--;
            }else {
                sqr[index++] = arr[pos] * arr[pos];
                pos++;
            }
        }

        while (neg >= 0) {
            sqr[index++] = arr[neg] * arr[neg];
            neg--;
        }
        while (pos < len) {
            sqr[index++] = arr[pos] * arr[pos];
            pos++;
        }
        System.out.println(Arrays.toString(sqr));
    }
}
