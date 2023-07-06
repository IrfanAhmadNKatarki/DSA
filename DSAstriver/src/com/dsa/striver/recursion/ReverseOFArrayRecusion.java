package com.dsa.striver.recursion;

import java.util.Arrays;

public class ReverseOFArrayRecusion {
    static int arr[] = {1, 2, 3, 4, 5};

    public static String arrayToString() {
        return "ReverseOFArrayRecusion{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public static void main(String[] args) {
        int i = 0;
        ReverseOFArrayRecusion.ReverseOfArray(arr,i,arr.length - i - 1);
        System.out.println(ReverseOFArrayRecusion.arrayToString());
    }

    public static void ReverseOfArray(int[] arr, int i, int j) {
        // Logic for reversing the array
        if(i >= j){
            return;
        }
        ReverseOFArrayRecusion.swap(arr,i,j);
        i++;
        ReverseOfArray(arr,i, arr.length - i - 1);
    }

    private static void swap(int[] arr,int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
