package com.dsa.striver.sorting;

public class InsertionSort {

    public static void main(String[] args) {

//        int[] arr = {86,54,33,22,78,90,521};
        int[] arr = {16,14,18,10,19,100,5};
//        int[] arr = {1,2,3,4,5,6,7};
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        insertionSort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }


    }

    private static void insertionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int j = i;
            while(j > 0  && arr[j - 1] > arr[j]) {
                swap(j - 1, j, arr);
                j--;
                System.out.println("Outer loop count");
            }

        }

    }

    private static void swap(int j, int k, int[] arr){
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }

}
