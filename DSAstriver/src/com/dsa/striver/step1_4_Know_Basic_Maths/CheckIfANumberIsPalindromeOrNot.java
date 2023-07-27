package com.dsa.striver.step1_4_Know_Basic_Maths;

import java.util.Scanner;

/**
 * @author Irfan.Katarki on 25-07-2023
 * @project DontOpen
 */
public class CheckIfANumberIsPalindromeOrNot {
    public static void main(String[] args)  {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(palindromeOrNot(n));
    }

    private static boolean palindromeOrNot(int n) {
       int sum = 0;
       int n2 = n;
        while(n > 0){

            int rem = n % 10;
            n = n / 10;
            sum = sum * 10 + rem;

        }

        if(sum == n2){
            return true;
        }
        return false;
    }


}
