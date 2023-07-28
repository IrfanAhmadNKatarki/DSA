package com.dsa.striver.Hashing;

import java.util.HashMap;

/**
 * @author Irfan.Katarki on 27-07-2023
 * @project DontOpen
 */
public class HashExs {

    public static void main(String args[]){

        int arr[] ={10,5,10,15,10,5};
        int n = arr.length;
        countFreq(arr, n);
    }
    public static void countFreq(int arr[], int n)
    {
        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }
}