package com.dsa.striver.sorting;

/**
 * @author Irfan.Katarki on 29-07-2023
 * @project DontOpen
 */
public class RecursiveBubbleSort {

    public static void main(String[] args) {
        int[] arr = {1,4,3,2,4,6,7,8,9};


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int n = arr.length - 1;

        bubbleSortPractice(arr,n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    private static void bubbleSortPractice(int[] arr, int n) {

        if(n == 1){
            return;
        }
        for (int j = 0; j < n - 1; j++) {
            if(arr[j] > arr[j + 1]){
                swapBubbleSort(arr,j,j+1);

            }
        }

        bubbleSortPractice(arr,n-1);

    }

    private static void swapBubbleSort(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}
