package com.dsa.striver.dsa.rev1.arrayeasy2;

import java.util.Arrays;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        sorting(arr);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(arr));
        System.out.println(missing(arr));

    }

    private static int missing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i != arr[i]) {
                return i;
            }
        }
    return -1;
    }

    private static void sorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int small = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[small] > arr[j]){
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }

}
