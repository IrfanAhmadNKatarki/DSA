package com.dsa.striver.dsa.rev1.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {2,1,4,7,6,5};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int small = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[small]) {
                    small = j;
                }
            }
            if(i!=small) {
                swap(arr,i,small);
            }

        }

    }

    private static void swap(int[] arr, int i, int small) {
        int temp = arr[i];
        arr[i] = arr[small];
        arr[small] = temp;
    }

}
