package com.dsa.striver.solveProblemsOnArray.easy;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6,7,8,8,9,9,50,50,50,23};
        Boolean checkArrayIsSortedOrNot = CheckArrayIsSortedOrNotFucntion(arr);
        System.out.println("Array is Sorted "+checkArrayIsSortedOrNot);
    }

    private static Boolean CheckArrayIsSortedOrNotFucntion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>=arr[i-1]){

            }
            else{
                return false;
            }
        }
        return true;
    }
}
