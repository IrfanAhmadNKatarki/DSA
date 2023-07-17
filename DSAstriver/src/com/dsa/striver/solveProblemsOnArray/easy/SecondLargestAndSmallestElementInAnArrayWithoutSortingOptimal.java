package com.dsa.striver.solveProblemsOnArray.easy;

public class SecondLargestAndSmallestElementInAnArrayWithoutSortingOptimal {


    public static void main(String[] args) {
        int[] arr = {5,6,2,3,10,88,91,91,88};
        int secondLargest = secondLargestElementInAnArrayWithoutSorting(arr);
        int secondsmallest = secondSmallestElementInAnArrayWithoutSorting(arr);
        System.out.println("Second largest without sorting "+secondLargest);
        System.out.println("Second smallest without sorting "+secondsmallest);

    }

    private static int secondSmallestElementInAnArrayWithoutSorting(int[] arr) {
        int sec = Integer.MAX_VALUE ;
        int first = arr[0] ;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < first){
                sec = first;
                first = arr[i];
            }
            else if(first < arr[i] && arr[i] < sec){
                sec = arr[i];
            }
        }

        return sec;
    }

    private static int  secondLargestElementInAnArrayWithoutSorting(int[] arr) {

        //1st pass

        int sec = Integer.MIN_VALUE ;
        int first = arr[0] ;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > first){
                sec = first;
                first = arr[i];
            }
            else if(first < arr[i] && arr[i] > sec){
                sec = arr[i];
            }
        }

        return sec;
    }
}

