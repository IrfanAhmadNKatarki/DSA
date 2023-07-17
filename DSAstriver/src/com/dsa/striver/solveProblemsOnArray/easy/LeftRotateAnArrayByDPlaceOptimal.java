package com.dsa.striver.solveProblemsOnArray.easy;

public class LeftRotateAnArrayByDPlaceOptimal {
    public static void main(String[] args) {
        int[] arr =  {1,3,4,5,6,7,8};
        int d = 3;
        d = d % arr.length;
        for(int pri : arr){
            System.out.print(pri+" ");

        }
        int i = 0;

        rotateByDPlaces(arr,i, d-1);
        rotateByDPlaces(arr,d, arr.length-1);
        rotateByDPlaces(arr,i, arr.length - 1);

        System.out.println();
        for(int pri : arr){
            System.out.print(pri+" ");

        }
    }

    private static void rotateByDPlaces(int[] arr, int s, int d) {
        while(s <= d){
            int temp = arr[s];
            arr[s] = arr[d];
            arr[d] = temp;
            s++;
            d--;
        }

    }
}
