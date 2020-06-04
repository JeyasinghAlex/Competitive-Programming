package LeetCodeChallenges.LeetCodeMay;

public class HomeWork {

    public static void main(String[] args) {
        int[] startTime = {1,2,3};
        int[] endTime = {3,2,7};
        System.out.println(busyStudent(startTime, endTime, 4));
    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        int cnt = 0;
        for (int i = 0; i < startTime.length; ++i) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime){
                cnt ++;
            }
        }
        return cnt;
    }


}
