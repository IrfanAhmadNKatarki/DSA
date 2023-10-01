package com.dsa.striver.dsa.rev1.basicmaths;

import java.util.Scanner;

public class GCDorHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = gcd(a, b);
        System.out.println(gcd);
        System.out.println((a*b)/gcd);
    }

    private static int gcd(int a, int b) {
        while(a % b != 0){
            int rem = a % b;
            a = b;
            b = rem;

        }

        return b;

    }
}
