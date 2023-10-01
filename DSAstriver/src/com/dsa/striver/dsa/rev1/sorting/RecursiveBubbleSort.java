package com.dsa.striver.dsa.rev1.sorting;

import java.util.Arrays;

public class RecursiveBubbleSort {

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 7, 6, 5,3,9,100,11,12,14,13};
        System.out.println(Arrays.toString(arr));
        int i = 0, j = arr.length - 1;
        recursiveBubbleSort(arr,i,j);
        System.out.println(Arrays.toString(arr));
    }

    private static void recursiveBubbleSort(int[] arr, int start, int end) {

        if(start == end) {
            end--;
            start=0;
        }

        if (end == 0) {
            return;
        }
        if(arr[start] > arr[start + 1] ) {
            swap(arr, start, start + 1);
            recursiveBubbleSort(arr,start+1,end);
        }
         recursiveBubbleSort(arr,start+1,end);
     }

    private static void swap(int[] arr, int i, int small) {
        int temp = arr[i];
        arr[i] = arr[small];
        arr[small] = temp;
    }

}
