package com.dsa.striver.sorting;

import java.util.ArrayList;

public class MergeSort {

    public static void main(String[] args) {

//        int[] arr = {86,54,33,22,78,90,521};
        int[] arr = {16,14,18,10,19,100,5};
//        int[] arr = {1,2,3,4,5,6,7};
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int low = 0, high = arr.length - 1;
        mergeSort(arr,low,high);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }


    }

    private static void mergeSort(int[] arr, int low , int high) {
        if(low == high){
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        finalMerge(arr,low,mid,high);
    }

    private static void finalMerge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> tempArr = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while(left <= mid && right  <= high){
            if(arr[left] <= arr[right] ){
                tempArr.add(arr[left]);
                left++;
            }
            else{
                tempArr.add(arr[right]);
                right++;
            }

        }
        while(left<=mid){
            tempArr.add(arr[left]);
            left++;
        }
        while(right<=high){
            tempArr.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = tempArr.get(i - low);

        }

    }


}
