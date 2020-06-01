public class FloodFill {
    public static void main(String[] args) {

    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        if (image[sr][sc] == newColor) return image;

        fillPaint(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    private void fillPaint(int[][] arr, int row, int col, int oldCol, int newCol) {

        if (row < 0 ||  col < 0 || row >= arr.length || col >= arr[0].length || arr[row][col] != oldCol)
            return;

        arr[row][col] = newCol;

        fillPaint(arr, row + 1, col, oldCol, newCol);
        fillPaint(arr, row - 1, col, oldCol, newCol);
        fillPaint(arr, row, col + 1, oldCol, newCol);
        fillPaint(arr, row, col - 1, oldCol, newCol);
    }
}
