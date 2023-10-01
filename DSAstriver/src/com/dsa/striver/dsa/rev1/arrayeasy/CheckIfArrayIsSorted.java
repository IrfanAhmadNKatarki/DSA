package com.dsa.striver.dsa.rev1.arrayeasy;

/**
 * @author Irfan.Katarki on 02-08-2023
 * @project DontOpen
 */

//Brute Force
public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[]  arr = {1,2,2,4,4};
        System.out.println(checkIfSorted(arr));

    }

    private static boolean checkIfSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i+1] >= arr[i]){

            }
            else
                return false;
        }
            return true;
    }
}
