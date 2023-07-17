package com.dsa.striver.solveProblemsOnArray.easy;
// Brute force --- If u are here, GO to optimal solution the class name is  LeftRotateAnArrayByDPlaceOptimal
public class LeftRotateAnArrayByDPlace {


    public static void main(String[] args) {
        int[] arr =  {1,3,4,5,6,7,8};
        int d = 5;
        d = d % arr.length;
        for(int pri : arr){
            System.out.print(pri+" ");

        }
        rotateByDPlaces(arr, d);
        System.out.println();
        for(int pri : arr){
            System.out.print(pri+" ");

        }
    }

    private static void rotateByDPlaces(int[] arr, int d) {
        int temp[] = new int[d];
        // storing in temp
        for (int i = 0; i < d; i++){
            temp[i] = arr[i];
        }

        // shift the elements

        for (int i = d; i < arr.length ; i++) {
            arr[i-d] = arr[i];
        }

        // store back from temp to arr

        for (int i = d + 1; i < arr.length; i++) {
            arr[i] = temp[i-(d+1)];
        }

    }
}
