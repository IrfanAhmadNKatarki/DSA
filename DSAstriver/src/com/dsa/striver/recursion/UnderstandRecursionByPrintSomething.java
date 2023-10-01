package com.dsa.striver.recursion;

import java.sql.SQLOutput;

/**
 * @author Irfan.Katarki on 25-07-2023
 * @project DontOpen
 */

public class UnderstandRecursionByPrintSomething {
    public static void main(String[] args) {
       int n = 5;
        printSomething(n);
    }

    private static void printSomething(int n) {
        if(n == 1){
            System.out.println(n);
            return;
        }
        printSomething(n-1);
        System.out.println(n);


    }
}
