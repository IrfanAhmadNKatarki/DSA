package com.dsa.striver.dsa.rev1;

/**
 * @author Irfan.Katarki on 06-08-2023
 * @project DontOpen
 */
public class LeftRotateArrayByKBruteForce {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        int k = 2;
        reverseKFull(arr,k);
        reverseTillK(arr,k);
        reverseTillKSeco(arr,k);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void reverseTillKSeco(int[] arr, int k) {
        int i = arr.length - k;
        int j = arr.length - 1;
        while(i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }



    }

    private static void reverseTillK(int[] arr,int k) {
        int i = 0;
        int j = arr.length - k - 1;
        while(i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }

    }

    private static void reverseKFull(int[] arr, int k) {
        int j = arr.length - 1;
        int i = 0;
        while(i < j) {
           swap(arr, i, j);
         i++;
         j--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }



}
