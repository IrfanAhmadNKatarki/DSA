package com.dsa.striver.dsa.rev1.arrayeasy2;

import java.util.Arrays;

// Brute Force :: : :: : :
public class LeftRotateTheArrayByOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,7,8};
        System.out.println(Arrays.toString(arr));
        leftRotateTheArrayByOne(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void leftRotateTheArrayByOne(int[] arr) {
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = first;
    }
}
