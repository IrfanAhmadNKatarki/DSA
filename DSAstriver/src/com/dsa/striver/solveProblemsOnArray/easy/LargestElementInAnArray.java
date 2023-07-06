package com.dsa.striver.solveProblemsOnArray.easy;

public class LargestElementInAnArray {

    public static void main(String[] args) {
        int[] ar = {5,3,6,8,9,12,53,22,66,22,81};
        System.out.println(findLargest(ar));

    }

    private static int findLargest(int[] ar) {
        int largest = 0;
        for (int i = 0; i < ar.length; i++) {
            largest = ar[0];
            if(ar[i] > largest){
                largest = ar[i];
            }
        }
        return largest;
    }


}
