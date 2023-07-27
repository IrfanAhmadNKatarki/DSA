package com.dsa.striver.patterns;

/**
 * @author Irfan.Katarki on 24-07-2023
 * @project DontOpen
 */
public class Pattern15 {
    public static void main(String[] args) {


        int n = 6;

        int nst = 1;

        printStars(n,nst);
    }

    private static void printStars(int n, int nst) {

        int count = 1;

        for (int i = 1; i <= n; i++) {
            char s = 'A';
            for(int j = n; j >= i; j--) {
                System.out.print(s+" ");
                s++;
            }

            System.out.println();


        }

    }
}


