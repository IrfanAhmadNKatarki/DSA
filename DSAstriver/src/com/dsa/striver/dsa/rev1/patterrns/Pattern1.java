package com.dsa.striver.dsa.rev1.patterrns;

public class Pattern1 {

    public static void main(String[] args) {
        int n = 5;
        pattern1(n);
    }

    private static void pattern1(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
