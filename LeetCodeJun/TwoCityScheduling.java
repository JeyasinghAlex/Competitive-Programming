package LeetCodeChallenges.LeetCodeJun;

import java.util.Arrays;

public class TwoCityScheduling {
    public static void main(String[] args) {
        int[][] arr = {{10,20},{30,200},{400,50},{30,20}};
        int[][] arr1 = {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
        System.out.println(twoCitySchedCost(arr1));
    }

    private static int twoCitySchedCost(int[][] costs) {

        Arrays.sort(costs, (a, b) ->{
            return (a[0] - a[1]) - (b[0] - b[1]);
        });

        int cost = 0;
        for (int i = 0, j = costs.length/2; i < costs.length/2 && j < costs.length; ++i, ++j) {
            cost += costs[i][0] + costs[j][1];
        }
        return cost;
    }
}
