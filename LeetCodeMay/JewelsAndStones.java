public class JewelsAndStones {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }

    private static int numJewelsInStones(String J, String S) {
        int[] count = new int[128];

        int sum = 0;
        for (char  c : S.toCharArray())
            ++count[c];
        for (char c : J.toCharArray())
            sum += count[c];

        return sum;
    }
}
