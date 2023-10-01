package com.dsa.striver.dsa.rev1.patterrns;

public class Pattern7 {

    public static void main(String[] args) {
        int n = 5;
        int nsp =  n-1;
        int nst = 1;

        pattern5(n,nsp,nst);
    }
    private static void pattern5(int n, int nsp, int nst) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            nst+=2;
            nsp--;
            System.out.println();

        }
    }
}
