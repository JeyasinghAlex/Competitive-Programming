package LeetCodeChallenges.LeetCodeJun;

public class HIndexII {
    public static void main(String[] args) {
        int[] citations = {0, 1, 3, 5, 6};
        System.out.println(hIndex(citations));
    }
    private static int hIndex(int[] citations) {
        int st = 0;
        int ed = citations.length - 1;
        int mid = 0;
        while (st <= ed) {
            mid = st + (ed - st) / 2;
            if (citations[mid] < citations.length - mid)
                st = mid + 1;
            else
                ed = mid - 1;
        }
        return citations.length - st;
    }
}
