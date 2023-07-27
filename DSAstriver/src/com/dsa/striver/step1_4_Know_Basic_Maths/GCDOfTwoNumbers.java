package com.dsa.striver.step1_4_Know_Basic_Maths;

/**
 * @author Irfan.Katarki on 25-07-2023
 * @project DontOpen
 */
public class GCDOfTwoNumbers {

    public static void main(String[] args) {
        int n1 = 21;
        int n2 = 28;
        System.out.println(findGcd(n1, n2));

    }

    private static int findGcd(int n1, int n2) {

        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;

        }
        return n2;
    }
}
