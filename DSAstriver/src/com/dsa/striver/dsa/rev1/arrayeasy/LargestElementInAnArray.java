package com.dsa.striver.dsa.rev1;

/**
 * @author Irfan.Katarki on 31-07-2023
 * @project DontOpen
 */
public class LargestElementInAnArray {
    
    public static void main(String[] args) {
    int[] arr = {1,4,3,2,5,8,7,9};
        System.out.println(larg(arr));
    }

    private static int larg(int[] arr) {
        int lar = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > lar){
                lar = arr[i];
            }
        }
    return lar;
    }
}
