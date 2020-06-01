public class FirstBadVersion {
    public static void main(String[] args) {

    }

    public static int firstBadVersion(int n) {

        int first = 0, last = n - 1, mid = 0;
        while (first <= last) {
            mid = (first + (last-first)/2);

//            if(isBadVersion(mid)){
//                last = mid - 1;
//            }else {
//                first = mid + 1;
//            }
        }
//        return  (isBadVersion(first) ? first : first + 1);
        return 0;
    }
}
