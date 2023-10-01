package com.dsa.striver.dsa.rev1.arrayeasy2;

import java.util.Arrays;

public class MoveZeroesToEndStriver {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,0,5,0,6,0,0,7};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(moveZeros(a)));
    }
    public static int[] moveZeros(int []a) {
        int j = -1;
        for (int i = 0; i < a.length ; i++) {
            if(a[i] == 0){
                j = i;
                break;
            }
        }

        if(j==0){
            return a;
        }

        for (int i = j + 1; i < a.length; i++) {
            if(a[i]!=0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        return a;
    }
}