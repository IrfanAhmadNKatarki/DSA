package com.dsa.striver.dsa.rev1.basicRecursion;

public class FactorialOfNNumbers {

    public static void main(String[] args) {
        int n = 6;
        System.out.println(factorialOfNNumbers(n));

    }

    private static int factorialOfNNumbers(int n) {
        if(n == 1) return n;
        return n * factorialOfNNumbers(n-1);
    }


}
