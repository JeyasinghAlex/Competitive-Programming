public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
        System.out.println(iisPalindrome(-121));
    }

    private static boolean isPalindrome(int number) {

        if(number < 0 || (number % 10 == 0 && number != 0)) {
            return false;
        }
        int num = number;
        int rev = 0;
        while (number != 0) {
            rev = (rev * 10) + number % 10;
            number = number / 10;
        }
        return num == rev;
    }

    private static boolean iisPalindrome(int number) {
        String s = String.valueOf(number);
        System.out.println(s);
        int st = 0;
        int ed = s.length() - 1;
        while (st < ed) {
            if(s.charAt(st) != s.charAt(ed)) return false;
            st++;
            ed--;
        }
        return true;
    }
}
