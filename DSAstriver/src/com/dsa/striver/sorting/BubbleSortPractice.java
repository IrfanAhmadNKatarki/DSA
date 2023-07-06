package com.dsa.striver.sorting;

public class BubbleSortPractice  {

    public static void main(String[] args) {
        int[] arr = {8,9,7,4,3,12,10,14,13,1};
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
        int low = 0, high = arr.length - 1;
        bubbleSort(arr, low,high);
        for (int j : arr) {
            System.out.print(j + " ");
        }
  }

    private static void bubbleSort(int[] arr, int i, int j) {
        int n = arr.length - 1;
        for(int k = n ; k >=1 ; k--) {
            for (int l = 0; l < k ; l++) {
                if(arr[l] > arr[l+1]){
                    swap(arr,l,l+1);
                }
            }
            n--;
        }
    }

    private static void swap(int[] arr,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
