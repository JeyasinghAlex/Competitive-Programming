package LeetCodeChallenges.LeetCodeJun;

import java.util.*;

public class PathCrossing {
    public static void main(String[] args) {
        String s = "SS";
        System.out.println(isPathCrossing(s));
    }

    private static boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        Set<String> set = new HashSet<>();
        set.add(x + "," + y);
        for (char ch : path.toCharArray()) {
            if (ch == 'N')
                y++;
            else if (ch == 'E')
                x++;
            else if (ch == 'S')
                y--;
            else if (ch == 'W')
                x--;
            if (set.contains(x + "," + y))
                return true;
            set.add(x + "," + y);
        }
        return false;
    }

    private static boolean isPathCrossingg(String path) {
        int x = 0;
        int y = 0;
        Set<String> set = new HashSet<>();
        set.add(x + "," + y);
        for (char c : path.toCharArray()) {
            switch(c) {
                case 'N': y++;
                    break;
                case 'E': x++;
                    break;
                case 'S': y--;
                    break;
                case 'W': x--;
                    break;
            }
            if (set.contains(x + "," + y))
                return true;
            set.add(x + "," + y);
        }
        return false;
    }

}
