package com.dsa.striver.solveProblemsOnArray.easy;

public class LinearSearch {


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int findNum = 5;
        System.out.println(linearSearchInTheArray(arr,findNum));


    }

    private static int linearSearchInTheArray(int[] arr, int findNum) {

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == findNum){
                return i;
            }

        }
        return -1;
        
    }


}
