package com.dsa.striver.solveProblemsOnArray.easy;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInPlaceFromSortedArrayOptimalApproach {

    public static void main(String[] args) {

        int[] arr = {1,1,1,2,2,2,3,3,3,4,4,4};

        for(int j:arr){
            System.out.print(j+" ");
        }
        System.out.println();
        System.out.println("The size of array after removing sorted elements is "+removeDuplicatesInPlaceFromSortedArrayfun(arr));

        for(int j:arr){
            System.out.print(j+" ");
        }
    }

    private static int removeDuplicatesInPlaceFromSortedArrayfun(int[] arr) {
        int k = 0;
        for (int j = 1; j < arr.length - 1; j++) {

            if(arr[k]!=arr[j] ){
                k++;
                arr[k] = arr[j];

            }

        }
        return k;
    }




}
