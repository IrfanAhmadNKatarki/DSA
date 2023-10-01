package com.dsa.striver.dsa.rev1.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 7, 6, 5};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i ; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                }
            }
        }

    }

    private static void swap(int[] arr, int i, int small) {
        int temp = arr[i];
        arr[i] = arr[small];
        arr[small] = temp;
    }

}
