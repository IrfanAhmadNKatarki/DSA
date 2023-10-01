package com.dsa.striver.dsa.rev1.arrayeasy;

/**
 * @author Irfan.Katarki on 31-07-2023
 * @project DontOpen
 */
public class SecondLargestElementInAnArrayWithOutSortingOptimal {
    public static void main(String[] args) {
       int[] arr  = {5,3,1,2,6,7,9,8,10};

        System.out.println(SecondLargestElementInAnArray(arr));
       
    }

    private static int SecondLargestElementInAnArray(int[] arr) {
        int first = arr[0];
        int sec = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {



            if(arr[i] > first){
                sec = first;
                first = arr[i];

            }
            if(arr[i] < first && arr[i] > sec){
                sec = arr[i];
            }


        }
        return sec;
    }


}
