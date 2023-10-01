package com.dsa.striver.dsa.rev1.arrayeasy2;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArrayOptimum2 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 5, 6};
        int[] b = {2, 3, 3, 4, 6, 6};
        System.out.println(sortedArray(a, b));

    }


    public static List<Integer> sortedArray(int[] a, int[] b) {

        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        while (i < a.length || j < b.length)
            if (a[i] <= b[j]) {
                if (k == 0 ) {
                    arr.add(a[i]);
                    i++;
                    k++;
                } else if (arr.get(k - 1) != arr.get(k)) {
                    arr.add(a[i]);
                    i++;
                    k++;
                }
            }else {
                    if (k == 0  ) {
                        arr.add(b[j]);
                        j++;
                        k++;
                    } else if (arr.get(j - 1) != arr.get(j)) {
                        arr.add(b[j]);
                        j++;
                        k++;
                    }
                }



        return arr;
    }
}

