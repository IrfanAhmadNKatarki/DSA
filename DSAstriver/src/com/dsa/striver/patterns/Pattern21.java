package com.dsa.striver.patterns;

/**
 * @author Irfan.Katarki on 25-07-2023
 * @project DontOpen
 */

/**
 *  Input Format: N = 8
 * Result:   
 * ******
 * *    *
 * *    *
 * *    *
 * *    *
 * ******
 * 
 */
public class Pattern21 {

    public static void main(String[] args) {
        int n = 7;
        printStars(n);
    }

    private static void printStars(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n ; j++) {
                if(i == 1  || i == n){
                    System.out.print("*");
                }
                else if((i > 1 && i < n) && (j == 1 || j == n)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
