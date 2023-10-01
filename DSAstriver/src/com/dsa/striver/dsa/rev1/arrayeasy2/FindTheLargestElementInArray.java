package com.dsa.striver.dsa.rev1.arrayeasy2;

import java.util.Arrays;
// Brute Force Version
public class FindTheLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {2,1,6,7,4,12,3,4,5,2,1,4};
        System.out.println(Arrays.toString(arr));
        System.out.println(findTheLargestElementInArray(arr));

    }

    private static int findTheLargestElementInArray(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}
