package LeetCodeChallenges.LeetCodeSep;

public class RelativeSortArray {
    //2,3,1,3,2,4,6,7,9,2,19
//    2,1,4,3,9,6
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int index = 0;
        for (int i = 0; i < arr2.length; ++i) {
            for (int j = i; j < arr1.length; ++j) {
                if (arr2[i] == arr1[j]) {
                    int temp = arr1[index];
                    arr1[index++] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }

        for (int i = arr1.length - 1; i >= 0; --i) {
            if (arr2[arr2.length - 1] == arr1[i]) {
                index = i;
                break;
            }
        }

        for (int i = index + 1; i < arr1.length; ++i) {
            for (int j = i + 1; j < arr1.length; ++j) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        return arr1;
    }

    //Approach2: Using HashMap:
//    public int[] relativeSortarray(int[] arr1, int[] arr2) {
//
//    }
}
