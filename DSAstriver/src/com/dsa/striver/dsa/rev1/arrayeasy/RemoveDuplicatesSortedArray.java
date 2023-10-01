package com.dsa.striver.dsa.rev1;

import java.util.HashMap;
import java.util.HashSet;



/**
 * @author Irfan.Katarki on 02-08-2023
 * @project DontOpen
 */
public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] ar = {1,2,2,3,3,4,5,6,6,6,6};
        removeDuplicatesFrom(ar);
        int k = removess(ar);
        System.out.println("The k "+k);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
    }

    private static int removess(int[] ar) {
        HashSet < Integer > set = new HashSet < > ();
        for (int i = 0; i < ar.length; i++) {
            set.add(ar[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x: set) {
            ar[j++] = x;
        }
        return k;
    }

    private static int removeDuplicatesFrom(int[] ar) {
        HashSet < Integer > set = new HashSet < > ();
        for (int i = 0; i < ar.length; i++) {
            set.add(ar[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x: set) {
            ar[j++] = x;
        }
        return k;
    }
}
