package com.dsa.striver.dsa.rev1.arrayeasy2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

// Brute Force :: :: :: :: :: :: :: : :: : : : : : : :
public class UnionOfTwoSortedArrayOptimized {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,4,5};
        int[] b = {2,3,4,5,5,6,6,7};
        System.out.println(" -- ");
        System.out.println(sortedArray(a,b));
    }
    public static List< Integer > sortedArray(int []a, int []b) {
        HashSet<Integer> temp = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            temp.add(a[i]);
        }
        for (int j = 0; j < b.length; j++) {
            temp.add(b[j]);
        }
//        List<Integer> result = new ArrayList<>(temp); // Convert HashSet to ArrayList
        List<Integer> result = new ArrayList<>();
        int j = 0;
        for (int i:temp) {
               result.add(i);
        }

        return result;
    }

}
