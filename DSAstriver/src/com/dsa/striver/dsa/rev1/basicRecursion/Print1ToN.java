package com.dsa.striver.dsa.rev1.basicRecursion;

public class Print1ToN {
    public static void main(String[] args) {
        int n = 5;
        printSomethings(n);
    }

    private static void printSomethings(int n) {
        if(n==0){
            return;
        }

        printSomethings(n-1);
        System.out.println(n);
    }


}

