package com.dsa.striver.sorting;

public class QuickSortPractice {

    public static void main(String[] args) {
        int[] arr = {1,6,4,7,3,9,8,11,15};
        for(int j : arr){
            System.out.print(j+" ");
        }
        int low = 0, high = arr.length - 1;
         quickSort(arr,low,high);
        System.out.println();
        for(int j : arr){
            System.out.print(j+" ");
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        while (low < high) {
            int partitionIndex = quickFunctionForPartitionIndex(arr, low, high);
            quickSort(arr, low, partitionIndex);
            quickSort(arr, partitionIndex + 1, high);


        }
    }

    private static int quickFunctionForPartitionIndex(int[] arr, int low, int high) {

            int i = low;
            int j = high;
            int pivot  = arr[low];
            while(i <= high && arr[i] <= pivot){
                i++;
            }
            while(j >= low && arr[j] > pivot ){
                j--;
            }

            if(i < j){
                swaps(arr,i,j);
            }
            else{
                swaps(arr,low,j);
                return j;
            }
            return j;

        }

    private static void swaps(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
  }
}