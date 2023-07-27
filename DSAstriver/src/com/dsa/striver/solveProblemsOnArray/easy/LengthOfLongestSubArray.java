package com.dsa.striver.solveProblemsOnArray.easy;

/**
 * @author Irfan.Katarki on 18-07-2023
 * @project DontOpen
 */

import java.util.ArrayList;

/**
 * Longest Subarray with given Sum K(Positives)
 * Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.
 * Examples
 * Example 1:
 * Input Format: N = 3, k = 5, array[] = {2,3,5}
 * Result: 2
 * Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.
 *
 * Example 2:
 * Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
 * Result: 3
 * Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.
 */

/**
 * Brute Force:
 */
public class LengthOfLongestSubArray {

    public static void main(String[] args) {

        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(4);
        ar.add(1);
        ar.add(1);
        ar.add(1);
        ar.add(-1);
        ar.add(-1);
        ar.add(1);
        ar.add(1);
        ar.add(1);
        int totalShouldBe = 4;
        System.out.println("The longest subarray length is "+longestSubarray(ar, totalShouldBe));

    }

    private static int longestSubarray(ArrayList<Integer> ar, int totalShouldBe) {
        System.out.println(ar);
        System.out.println();
        int len = 0;
        for (int i = 0; i < ar.size(); i++) {
            for (int j = i; j < ar.size(); j++) {
                int sum = 0;
                for (int k = i; k <= j; k++){
                    sum+=ar.get(k);
                }
                if(sum == totalShouldBe){
                    len = Math.max(len, j - i + 1);
                }
            }
        }
    return len;
    }
}
