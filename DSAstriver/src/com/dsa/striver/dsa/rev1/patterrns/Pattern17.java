package com.dsa.striver.dsa.rev1.patterrns;

public class Pattern17 {

    public static void main(String[] args) {
        int n  = 5;
        System.out.println(n);
        int nsp = n - 1;
        int nst = 1;

        pattern17(n, nsp ,nst);
    }

    private static void pattern17(int n, int nsp, int nst) {

        for (int i = 1; i <= n; i++) {
            char c = 'A';
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= nst; j++) {
                if(j <= nst / 2){
                    System.out.print(c);
                    c++;
                }
                else{
                    System.out.print(c);
                    c--;
                }

            }
            System.out.println();
            nsp--;
            nst+=2;
        }

    }
}
