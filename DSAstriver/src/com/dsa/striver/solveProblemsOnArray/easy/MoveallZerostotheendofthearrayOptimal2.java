package com.dsa.striver.solveProblemsOnArray.easy;

public class MoveallZerostotheendofthearrayOptimal2 {

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


        int k = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0  ){
                k = i;
                break;
            }
        }

        if(k == -1) return;

        for (int j = k+1; j < arr.length; j++) {
              if(arr[j] != 0){
                    swapsss(arr,j,k);
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
