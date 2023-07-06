package com.dsa.striver.sorting;

import java.util.ArrayList;

public class QuickSort {

    public static void main(String[] args) {

//        int[] arr = {86,54,33,22,78,90,521};
        int[] arr = {1,6,4,7,3,9,8,11,15,13,12};
//        int[] arr = {16,14,18,10,19,100,5};
//        int[] arr = {1,2,3,4,5,6,7};
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int low = 0, high = arr.length - 1;
        int pivotIndex = quickSort(arr,low,high);
        quickSort(arr,low,pivotIndex - 1);
        quickSort(arr,pivotIndex+1,high);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }


    }

    private static int quickSort(int[] arr, int low , int high) {

       int i = low;
        int j = high;
        arr[i] = arr[low];
        while(low<high) {
            while (arr[low] >= arr[i] && i <= high) {
                i++;
            }

            while (arr[low] < arr[j] && j >= low) {
                j--;
            }
            if (i < j) {
                swap(i, j, arr);
            } else {
                swap(low, j, arr);
                return j;
            }



        }
        return j;
    }

    private static void swap(int j, int k, int[] arr){
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }



}
