package LeetCodeChallenges.LeetCodeSep;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
//        int[] arr = {10, 1, 2, 7, 6, 1, 5};
//        System.out.println(Arrays.toString(arr));
//        CombinationSum_II obj = new CombinationSum_II();
//        System.out.println(obj.combinationSum2(arr, 8));

        int[] arr1 = {2,1,4,3,9,6};
        SortArrayByParity obj = new SortArrayByParity();
        System.out.println(Arrays.toString(obj.sortArrayParity(arr1)));
    }
}