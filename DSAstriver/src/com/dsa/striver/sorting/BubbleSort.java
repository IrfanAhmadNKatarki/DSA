package com.dsa.striver.sorting;

public class BubbleSort {


    public static void main(String[] args) {

        int[] arr = {86,54,33,22,78,90,521};
//        int[] arr = {16,14,18,10,19,100,5};
//        int[] arr = {1,2,3,4,5,6,7};
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubbleSort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }


    }

    private static void bubbleSort(int[] arr) {
        for(int i = arr.length-1; i >= 1; i--){
              int didSwap = 0;
            for (int j = 0; j <= i-1; j++) {
                if(arr[j] >  arr[j+1]){
                    swap(j,j+1, arr);
                    didSwap = 1;
                }

            }
            if(didSwap == 0){
                break;
            }
            System.out.println("Outer loop count");
        }

    }

    private static void swap(int j, int k, int[] arr){
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }

}
