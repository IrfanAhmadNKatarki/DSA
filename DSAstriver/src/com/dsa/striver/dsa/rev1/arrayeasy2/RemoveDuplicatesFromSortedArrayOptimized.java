package com.dsa.striver.dsa.rev1.arrayeasy2;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayOptimized {

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4,4,5};
        System.out.println(Arrays.toString(arr));
        removeDuplicatesOptimized(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void removeDuplicatesOptimized(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i+1] > arr[i]){
                 arr[k+1] = arr[i+1];
                 k++;
            }
        }
    }
}
