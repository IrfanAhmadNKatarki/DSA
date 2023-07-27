package com.dsa.striver.step1_4_Know_Basic_Maths;

import java.util.Scanner;

/**
 * @author Irfan.Katarki on 25-07-2023
 * @project DontOpen
 */
public class PrintAllDivisors {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 36;
        printAll(n);
    }

    private static void printAll(int n) {

        for (int i = 1; i* i <= n; i++) {
                if(n % i == 0){
                    System.out.print(i+" ");
                    if(i != n/i) {
                        System.out.print(n / i + " ");
                    }
                    }

        }

    }

}
