package com.dsa.striver.dsa.rev1.basicmaths;

public class checkPrime {

    public static void main(String[] args) {
        int n = 96;
        System.out.println(checkIfPrime(n));
    }

    private static boolean checkIfPrime(int n) {

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
                }
            }
        return true;
    }
}
