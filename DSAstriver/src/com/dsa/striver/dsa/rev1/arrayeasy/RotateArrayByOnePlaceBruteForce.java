package com.dsa.striver.dsa.rev1.arrayeasy;

/**
 * @author Irfan.Katarki on 05-08-2023
 * @project DontOpen
 */
public class RotateArrayByOnePlaceBruteForce {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        int one = arr[0];
        byOnePlace(arr, one);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void byOnePlace(int[] arr, int one) {

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
            arr[arr.length - 1] = one;

        }

    }

}
