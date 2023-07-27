package com.dsa.striver.recursion;

/**
 * @author Irfan.Katarki on 25-07-2023
 * @project DontOpen
 */
public class PrintNTo1UsingRecursion {

    public static void main(String[] args) {
        int n = 1;
        print1ToN(n);
    }

    private static void print1ToN(int n) {
        if(n == 6){
            System.out.println(n);
            return;
        }


        print1ToN(n+1);
        System.out.println(n);
    }

}
