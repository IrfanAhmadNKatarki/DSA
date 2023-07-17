package com.dsa.striver.solveProblemsOnArray.easy;

public class RightRotateAnArrayByDPlaceOptimal {

    public static void main(String[] args) {
    int[] arr =  {1,3,4,5,6,7,8};
    int d = 4;
    d = d % arr.length;
    for(int pri : arr){
        System.out.print(pri+" ");

    }
    int i = 0;
    int j = arr.length - 1;
    d = j - d;


    rotateByDPlaces(arr,i, d);
    rotateByDPlaces(arr,d+1,j);
    rotateByDPlaces(arr,i, j);

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
