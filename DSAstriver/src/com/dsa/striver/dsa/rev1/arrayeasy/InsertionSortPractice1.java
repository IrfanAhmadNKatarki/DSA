package com.dsa.striver.dsa.rev1;

/**
 * @author Irfan.Katarki on 29-07-2023
 * @project DontOpen
 */
public class InsertionSortPractice1 {

    public static void main(String[] args) {
        System.out.println("Insertion Sort " );
        int[] arr = {5,2,1,3,6,7,9,8};
        insertionSortPractice1(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    private static void insertionSortPractice1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while( j > 0 && arr[j - 1]  > arr[j]){
                swapInsertionSortPractice1(arr,j-1,j);
                j--;
            }

        }
    }

    private static void swapInsertionSortPractice1(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i]  = arr[j];
            arr[j] = temp;

    }
}
