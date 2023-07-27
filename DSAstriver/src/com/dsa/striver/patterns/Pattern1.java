package com.dsa.striver.patterns;

/**
 * @author Irfan.Katarki on 24-07-2023
 * @project DontOpen
 */
public class Pattern1 {

    public static void main(String[] args) {
        int n = 5;
        printSquare(n);
    }


    static void printSquare(int n) {

        for(int i = 0;  i < n; i++){

            for(int j = 0; j < n; j++){

                System.out.print("* ");
            }
            System.out.println();

        }

    }

}