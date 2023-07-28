package com.dsa.striver.step1_4_Know_Basic_Maths;

/**
 * @author Irfan.Katarki on 27-07-2023
 * @project DontOpen
 */
public class FibonacciNumbers {

    public static void main(String[] args) {
        System.out.println("Fibonacci numbers");
        int n = 10;
        fibonacci(n);
        fibonacciUsingForLoop(n);
  }

    private static void fibonacciUsingForLoop(int n) {
        if (n == 0) {
            System.out.println(0);
        } else {
            int fib[] = new int[n + 1];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i <= n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            System.out.println("The Fibonacci Series up to " + n + "th term:");
            for (int i = 0; i <= n; i++) {
                System.out.print(fib[i] + " ");
            }
        }
    }

    private static void fibonacci(int n) {
        int a = 0;
        int b = 1;
        /**
         *  0 based indexing
         */

        System.out.println(a);
        System.out.println(b);
        while(n>=2){
            n--;
            int sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum);
        }
 }


}
