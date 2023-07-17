package com.dsa.striver.solveProblemsOnArray.easy;

/*
Find the missing number in an array
        Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N), that is not present in the given array.
*/

/*Optimal Approach*/
public class FindTheMissingNumberInASortedArrayOptimal  {

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,17};
        int increment = 2;
        int miss = missingNumber(arr, increment);
        System.out.println("The missing number is "+miss);
    }

    private static int missingNumber(int[] arr, int increment) {
        int missingValue = 0;
        for (int q = 0; q < arr.length - 1; q++) {
            missingValue= arr[q]+increment;
            if(arr[q+1] != missingValue){
                return missingValue;
            }
        }
        return -1;
    }


}
