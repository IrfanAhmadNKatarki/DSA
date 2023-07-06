package com.dsa.striver.sorting;

public class PracticeBubblesort{

    public static void main(String[] args) {
        int[] arr = {8,9,7,4,3,12,10,14,13,1};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int low = 0, high = arr.length - 1;
        bubbleSort(arr, low,high);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }



    }

    private static void bubbleSort(int[] arr, int i, int j) {
        for (int k = 0; k < arr.length -1; k++) {
            int min = arr[k];
            for (int l = k; l <= arr.length - 1; l++) {
                if(arr[l] < min){
                    min = arr[l];
                    swap(arr,l,k);
                }
            }
        }
    }

    private static void swap(int[] arr,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
