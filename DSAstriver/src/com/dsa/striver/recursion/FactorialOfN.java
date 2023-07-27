package com.dsa.striver.recursion;

/**
 * @author Irfan.Katarki on 27-07-2023
 * @project DontOpen
 */
public class FactorialOfN{
        public static void main(String[] args) {
            int n = 5;
            int sum = 0;
            System.out.println(factorialwithoutparam(n));
            System.out.println("WithOut Param");
            factorialwithparam(n,1);



        }

    private static void factorialwithparam(int n, int factSum) {
            if( n < 1){
                System.out.println(factSum);
                    return;
            }
        factorialwithparam(n-1,n*factSum);


    }

    private static int factorialwithoutparam(int n) {



            if(n == 1){

                return 1;
            }


            return n*factorialwithoutparam(n-1);
        }

}
