package LeetCodeChallenges.LeetCodeJun;

import java.util.*;

public class MakingFileNamesUnique {
    public static void main(String[] args) {
        String[] arr = {"gta","gta(1)","gta","avalon"};
        System.out.println(Arrays.toString(getFolderNames(arr)));
    }


    private static String[] getFolderNames(String[] names) {
        Map<String, Integer> map = new HashMap<>();
        String[] res = new String[names.length];
         for (int i =  0; i < names.length; ++i) {
             res[i] = names[i];
             if (!map.containsKey(names[i])) {
                map.put(names[i], 0);
             } else {
                 while (map.containsKey(res[i])) {
                     int count = map.get(names[i]) + 1;
                     String newFile = names[i] + "(" + count + ")";
                     map.put(names[i], count);
                     res[i] = newFile;
                 }
                 map.put(res[i], 0);
             }
         }
         return res;
    }

}
