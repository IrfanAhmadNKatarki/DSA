package com.dsa.striver.dsa.rev1.patterrns;

public class Pattern2 {

    public static void main(String[] args) {
        int n = 5;
        pattern2(n);
    }
    private static void pattern2(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" "+j);
            }
            System.out.println();

        }
    }
}
