package com.dsa.striver.sorting;

public class SelectionSortpractice1 {

    public static void main(String[] args) {
        int[] arr = {8,9,7,4,3,12,10,14,13,1};
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int low = 0, high = arr.length - 1;
        selectionSort(arr, low,high);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }



    }

    private static void selectionSort(int[] arr, int i, int j) {
        for (int k = 0; k < arr.length; k++) {
            int min = k;
            for (int l = k; l < arr.length; l++) {
                if(arr[min] > arr[l]){
                    min = l;
                }

            }
            swap(arr,min,k);
        }
    }

    private static void swap(int[] arr,int i, int j) {
            int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
    }


}
