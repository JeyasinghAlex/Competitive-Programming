package LeetCodeChallenges.LeetCodeMay;

import java.util.Arrays;

public class MaximumAreaOfVerticalAndHorizontalCut {
    public static void main(String[] args) {
        int h = 5;
        int w = 4;
        int[] horizontalCuts = {3,1};
        int[] verticalCuts = {1};
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        System.out.println(maxxArea(h, w, horizontalCuts, verticalCuts));
    }

    private static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        int max = Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;

            for (int i = 1; i < horizontalCuts.length; ++i) {
                max = Math.max(max, horizontalCuts[i] - horizontalCuts[i - 1]);
            }
            int bottom = h - horizontalCuts[horizontalCuts.length - 1];
            max = Math.max(max, bottom);


            for (int i = 1; i < verticalCuts.length; ++i) {
                max1 = Math.max(max1, verticalCuts[i] - verticalCuts[i - 1]);
            }

            int right = w - verticalCuts[verticalCuts.length - 1];
            max1 = Math.max(max1, right);

        System.out.println(max + "  " + max1);
        return Math.abs((max * max1) % 1000000007);
    }


    public static int maxxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        long hw = 0;
        int ov = 0;
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        for(int i=0; i<horizontalCuts.length; i++) {
            hw = Math.max(hw, horizontalCuts[i] - ov);
            ov = horizontalCuts[i];
        }
        hw = Math.max(hw, h-ov);
        // System.out.println(hw);
        ov = 0;
        long vw = 0;
        for(int i=0; i<verticalCuts.length; i++) {
            vw = Math.max(vw, verticalCuts[i] - ov);
            ov = verticalCuts[i];
        }
        vw = Math.max(vw, w-ov);
        // System.out.println(vw);
        long res = vw*hw;
        return (int) (res%1000000007);
    }
}
