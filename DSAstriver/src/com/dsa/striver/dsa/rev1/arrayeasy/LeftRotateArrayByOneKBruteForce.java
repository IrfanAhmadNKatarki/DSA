package com.dsa.striver.dsa.rev1.arrayeasy;

/**
 * @author Irfan.Katarki on 05-08-2023
 * @project DontOpen
 */
public class LeftRotateArrayByOneKBruteForce {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        int k = 2;
        int[] arr2 = new int[k];
        byKPlace(arr, k, arr2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void byKPlace(int[] arr, int k, int[] arr2) {
        for (int i = 0; i < k; i++) {
            arr2[i] = arr[i];
        }
        int j = 0;
        for (int i = 2; i < arr.length; i++) {
            arr[j] = arr[i];
            j++;
        }

        int finalLength = arr.length - k;
        int l = 0;
        for (int i = finalLength; i < arr.length ; i++) {
            arr[i] = arr2[l];
            l++;
       }


    }

}
