package com.dsa.striver.solveProblemsOnArray.easy;

public class MoveallZerostotheendofthearrayOptimal1  {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 0, 0, 6, 7,0,9,0,8};
        for(int pri : arr) {
            System.out.print(pri + " ");
        }
        moveAllZeroToTheEnds(arr);
        System.out.println();
        for(int pri : arr) {
            System.out.print(pri + " ");
        }
    }

    private static void moveAllZeroToTheEnds(int[] arr) {

        int p = 0;
        int k = 1;
        while(k < arr.length) {
            if(arr[p] == 0 && arr[k]!=0){
                swapsss(arr,p,k);
                p--;
                k--;
            }
            else {
                p++;
                k++;
            }

        }

    }

    private static void swapsss(int[] arr,int p, int k) {
        int temp = arr[p];
        arr[p] = arr[k];
        arr[k] = temp;

    }
}
