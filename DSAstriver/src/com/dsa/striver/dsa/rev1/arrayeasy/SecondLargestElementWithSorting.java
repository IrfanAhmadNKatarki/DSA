package com.dsa.striver.dsa.rev1.arrayeasy;

/**
 * @author Irfan.Katarki on 31-07-2023
 * @project DontOpen
 */
public class SecondLargestElementWithSorting {

    public static void main(String[] args) {
        int[] ar = {1,2,3,4,4,5,6,7,7};
        System.out.println(secondLargest(ar));
    }

    private static int secondLargest(int[] ar) {
       int max = ar[ar.length - 1];
       int i = ar.length - 1;
       while(i >= 0 ){
           if(ar[i] < max){
            return ar[i];
           }
           else {
               i--;
           }

       }

        return -1;

    }
}
