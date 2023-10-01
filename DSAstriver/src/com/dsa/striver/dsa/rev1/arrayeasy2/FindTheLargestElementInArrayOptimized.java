package com.dsa.striver.dsa.rev1.arrayeasy2;

import java.util.Arrays;
// Optimized Version
public class FindTheLargestElementInArrayOptimized {
    public static void main(String[] args) {
        int[] arr = {2,1,6,7,4,12,3,4,5,2,1,4};
        System.out.println(Arrays.toString(arr));
        findTheLargestElementInArrayOptimized(arr);
    }

    private static void findTheLargestElementInArrayOptimized(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
