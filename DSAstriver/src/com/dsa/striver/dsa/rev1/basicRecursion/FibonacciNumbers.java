package com.dsa.striver.dsa.rev1.basicRecursion;

public class FibonacciNumbers {

    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print(a+" "+b+" ");
        fibonacciNumbers(a,b);
    }

    private static void fibonacciNumbers(int a, int b) {
        int sum = a + b;
        if (sum > 100) {
            return;
        }
        System.out.print(sum + " ");
        a = b;
        b = sum;
        fibonacciNumbers(a, b);


    }
}
