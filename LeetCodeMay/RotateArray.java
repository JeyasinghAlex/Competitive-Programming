import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k =  10;
        k = k % arr.length;
        bruteForce(arr, k);
        System.out.println(Arrays.toString(arr));

        usingExtraArray(arr, k);
        System.out.println(Arrays.toString(arr));

        reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        reverse(arr, 0, k - 1);
        System.out.println(Arrays.toString(arr));
        reverse(arr, k, arr.length - 1);
        System.out.println(Arrays.toString(arr));
//        for (int i = arr.length - k, j = 0; j < arr.length; ++i, ++j) {
//            System.out.print(arr[i  % arr.length] + " ");
//        }
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static void bruteForce(int[] arr, int k) {
        int prev = 0, temp = 0;
        for (int i = 0; i < k; ++i) {
            prev = arr[arr.length - 1];
            for (int j = 0; j < arr.length; ++j) {
                temp = arr[j];
                arr[j] = prev;
                prev = temp;
            }
        }
    }

    private static void usingExtraArray(int[] arr, int k)  {
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length; ++i) {
            a[(i + k) % arr.length] = arr[i];
        }
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = a[i];
        }
    }
}
