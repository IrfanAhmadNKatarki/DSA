package com.dsa.striver.patterns;

/**
 * @author Irfan.Katarki on 24-07-2023
 * @project DontOpen
 */
public class Pattern4 {

    public static void main(String[] args) {
        int n = 5;
        printSquare(n);
    }


    static void printSquare(int n) {

        for(int i = 1;  i <= n; i++){

            for(int j = 1; j <= i; j++){

                System.out.print(i);
            }
            System.out.println();

        }

    }

}