package com.dsa.striver.solveProblemsOnArray.easy;
import java.util.*;
/**
 * @author Irfan.Katarki on 22-07-2023
 * @project DontOpen
 */
public class LengthOfLongestSubArrayBetterUsingHashing {

    public static void main(String[] args) {
//        int[] a = {2, 3, 5, 1, 9};
//        int[] a = {1,1,0,0,0,3,1,1,5,2};
        int[] a = {4,1,1,1,-1,-1,1,1,1};
        int k = 4;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
    public static int getLongestSubarray(int []a, int k) {

        HashMap<Integer, Integer> preSumMap = new HashMap<>();
        int n = a.length;
        int sum = 0;
        int maxLen = 0;


        for (int i = 0; i < n; i++) {
            sum+=a[i];
            if(sum == k){
                maxLen = Math.max(maxLen, i+1);
            }

            int rem = sum - k;

            if(preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if(!preSumMap.containsKey(sum)){
            preSumMap.put(sum,i);
            }
  }


        return maxLen;
    }


}