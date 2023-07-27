package com.dsa.striver.patterns;

/**
 * @author Irfan.Katarki on 24-07-2023
 * @project DontOpen
 */


/**
 *   Input Format: N = 6
 * Result:
 *      A
 *     ABA
 *    ABCBA
 *   ABCDCBA
 *  ABCDEDCBA
 * ABCDEFEDCBA
 *
 *
 */
public class Pattern17 {
    public static void main(String[] args) {


        int n = 6;

        int nst = 1;

        int nsp = n - 1;

        printStars(n,nst, nsp);
    }

    private static void printStars(int n, int nst, int nsp) {



        for (int i = 1; i <= n; i++) {
            char s = 'A';
            for(int j = 1; j <= nsp; j++ ){
                System.out.print(" ");
            }
            for(int j = 1; j <= nst; j++ ){
               if(j < i){
                   System.out.print(s);
                   s++;
               }
               else{

                   System.out.print(s);
                   s--;
               }
            }
            nsp-=1;
            nst+=2;
            System.out.println();
        }

    }
}


