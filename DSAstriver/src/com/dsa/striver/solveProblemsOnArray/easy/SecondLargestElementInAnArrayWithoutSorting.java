/*Brute Force*/
package com.dsa.striver.solveProblemsOnArray.easy;

public class SecondLargestElementInAnArrayWithoutSorting {


    public static void main(String[] args) {
        int[] arr = {4,3,5,6,2,11,10,88,91};
       int secondLargest = secondLargestElementInAnArrayWithoutSorting(arr);
        System.out.println("Second largest without sorting "+secondLargest);

    }

    private static int  secondLargestElementInAnArrayWithoutSorting(int[] arr) {
        
        //1st pass

        int sec = -1 ;
        int first = -1 ;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] > first){
               first = arr[i];
           }
        }for (int i = 0; i < arr.length; i++) {
           if(arr[i] > sec && arr[i]!=first){
               sec = arr[i];
           }
        }

        return sec;
    }
}

