public class MonotonicArray {
    /** Three answer available :*/

    public static void main(String[] args) {
        int[] A = {1,2,2,3};
        int count = 0;
        for (int i = 1; i < A.length; ++i) {
            if (A[i] < A[i - 1]) {
                count++;
                break;
            }
        }

        for (int i = 1; i < A.length; ++i) {
            if (A[i] > A[i - 1]) {
                count++;
                break;
            }
        }
        System.out.println(count == 2 ? "false" : "true");
    }

    private boolean isMono(int[] A) {
        return increasing(A) || decreasing(A);
    }

    private boolean increasing(int[] A) {
        for (int i = 0; i < A.length - 1; ++i)
            if (A[i] > A[i+1]) return false;
        return true;
    }

    private boolean decreasing(int[] A) {
        for (int i = 0; i < A.length - 1; ++i)
            if (A[i] < A[i+1]) return false;
        return true;
    }

    private boolean isMonotonic(int[] A) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < A.length - 1; ++i) {
            if (A[i] > A[i + 1])
                increasing = false;

            if (A[i] < A[i + 1])
                decreasing = false;
        }
        return increasing || decreasing;
    }
}
