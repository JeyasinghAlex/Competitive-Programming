import java.util.Scanner;

public class Practice {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        long n = scan.nextLong();
        long index = 0, count = 0;
        char[] arr = s.toCharArray();
        long len = s.length();
        while (n > s.length()){
            s = s + arr[(int) index++];
            if(index >= len){
                index = 0;
            }
        }
        System.out.println(s);
        arr = s.toCharArray();
        for(int i = 0; i < n; i++){
            if(arr[i] == 'a' && arr.length > 1){
                count++;
            }
            if(arr[i] == 'a' && arr.length == 1){
                count = n;
                break;
            }
        }
        System.out.println(count);
    }

}
