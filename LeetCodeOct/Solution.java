package demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {

        System.out.print("Enter the array size - ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the inputs - ");
        for (int i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
        }

        int[] temp = new int[arr.length];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; ++i) {
            set.add(arr[i]);
        }

        int index = 0;
        for (int ch : set) {
            temp[index++] = ch;
        }
        Arrays.sort(temp);
        boolean ans = false;
        for (int i = 0; i < arr.length; ++i) {
            ans = false;
            for (int j = 0; j < arr.length; ++j) {
                if (arr[i] == temp[j] && j != arr.length - 1) {
                    ans = true;
                    System.out.println(arr[i] + " -> " + temp[j + 1]);
                }
            }
            if (!ans) {
                System.out.println(arr[i] + " -> ");
            }
        }
    }
}