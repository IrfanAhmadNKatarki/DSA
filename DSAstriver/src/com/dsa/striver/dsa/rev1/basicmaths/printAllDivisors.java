package com.dsa.striver.dsa.rev1.basicmaths;

public class printAllDivisors {

    public static void main(String[] args) {
        int n = 36;
        printDiv(n);
    }

    private static void printDiv(int n) {

        for (int i = 1; i* i <= n; i++) {
            if (n % i == 0) {
                System.out.print(" "+i+" ");
                if(n/i!=i) {
                    System.out.print(" " + (n / i)+" ");
                }
            }
        }

    }
}
