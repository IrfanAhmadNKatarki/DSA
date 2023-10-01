package com.dsa.striver.dsa.rev1.basicRecursion;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        int n  = 1, sum = 0;
        sumOfFirstPara(n,sum);
        System.out.println(sumOf(n));
    }

    private static int sumOf(int n) {
        if(n>=5){
            return n;
        }
        return n + sumOf(n+1);
    }

    private static void sumOfFirstPara(int n, int sum) {
        if(n > 5){
            System.out.println(sum);
            return;
        }
        sum +=n;
        sumOfFirstPara(n+1, sum);

    }

}
