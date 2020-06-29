package LeetCodeChallenges.LeetCodeJun;

public class CheckIfArrayPairsAreDivisibleByk {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,10,6,7,8,9};
        int k = 5;
        System.out.println(canArrange(arr, k));
    }

    private static boolean canArrange(int[] arr, int k) {
        int[] cnt = new int[arr.length];
        for (int i = 0; i < arr.length; ++i)
            cnt[(arr[i] % k + k) % k]++;

        if (cnt[0] % 2 != 0)
            return false;

        for (int i = 1; i < k; ++i)
            if (cnt[i] != cnt[k - i])
                return false;
        return true;
    }
}
