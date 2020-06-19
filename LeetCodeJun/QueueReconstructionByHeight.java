package LeetCodeChallenges.LeetCodeJun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueueReconstructionByHeight {
    public static void main(String[] args) {
        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        reconstructQueue(people);
    }

    private static void reconstructQueue(int[][] people) {
        List<int[]> result = new ArrayList<>();
        Arrays.sort(people, (a, b) -> {
            System.out.println(Arrays.toString(a) + " "+ Arrays.toString(b));
            return   a[0] == b[0] ? a[1] - b[1] : b[0] - a[0];
        });

        for (int[] arr : people)
            result.add(arr[1], arr);
        result.toArray(new int[people.length][2]);
    }
}
