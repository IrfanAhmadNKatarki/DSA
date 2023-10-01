package com.dsa.striver.dsa.rev1.arrayeasy;


import static com.dsa.striver.sorting.QuickSortPractice.swaps;

/**
 * @author Irfan.Katarki on 28-07-2023
 * @project DontOpen
 */
public class SelectionSortPractice1 {

    public static void main(String[] args) {
        int[] arr = {1,4,2,5,6,2,9,9,5};
        selectionSortPracticce(arr);
        for (int ar = 0; ar < arr.length; ar++) {
            System.out.print(arr[ar]+" ");
        }
    }
    // 1 2 4 5 6 2 9 9 5

    private static void selectionSortPracticce(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                    if(arr[j] < arr[index]) {
                            index = j;
                    }



            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

        }
        
    }
}
