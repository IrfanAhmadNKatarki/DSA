package com.dsa.striver.step1_4_Know_Basic_Maths;

import java.util.Scanner;

/**
 * @author Irfan.Katarki on 25-07-2023
 * @project DontOpen
 */
public class CountDigitsInANumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(countDigits(n));

    }

    private static int countDigits(int n) {
        int count = 0;
        while(n > 0){
            n = n / 10;
            count++;
        }

        return count;
    }
}
