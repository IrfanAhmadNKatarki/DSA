package com.dsa.striver.solveProblemsOnArray.easy;

/**
 * @author Irfan.Katarki on 27-07-2023
 * @project DontOpen
 */
public class ReverseAnArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int i = 0, j = arr.length - 1;
        reverseArray(arr,i,j);
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }

        reverseArrays(arr,i,j);
        System.out.println();

        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }

    private static void reverseArray(int[] arr, int i, int j) {

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
            }
         }

    private static void reverseArrays(int[] arr, int i, int j) {

        for (int k = 0; k < arr.length/2; k++) {
            int temp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = temp;

        }

    }
}
