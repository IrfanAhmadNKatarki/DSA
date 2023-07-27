package com.dsa.striver.patterns;

/**
 * @author Irfan.Katarki on 25-07-2023
 * @project DontOpen
 */

import javax.swing.*;

/**
 *
 * Input Format: N = 6
 * Result:
 * *          *
 * **        **
 * ***      ***
 * ****    ****
 * *****  *****
 * ************
 * *****  *****
 * ****    ****
 * ***      ***
 * **        **
 * *          *
 *
 */
public class Pattern20 {

    public static void main(String[] args) {
        int n = 6;
        int loop = 2 * n - 1;
        int nst = 1;
        int nsp = 2 * n  - 2;

        printStars(n,loop,nst,nsp);
    }

    private static void printStars(int n, int loop, int nst, int nsp) {
            for (int i = 1; i <= loop; i++) {

                for (int j = 1; j <= nst; j++) {
                    System.out.print("*");
                }
                for (int j = nsp; j >= 1; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= nst; j++) {
                    System.out.print("*");
                }
                System.out.println();
                if(i <= loop/2 ){
                    nst+=1;
                    nsp-=2;
                }
                else{
                    nst-=1;
                    nsp+=2;
                }


        }
    }


}
