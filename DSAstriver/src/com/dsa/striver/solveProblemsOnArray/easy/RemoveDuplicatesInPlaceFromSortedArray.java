package com.dsa.striver.solveProblemsOnArray.easy;

import java.util.HashSet;
import java.util.Set;
//Brute Force Apprpach
public class RemoveDuplicatesInPlaceFromSortedArray {

    public static void main(String[] args) {

        int[] arr = {1,1,1,2,2,2,3,3,3,4,4,4};

        for(int j:arr){
            System.out.print(j+" ");
        }
        removeDuplicatesInPlaceFromSortedArrayfun(arr);

        for(int j:arr){
            System.out.print(j+" ");
        }
    }

    private static void removeDuplicatesInPlaceFromSortedArrayfun(int[] arr) {
        Set<Integer> arr2 = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            arr2.add(arr[i]);
            System.out.println(arr2);

        }
        int i = 0;
        for(int j : arr2){
            arr[i] = j;
            i++;
        }

    }


}
