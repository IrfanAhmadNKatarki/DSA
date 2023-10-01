package com.dsa.striver.dsa.rev1.basicRecursion;


public class PrintNameNTimes {
    public static void main(String[] args) {
        int n = 5;
        printSomethings(n);
    }

    private static void printSomethings(int n) {
        if(n==0){
            return;
        }
        System.out.println("Ahmad");
        printSomethings(n-1);
    }


}
