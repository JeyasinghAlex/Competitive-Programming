public class RearrangeString {
    public static void main(String[] args) {
        String s = "Leetcode is cool";
        int max = Integer.MIN_VALUE;
        char[] chArr = s.toCharArray();
       chArr[0] = Character.toLowerCase(chArr[0]);
       s = new String(chArr);

        String[] strArray = s.split( " ");
        int[] lenCnt = new int[strArray.length];
        for (int i = 0; i < strArray.length; ++i) {
            lenCnt[i] = strArray[i].length();
       }
        for (int c : lenCnt) {
            if (c > max)
                max = c;
        }
       String[] str = countingSort(lenCnt, strArray,max);

       StringBuilder at = new StringBuilder();
       for (String ar : str)
           at.append(ar).append(' ');

       char[] b = at.toString().toCharArray();
       b[0] = Character.toUpperCase(b[0]);
       System.out.println(new String(b).substring(0, b.length - 1));
    }

    public static String[] countingSort(int[] arr, String[] str, int max) {
        int[] cnt = new int[max + 1];
        for (int c : arr)
            ++cnt[c];
        for (int i = 1; i < cnt.length; ++i) {
            cnt[i] = cnt[i] + cnt[i - 1];
        }
//        int[] newArray = new int[arr.length];
        String[] strArray = new String[str.length];

        for (int i = arr.length - 1; i >= 0; --i) {
//            newArray[--cnt[arr[i]]] = arr[i];
            strArray[--cnt[arr[i]]] = str[i];
        }
        return strArray;
    }
}
