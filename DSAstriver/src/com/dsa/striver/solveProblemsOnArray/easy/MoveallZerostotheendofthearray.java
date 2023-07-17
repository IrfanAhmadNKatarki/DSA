package com.dsa.striver.solveProblemsOnArray.easy;

// Brute Force Approach

import java.util.ArrayList;
import java.util.List;

public class MoveallZerostotheendofthearray   {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 0, 0, 6, 7,0,9,0,8};
        for(int pri : arr) {
            System.out.print(pri + " ");
        }
            moveAllZeroToTheEnd(arr);
        System.out.println();
        for(int pri : arr) {
            System.out.print(pri + " ");
        }
    }

    private static void moveAllZeroToTheEnd(int[] arr) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        for (int i = 0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }
        for (int i = temp.size(); i < arr.length; i++) {
                arr[i] = 0;
        }
    }
}
