package com.dsa.striver.solveProblemsOnArray.easy;

public class LeftRotateAnArrayByOnePlace {

    public static void main(String[] args) {

        int[] arr =  {1,3,4,5,6,7};
        for(int pri : arr){
            System.out.print(pri+" ");

        }
        System.out.println();


        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
                arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = temp;

        for(int pri : arr){
            System.out.print(pri+" ");

        }
    }



}
