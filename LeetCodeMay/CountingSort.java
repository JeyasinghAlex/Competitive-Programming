public class CountingSort {

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int[] arr = {2, 1, 1, 0, 2, 5, 4, 0, 2, 8, 7, 7, 9, 2, 0, 1, 9};
        for (int c : arr) {
            if (c > max)
                max = c;
        }
        countingSort(arr, max);
    }

    public static void countingSort(int[] arr, int max) {
        int[] cnt = new int[max + 1];
        for (int c : arr)
            ++cnt[c];
        for (int i = 1; i < cnt.length; ++i) {
            cnt[i] = cnt[i] + cnt[i - 1];
        }
        int[] newArray = new int[arr.length];

       // for (int c : arr)
           //  newArray[--cnt[c]] = c;
        System.out.println();
        //stablity code
        for (int i = arr.length - 1; i >= 0; --i) {
            newArray[--cnt[arr[i]]] = arr[i];
        }
        for (int c : newArray)
            System.out.print(c + " ");
    }
}
