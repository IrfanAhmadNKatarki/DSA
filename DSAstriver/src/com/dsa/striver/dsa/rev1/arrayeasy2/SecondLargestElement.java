package com.dsa.striver.dsa.rev1.arrayeasy2;


import java.util.Arrays;

// Brute Force
public class SecondLargestElement {
    public static void main(String[] args) {
     int[] arr = {2,1,4,5,8,7,6};
     System.out.println(secondLargest(arr));
    }

    private static int secondLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

}
