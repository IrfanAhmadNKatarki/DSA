package com.dsa.striver.solveProblemsOnArray.easy;

/*
Find the missing number in an array
        Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N), that is not present in the given array.
*/

/*Brute Force*/

public class FindTheMissingNumberInASortedArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8};
        int miss = missingNumber(arr);
        System.out.println("The missing number is "+miss);
    }

    private static int missingNumber(int[] arr) {
        for (int q = 0; q < arr.length; q++) {
            if(arr[q] != q+1){
                return q+1;
            }
        }
        return -1;
    }


}
