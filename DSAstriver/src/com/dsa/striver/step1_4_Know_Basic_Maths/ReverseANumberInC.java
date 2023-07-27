package com.dsa.striver.step1_4_Know_Basic_Maths;

import java.util.Scanner;

/**
 * @author Irfan.Katarki on 25-07-2023
 * @project DontOpen
 */
public class ReverseANumberInC {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(reverseNumber(n));
    }

    private static int reverseNumber(int n) {
       int sum = 0;
        while(n > 0){

           int rem = n % 10;
          n = n / 10;
          sum = sum * 10 + rem;

       }
        return sum;
    }
}
