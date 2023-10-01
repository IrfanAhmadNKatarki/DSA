package com.dsa.striver.dsa.rev1.arrayeasy2;

import java.util.Arrays;

public class SecondLargestElementOptimized {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 5, 8, 7, 6};
        System.out.println(secondLargest(arr));
    }

    private static int secondLargest(int[] arr) {

        int max = arr[0];
        int slast = max;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                slast = max;
                max = arr[i];
            }
            if (arr[i] < max && arr[i] > slast) {
                slast = arr[i];
            }
         }

        return slast;
    }

}
