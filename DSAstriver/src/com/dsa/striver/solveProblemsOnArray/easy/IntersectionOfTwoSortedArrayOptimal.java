package com.dsa.striver.solveProblemsOnArray.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Irfan.Katarki on 13-07-2023
 * @project DontOpen
 */
public class IntersectionOfTwoSortedArrayOptimal {

    public static void main(String[] args) {
        int[] arr1 = {1,3,3,5,6,7,7,8,9};
        int[] arr2 = {2,3,3,5,6,7,8,8,9};
        intersectionOfTwo(arr1,arr2);
    }

    private static void intersectionOfTwo(int[] arr1, int[] arr2) {

        ArrayList<Integer> arr= new ArrayList<>();
        int i = 0, j= 0;
        while(i < arr1.length && j < arr2.length){

            if(arr1[i]  == arr2[j]){
                arr.add(arr1[i]);
                i++;
            }

            if(i < arr1.length && j < arr2.length && arr1[i] < arr2[j]){

                while(arr1[i]  < arr2[j] ){
                    i++;
                }
            }
            else if(i < arr1.length && j < arr2.length && arr2[j] < arr1[i] ){

                while(arr2[j] < arr1[i]){
                    j++;
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
