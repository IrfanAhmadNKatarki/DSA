package com.dsa.striver.dsa.rev1.arrayeasy;

import java.util.HashSet;

/**
 * @author Irfan.Katarki on 02-08-2023
 * @project DontOpen
 */
public class RemoveDuplicatesSortedArrayoptimal {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5, 5, 5, 6, 6, 6, 6};
        int k = removess(ar);
        System.out.println("The k " + k);
        for (int i = 0; i < k; i++) {
            System.out.print(ar[i] + " ");
        }
    }

    private static int removess(int[] ar) {
        int k = 0;
        for (int i = 1; i < ar.length; i++) {
            if (ar[k] != ar[i]) {
                k++;
                ar[k] = ar[i];
            }


        }

        return k + 1;

    }
}
