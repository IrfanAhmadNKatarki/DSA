package com.dsa.striver.recursion;

/**
 * @author Irfan.Katarki on 27-07-2023
 * @project DontOpen
 */
public class ReverseAGivenArray {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7,7,8,9};
        int n = arr.length - 1;
        int i = 0;
        reverseGivenArrayUsing2Pointer(arr,i,n);
        for (int j = 0; j <= n; j++) {
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        reverseGivenArrayUsing1Pointer(arr,i);
        for (int j = 0; j <= n; j++) {
            System.out.print(arr[j]+" ");
        }


    }

    private static void reverseGivenArrayUsing1Pointer(int[] arr, int i) {

        if(i >= arr.length / 2){
            return;
        }

        int temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
        reverseGivenArrayUsing1Pointer(arr,i+1);

    }

    private static void reverseGivenArrayUsing2Pointer(int[] arr, int i, int n) {

        if(i>=n){
            return;
        }

        int temp = arr[i];
        arr[i] = arr[n];
        arr[n] = temp;

        reverseGivenArrayUsing2Pointer(arr, i+1, n-1);


    }
}
