package com.dsa.striver.dsa.rev1.arrayeasy2;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] a = {1,2,0,3,0,0,5,6};
        System.out.println(Arrays.toString(a));
        moveZeros(a);
        System.out.println(Arrays.toString(a));
    }
    public static void moveZeros( int []a) {

            for (int i = 0; i < a.length - 1; i++) {
                if(a[i] == 0 && a[i + 1] != 0){
                    while(i >= 0){
                        if(a[i] == 0){
                            int temp = a[i + 1];
                            a[i + 1] = a[i];
                            a[i] = temp;
                            i--;
                        }
                        else{
                            break;
                        }
                    }
                }
            }

        }
    }


