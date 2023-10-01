package com.dsa.striver.dsa.rev1;

/**
 * @author Irfan.Katarki on 31-07-2023
 * @project DontOpen
 */
public class SecondLargestElementInAnArrayWithOutSorting {

    public static void main(String[] args) {
        int[] arr = {3,5,1,2,7,6,6,9,8};
        System.out.println(secondLar(arr));
    }

    private static int secondLar(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int scmax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < max && arr[i] > scmax ){
                scmax = arr[i];
            }

        }

        return scmax;
    }

}
