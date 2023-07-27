package com.dsa.striver.patterns;

/**
 * @author Irfan.Katarki on 25-07-2023
 * @project DontOpen
 */

/**
 *
 * Input Format: N = 6
 * Result:
 * F
 * E F
 * D E F
 * C D E F
 * B C D E F
 * A B C D E F
 *
 */
public class Pattern18 {

    public static void main(String[] args){
        int n = 7;

        int nst = 1;




        printStars(n,nst);
    }

    private static void printStars(int n, int nst) {

        int x = n;
        int count = 0;
        char s = (char) ('A' + x - 1);
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(s+" ");
                s++;
            }
            s-=2+count;
            count++;
            System.out.println();
        }

    }
}
