package com.dsa.striver.sorting;

import static java.util.Collections.swap;

public class InsertionSortPractice {

    public static void main(String[] args) {
        int[]  arr = {55,33,21,87,67,92,54,11};
        System.out.println("-- Before -- ");
        for (int j : arr){
            System.out.print(j+" ");
        }


        insertionSortPractice(arr);
        System.out.println("-- After -- ");
        for (int j : arr){
            System.out.print(j+" ");
        }
    }

    private static void insertionSortPractice(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                swap(arr,j-1,j);
                j--;
            }

        }


    }

    private static void swap(int[] arr,int i, int j) {
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
    }


}
