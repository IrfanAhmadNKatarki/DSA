package com.dsa.striver.dsa.rev1.arrayeasy2;

import java.util.Arrays;
import java.util.HashSet;

// Using HashSet
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,5};
        System.out.println(Arrays.toString(arr));
        removeDuplicate(arr);
    }

    private static void removeDuplicate(int[] arr) {

        HashSet arr2 = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            arr2.add(arr[i]);
        }
        System.out.println(arr2);
    }
}
