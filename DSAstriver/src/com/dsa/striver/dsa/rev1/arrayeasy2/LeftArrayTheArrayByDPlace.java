package com.dsa.striver.dsa.rev1.arrayeasy2;

import java.util.Arrays;

public class LeftArrayTheArrayByDPlace {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 2;
        System.out.println(Arrays.toString(arr));
        leftRotateTheArrayByDPlace(arr,k);
        System.out.println(Arrays.toString(arr));

    }

    // 8 - 2 = 6 // 0 1 2 3 4 5 6
    // 1 2 3 44 5 6 6
    // temp arr
    //

    private static void leftRotateTheArrayByDPlace(int[] arr, int k) {
        int[] temp = new int[3];
        for (int i = 0; i <= k; i++) {
            temp[i] = arr[i];
        }

        int j = k + 1;
        for (int i = 0; i < arr.length - k - 1; i++) {
            arr[i] = arr[j];
            j++;
        }
        int l = 0;
        for (int i = arr.length - k - 1; i < arr.length ; i++) {
            arr[i] = temp[l];
            l++;
        }

    }
}
