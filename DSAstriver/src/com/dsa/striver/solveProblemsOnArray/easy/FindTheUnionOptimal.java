package com.dsa.striver.solveProblemsOnArray.easy;

import java.util.ArrayList;

public class FindTheUnionOptimal {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};

        ArrayList<Integer> unionArray = findTheOptimal(arr1, arr2);
        System.out.println(unionArray);

    }


    private static ArrayList<Integer>findTheOptimal(int[] arr1, int[] arr2) {
        ArrayList<Integer> unionArray = new ArrayList<>();
        unionArray.size();
           int i = 0, j = 0, n1 = arr1.length, n2 = arr2.length,unionIndex = 0;
            while(i < n1 && j < n2){
                if(arr1[i] <= arr2[j] ){
                    if(i == 0 && unionArray.size() == 0) {
                        unionArray.add(arr1[i]);
                        unionIndex++;
                    }
                    else if(unionArray.get(unionIndex-1)!= arr1[i]){
                        unionArray.add(arr1[i]);
                        unionIndex++;
                    }
                    i++;

                }
                else{
                    if(arr2[j] < arr1[i] ){
                        if(j == 0 && unionArray.size() == 0 ){
                            unionArray.add(arr2[j]);
                            unionIndex++;
                        }
                        else if(unionArray.get(unionIndex-1)!= arr2[j]){
                            unionArray.add(arr2[j]);
                            unionIndex++;
                        }
                    j++;
                    }
                }
            }

            while(i < n1){
                unionArray.add(arr1[i]);
                i++;
            }
          while(j < n2){
            unionArray.add(arr2[j]);
            j++;
        }
            return unionArray;
    }
}
