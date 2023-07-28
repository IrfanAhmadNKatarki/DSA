package com.dsa.striver.recursion;


/**
 * @author Irfan.Katarki on 27-07-2023
 * @project DontOpen
 */
public class FibonacciNumber {

    public static void main(String[] args) {

            int a = 0;
            int b = 1;
            int n = 10;
            System.out.println(a);
            // Below function gives the above mentioned n fibonacci numbers
            fibonaccirecursion(a,b,n);
            // Below Gives the nth fibonacci numbers
            // Example of Multiple Recursion call
        System.out.println("Below is multiple Recursion call happening");
           System.out.println(fibonaccirecursions(n));
 }
    private static int fibonaccirecursions(int n) {

        if(n <= 1)
        return n;

        int last = fibonaccirecursions(n-1);
        int slast = fibonaccirecursions(n-2);
        return last + slast;
    }

    private static void fibonaccirecursion(int a, int b, int n) {
        if(n == 0){
            return;
        }
        System.out.println(b);
        fibonaccirecursion(b,b+a,n-1);

    }
}
