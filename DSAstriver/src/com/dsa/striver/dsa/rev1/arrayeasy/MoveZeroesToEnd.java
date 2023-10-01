package com.dsa.striver.dsa.rev1;

/**
 * @author Irfan.Katarki on 07-08-2023
 * @project DontOpen
 */
public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,0,4,0,5,0};
        moveZeroes(arr);
        for (int i:
             arr) {

            System.out.println(i);
        }
        
    }

    private static void moveZeroes(int[] arr) {
        int j = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == 0 && arr[j]!=0){
                swap(arr,i,j);

                j++;

            } else if (arr[i] ==0 && arr[j] ==0 && j < arr.length) {
                j++;
            } else{
               j++;

            }
        }
        
        
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
