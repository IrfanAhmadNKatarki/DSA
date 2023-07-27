package com.dsa.striver.patterns;

/**
 * @author Irfan.Katarki on 25-07-2023
 * @project DontOpen
 */

/**
 *  Input Format: N = 6
 * Result:
 * ************
 * *****  *****
 * ****    ****
 * ***      ***
 * **        **
 * *          *
 * *          *
 * **        **
 * ***      ***
 * ****    ****
 * *****  *****
 * ************
 *
 */
public class Pattern19 {

    public static void main(String[] args) {
       
        int n = 12;
        int nst = n;
        int nsp = 0;
        
        printStars(n,nst,nsp);
    }

    private static void printStars(int n, int nst, int nsp) {
        for (int i = 1; i <= n; i++) {
              for (int k = 1; k <= nst / 2; k++) {
                System.out.print("*");
            }
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= nst / 2; l++) {
                System.out.print("*");
            }
            System.out.println();

            if (i < n/2) {
                nst-=2;
                nsp+=2;
            } else if(i == n/2){
                continue;
            }

               else{ nst+=2;
                nsp-=2;
            }
        }

    }
}
