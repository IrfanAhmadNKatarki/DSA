package com.dsa.striver.step1_4_Know_Basic_Maths;

import java.util.Scanner;

/**
 * @author Irfan.Katarki on 25-07-2023
 * @project DontOpen
 */
public class CheckIfANumberIsPrimeOrNot {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n =  scn.nextInt();
        System.out.println(primerOrNot(n));


    }

    private static boolean primerOrNot(int n ) {

        for (int i = 2; i*i <= n; i++) {

            if(n  % i == 0){
                return false;
            }

        }
        return true;
    }


}
