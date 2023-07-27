package com.dsa.striver.recursion;

/**
 * @author Irfan.Katarki on 25-07-2023
 * @project DontOpen
 */
public class Print1ToNUsingRecursion {

    public static void main(String[] args) {
        int n = 1;
        print1ToN(n);
    }

    private static void print1ToN(int n) {
        if(n == 6){
            System.out.println(n);
           return;
        }

        System.out.println(n);
        print1ToN(n+1);
    }

}
