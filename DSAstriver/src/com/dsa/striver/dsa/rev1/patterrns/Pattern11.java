package com.dsa.striver.dsa.rev1.patterrns;

public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        int nsp = n - 1;
        int nst = 1;

        pattern11(n, nsp, nst);
    }

    private static void pattern11(int n, int nsp, int nst) {

        for (int i = 1; i <=  n; i++) {

            for (int j = 1; j <= nst; j++) {
                if((i + j) % 2 == 0) {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
                nst += 1;
                nsp--;

            System.out.println();

        }
    }
}
