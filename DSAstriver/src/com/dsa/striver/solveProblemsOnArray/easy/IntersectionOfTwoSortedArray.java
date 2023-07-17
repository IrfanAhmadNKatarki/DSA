package com.dsa.striver.solveProblemsOnArray.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoSortedArray {

    public static void main(String[] args) {
        int[] arr1 = {1,3,3,5,6,7,7};
        int[] arr2 = {2,3,3,5,6,7,7};
        int[] visitedArray;
        if(arr1.length < arr2.length){
            visitedArray = new int[arr1.length];
        }
        else{
            visitedArray = new int[arr2.length];
        }
        intersectionOfTwo(arr1,arr2, visitedArray);
    }

    private static void intersectionOfTwo(int[] arr1, int[] arr2, int[] visitedArray) {

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j] && visitedArray[i] == 0){
                    arr.add(arr1[i]);
                    visitedArray[i] = 1;
                }
            }
        }

        System.out.println(" -------- ");

        for (int ele:
                arr) {
            System.out.print(ele+" ");

        }

    }
}
