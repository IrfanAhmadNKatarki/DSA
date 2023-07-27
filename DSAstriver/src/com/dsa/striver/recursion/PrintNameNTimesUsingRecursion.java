package com.dsa.striver.recursion;

/**
 * @author Irfan.Katarki on 25-07-2023
 * @project DontOpen
 */
public class PrintNameNTimesUsingRecursion {
    public static void main(String[] args) {
        int n = 6;

        printNames(n);
        
    }

    private static void printNames(int n ) {
        if(n == 0){
            return;
        }

        System.out.println("Irfan");
        printNames(n-1);

    }
}
