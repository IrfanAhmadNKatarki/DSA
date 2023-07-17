package com.dsa.striver.solveProblemsOnArray.easy;

public class SecondLargestElementInAnArrayWithSorting {

    public static void main(String[] args) {

        int[] arr = {1,10,10,10};
        for (int j: arr ) {
            System.out.print(j+" ");
        }
        int low = 0;
        int high = arr.length - 1;
        sortTheArray(arr,low,high);
        System.out.println();

        for (int j: arr ) {
            System.out.print(j + " ");
        }

        int secondLargest = FindSecondLargestElementInAnArrayWithSorting(arr);
        System.out.println("The second Largest element is "+secondLargest);
    }

    //SelectionSort
    private static void sortTheArray(int[] arr,int low, int high) {
        for (int i = 0; i < arr.length; i++) {
             int small = arr[i];
             for (int j = i; j < arr.length; j++) {
                if(small>arr[j]){
                    swapss(arr,i,j);
                }
            }

        }
    }

    private static void swapss(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }

    private static int FindSecondLargestElementInAnArrayWithSorting(int[] arr) {

        for (int i = arr.length - 2; i >= 0; i--) {
                if(arr[i]!=arr[arr.length-1]){
                    return arr[i];
                }
        }

        return -1;
    }


}
