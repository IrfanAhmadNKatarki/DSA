package com.dsa.striver.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSortPractice {

    public static void main(String[] args) {


        int[] arr = {1,4,3,2,9,7,5,8,6};

        for(int j: arr){
            System.out.print(j+" ");
        }
        int low = 0, high =  arr.length-1;
        mergeSortPracticising(arr,low,high);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp.get(i);
        }
        System.out.println();
        for(int j: arr){
            System.out.print(j+" ");
        }

    }

    private static void mergeSortPracticising(int[] arr, int low, int high) {
        int mid = (low + high) / 2;
       if(low == high){
           return;
       }

        mergeSortPracticising(arr,low,mid);

        mergeSortPracticising(arr,mid+1, high);
        finalsMerge(arr,low,mid,high);
    }

   static ArrayList<Integer> temp = new ArrayList<>();
    private static void finalsMerge(int[] arr, int low, int mid, int high) {

        int l = low;
        int m = mid + 1;
        while (l <= mid && m <= high )  {
            if(arr[l]<= arr[m]){
                temp.add(arr[l]);
                l++;
            }
            else{
                temp.add(arr[m]);
                m++;
            }
        }
            while (arr[l] <= arr[m] && l < mid) {
                temp.add(arr[l]);
                l++;
            }
            while (arr[m] < arr[l] && m < high) {
                temp.add(arr[m]);
                m++;
            }

        }


}
