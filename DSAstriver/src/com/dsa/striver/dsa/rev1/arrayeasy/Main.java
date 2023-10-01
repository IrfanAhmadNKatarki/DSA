package com.dsa.striver.dsa.rev1.arrayeasy;

/**
 * @author Irfan.Katarki on 02-08-2023
 * @project DontOpen
 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,5,5,6,6,6,6};
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int removeDuplicates(int[] arr) {
        HashSet < Integer > set = new HashSet < > ();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x: set) {
            arr[j++] = x;
        }
        return k;
    }
}
