package com.dsa.striver.sorting;


import org.w3c.dom.ls.LSOutput;

public class SelectionSort {


    public static void main(String[] args) {

        int[] arr = {86,54,33,22,78,90,521};

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        selectionSort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }


    }

    private static void selectionSort(int[] arr) {
        for(int i = 0; i <= arr.length - 3; i++){
                int minIndex = i;
            for (int j = i; j <= arr.length - 2; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;

                }
                swap(i, minIndex, arr);
            }

        }

    }

    private static void swap(int currIndex, int minIndex, int[] arr){
            int temp = arr[currIndex];
            arr[currIndex] = arr[minIndex];
            arr[minIndex] = temp;
    }

}
