package com.dsa.striver.recursion;

/**
 * @author Irfan.Katarki on 25-07-2023
 * @project DontOpen
 */
public class SumOfFirstNNaturalNumbers {

    public static void main(String[] args) {
        int n = 6;
        int sum = 0;
        print1ToN(n, 0);
        System.out.println(print1toNwithoutparam(n));
        System.out.println(print1toNwithoutparam(n));


    }

  private static int print1toNwithoutparam(int n) {



        if(n < 1){

            return 0;
        }


        return n+print1toNwithoutparam(n-1);
    }

    private static void print1ToN(int n, int sum) {
        if(n < 1){
            System.out.println(sum);
            return;
        }


        print1ToN(n-1, sum + n);

    }

}
