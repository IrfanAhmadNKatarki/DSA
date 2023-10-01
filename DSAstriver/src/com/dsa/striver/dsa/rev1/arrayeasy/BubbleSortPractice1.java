package com.dsa.striver.dsa.rev1.arrayeasy;

/**
 * @author Irfan.Katarki on 29-07-2023
 * @project DontOpen
 */
public class BubbleSortPractice1 {

    public static void main(String[] args) {
        int[] arr = {1,4,3,2,4,6,7,8,9};


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubbleSortPractice(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    private static void bubbleSortPractice(int[] arr) {

        for (int i = arr.length - 1 ; i >= 1; i--) {
                int didSwap = 0;
            for (int j = 0; j < i - 1; j++) {
                    if(arr[j] > arr[j + 1]){
                            swapBubbleSort(arr,j,j+1);
                            didSwap = 1;
                    }
            }
            if(didSwap == 0){
                break;
            }
            
        }

    }

    private static void swapBubbleSort(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}
