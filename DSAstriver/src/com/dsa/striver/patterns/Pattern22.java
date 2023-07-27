package com.dsa.striver.patterns;

/**
 * @author Irfan.Katarki on 25-07-2023
 * @project DontOpen
 */

/**
 *   Input Format: N = 3
 * Result:
     *  3 3 3 3 3
     *  3 2 2 2 3
     *  3 2 1 2 3
     *  3 2 2 2 3
     *  3 3 3 3 3
 *
 */

/**
 *    Input Format: N = 6
 * Result:
 * 6 6 6 6 6 6 6 6 6 6 6
 * 6 5 5 5 5 5 5 5 5 5 6
 * 6 5 4 4 4 4 4 4 4 5 6
 * 6 5 4 3 3 3 3 3 4 5 6
 * 6 5 4 3 2 2 2 3 4 5 6
 * 6 5 4 3 2 1 2 3 4 5 6
 * 6 5 4 3 2 2 2 3 4 5 6
 * 6 5 4 3 3 3 3 3 4 5 6
 * 6 5 4 4 4 4 4 4 4 5 6
 * 6 5 5 5 5 5 5 5 5 5 6
 * 6 6 6 6 6 6 6 6 6 6 6
 *
 */
public class Pattern22 {


        public static void main(String[] args){
        int n = 7;
        printStars(n);
    }

        private static void printStars (int n){
            int x = n;
        for (int i = 1; i < 2 * n; i++) {
            for (int j = 1; j < 2 *  n; j++) {
                if (i == 1 || i == 2 * n - 1) {
                    System.out.print(n);
                } else if ((i > 1 && i < 2 * n - 1) && (j == 1 || j == 2 * n - 1)) {
                    System.out.print(n);
                } else {
                    System.out.print(x);
               }
            }
            if(i < n){
                x--;
            }
            else{
                x++;
            }
            System.out.println();
        }
    }
}


