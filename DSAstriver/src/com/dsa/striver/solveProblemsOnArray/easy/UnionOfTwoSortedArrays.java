package com.dsa.striver.solveProblemsOnArray.easy;

import javax.sound.midi.Soundbank;
import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoSortedArrays {

    public static void main(String[] args) {
       int[] arr1 = {1,3,3,5,6};
        int[] arr2 = {2,3,3,5,6,7};
        unionOfTwo(arr1,arr2);
    }

    private static void unionOfTwo(int[] arr1, int[] arr2) {

        Set<Integer> arr= new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            arr.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr.add(arr2[i]);
        }
        System.out.println(" -------- ");

        for (int ele:
             arr) {
            System.out.print(ele+" ");
            
        }

    }
}
