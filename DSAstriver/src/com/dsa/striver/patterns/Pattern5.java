package com.dsa.striver.patterns;

/**
 * @author Irfan.Katarki on 24-07-2023
 * @project DontOpen
 */
public class Pattern5 {

    public static void main(String[] args) {
        int n = 5;
        printStar(n);
    }

    private static void printStar(int n) {

        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
