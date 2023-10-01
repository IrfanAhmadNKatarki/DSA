package com.dsa.striver.dsa.rev1.basicRecursion;

public class PrintNto1 {
    public static void main(String[] args) {
        int n = 5;
        printSomethings(n);
    }

    private static void printSomethings(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printSomethings(n-1);

    }


}

