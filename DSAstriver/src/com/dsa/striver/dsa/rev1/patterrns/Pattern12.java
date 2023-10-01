package com.dsa.striver.dsa.rev1.patterrns;

public class Pattern12 {
    public static void main(String[] args) {
        int n = 5;
        int nsp = 2 * n - 2;
        int nst = 1;

        pattern12(n, nsp, nst);
    }

    private static void pattern12(int n, int nsp, int nst) {

        for (int i = 1; i <=  n; i++) {

            for (int j = 1; j <= nst; j++) {
                System.out.print(j+"");
            }

            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }

            for (int j = nst; j >= 1; j--) {
                System.out.print(j+"");
            }


            nst += 1;
            nsp-=2;

            System.out.println();

        }
    }
}
