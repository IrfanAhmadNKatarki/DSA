package com.dsa.striver.patterns;

/**
 * @author Irfan.Katarki on 24-07-2023
 * @project DontOpen
 */

/**
 *
 * Input Format: N = 6
 * Result:
 *      *
 *      **
 *      ***
 *      ****
 *      *****
 *      ******
 *      *****
 *      ****
 *      ***
 *      **
 */
public class Pattern10 {
    public static void main(String[] args){
        int n = 7;
        int nst = 1;
        int nsp = n - 1;
        printStar(n,nsp,nst);
    }

    private static void printStar(int n, int nsp, int nst) {
        for (int i = 1; i < 2 * n; i++) {

            for (int st = 1; st <= nst; st++) {
                System.out.print("*");
            }

            System.out.println();

            if(i < n ){
                nst+=1;
            }
           else{
                nst-=1;
           }

        }
    }


}
