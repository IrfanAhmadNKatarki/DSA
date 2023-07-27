package com.dsa.striver.step1_4_Know_Basic_Maths;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

/**
 * @author Irfan.Katarki on 25-07-2023
 * @project DontOpen
 */
public class CheckIfANumberIsArmstrongNumberOrNot {

    public static void main(String[] args) {

//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int n2 = n;
        ArmStrongOrNot();

    }

    private static void ArmStrongOrNot() {

        for (int i = 100; i < 1000; i++) {
            int i2 = i;
            int sum = 0;
             while(i2 > 0){
                int  rem = i2 % 10;
                i2 = i2/ 10;
                sum = rem * rem * rem + sum;
            }

            if(sum == i){
                System.out.println(sum);
            }


        }


    }


}
