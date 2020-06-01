public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        int[] ran = new int[128];

        if (ransomNote == null || ransomNote.trim().isEmpty())
            return true;
        if (magazine == null || magazine.trim().isEmpty())
            return false;

        for (char c : ransomNote.toCharArray())
            ++ran[c];

        for (char c: magazine.toCharArray())
            --ran[c];

        for (char c : ransomNote.toCharArray())
            if (ran[c] > 0)
                return false;

        return true;
    }
}
