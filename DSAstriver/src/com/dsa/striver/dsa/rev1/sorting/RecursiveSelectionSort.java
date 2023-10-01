package com.dsa.striver.dsa.rev1.sorting;

import java.util.Arrays;

public class RecursiveSelectionSort {

    public static void main(String[] args) {
        int[] arr = {5,1,4, 2, 3, 6,9,7,8,10};
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length - 1;
        recursiveSelection(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }

    private static void recursiveSelection(int[] arr, int start, int end) {
        if(start == arr.length - 1){
            return;
        }

        int min = start;
        for (int i = min; i <= end; i++) {
                if(arr[i] < arr[min]){
                    min = i;
                }
        }
        int temp = arr[min];
        arr[min] = arr[start];
        arr[start] = temp;

        recursiveSelection(arr,start+1,end);

    }

}
