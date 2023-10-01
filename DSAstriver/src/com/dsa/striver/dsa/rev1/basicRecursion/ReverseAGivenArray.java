package com.dsa.striver.dsa.rev1.basicRecursion;

import java.util.Arrays;

import static java.lang.Long.reverse;

public class ReverseAGivenArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int i, int i1) {
        if(i >= i1) {
            return;
        }
        swap(arr, i, i1);
        reverse(arr, i + 1, i1 - 1);
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }

}
