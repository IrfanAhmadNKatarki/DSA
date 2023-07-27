package com.dsa.striver.patterns;

/**
 * @author Irfan.Katarki on 24-07-2023
 * @project DontOpen
 */
public class Pattern8 {

    public static void main(String[] args) {
        int n = 5;
        int nst = 2 * n -1;
        int nsp = 0;
        printStar(n,nsp,nst);
    }

    private static void printStar(int n, int nsp, int nst) {
        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= nsp ; sp++) {
                System.out.print(" ");
            }
            for (int st = 1; st <= nst; st++) {
                System.out.print("*");
            }
            System.out.println();
            nst-=2;
            nsp+=1;
        }
    }


}
