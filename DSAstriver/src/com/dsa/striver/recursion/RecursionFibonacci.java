package com.dsa.striver.recursion;

import java.util.Scanner;

public class RecursionFibonacci {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(Recursion(n));
    }
//   0 1 1 2  3 5   8  13  21  34   55
//   0 1 2 3  4 5   6  7   8     9   10  11
    private static int Recursion(int n) {
        if(n < 2){
            return n;
        }
        int last = Recursion(n - 1);
        int sLast = Recursion(n - 2);
        return last + sLast;
    }

}
