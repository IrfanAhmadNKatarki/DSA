package com.dsa.striver.patterns;

/**
 * @author Irfan.Katarki on 24-07-2023
 * @project DontOpen
 */


/**
 *
 * Input Format: N = 6
 * Result:
 * 1          1
 * 12        21
 * 12       321
 * 1234    4321
 * 12345  54321
 * 123456654321
 *
 */
public class Pattern12{

    public static void main(String[] args) {
        int n = 6;

        int nst = 1;
        int nsp =2 * n - 2;
        printStars(n,nst,nsp);
    }

    private static void printStars(int n, int nst, int nsp) {

        for (int i = 1; i <= n; i++) {

             for(int j = 1; j <= nst; j++) {
                System.out.print(j);
              }

            for(int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }

            for(int j = nst; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
            nst++;nsp-=2;

        }

    }
}
