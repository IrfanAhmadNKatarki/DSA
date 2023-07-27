package com.dsa.striver.patterns;

/**
 * @author Irfan.Katarki on 24-07-2023
 * @project DontOpen
 */


/**
 * Input Format: N = 6
 * Result:
 * 1
 * 01
 * 101
 * 0101
 * 10101
 * 010101
 *
 *
 */
public class Pattern11 {

    public static void main(String[] args) {
        int n = 5;

        int nst = 1;
        printStars(n,nst);
    }

    private static void printStars(int n, int nst) {
        int start = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 1){
                start = 1;
            }
            else{
                start = 0;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                start =  1 -start;
            }

            System.out.println();

        }

    }
}
