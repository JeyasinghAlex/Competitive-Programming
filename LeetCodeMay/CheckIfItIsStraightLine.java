public class CheckIfItIsStraightLine {
    public static void main(String[] args) {

    }

    private boolean checkStraightLine(int[][] coordinates) {

        int[] x = coordinates[1];
        int[] y = coordinates[0];
        float commanSlope = findSlope(x, y);

        for (int i = 2; i < coordinates.length; ++i) {

            float slope = findSlope(coordinates[i], coordinates[0]);

            if (commanSlope != slope)
                return false;
        }
        return true;
    }

    private float findSlope(int[] x, int[] y) {

        if (x[0] - y[0] == 0)
            return 0;

        return (float)(y[1] - x[1])/(y[0] - x[0]);

    }
}
