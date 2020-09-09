package LeetCodeChallenges.LeetCodeJun;

public class RabinKarpStringMatchingAlgorithm {
    public static void main(String[] args) {
        String s =   "ccaccaaedbs";
        String pattern = "cac";
//        System.out.println(s.substring(0,3));
       // System.out.println(isMatching(s, pattern));
        System.out.println(rabinKarp(s, pattern));
    }


    private static boolean rabinKarp(String txt, String pattern) {
        int d = 10;
        int q  = 5381;
        int m = pattern.length();
        int n = txt.length();
        int i, j;
        int p = 0;
        int t = 0;
        int h = 1;

        for (i = 0; i < m - 1; i++)
            h = (h * d) % q;

        // Calculate hash value for pattern and text
        for (i = 0; i < m; i++) {
            p = (d * p + pattern.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }

        // Find the match
        for (i = 0; i <= n - m; i++) {
            if (p == t) {
                for (j = 0; j < m; j++) {
                    if (txt.charAt(i + j) != pattern.charAt(j))
                        break;
                }

                if (j == m) {
                    System.out.println("Pattern is found at position: " + (i + 1));
                    return true;
                }
            }

            if (i < n - m) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % q;
                if (t < 0)
                    t = (t + q);
            }
        }
        return false;
    }


    private static int generateHash (String pattern) {
        int hash = 0;
        for (int i = 0; i < pattern.length(); ++i) {
            hash += (pattern.charAt(i) - 'a' +1 ) * pow(26, pattern.length() - 1 - i);
        }
        return hash;
    }

    private static int pow(int base, int n) {
        int out = base;
        if (n == 0)
            return 1;
        while (n > 0) {
            out += base *  n;
            n--;
        }
        return out;
    }

    private static boolean isMatching(String s, String pattern) {
        int i = 0; int j = 0;
        while (i < s.length()) {
            if (s.charAt(i) == pattern.charAt(j)) {
                if (++j == pattern.length())
                    return true;
            } else {
                i = i - j;
                j = 0;
            }
            i++;
        }
        return false;
    }
}
