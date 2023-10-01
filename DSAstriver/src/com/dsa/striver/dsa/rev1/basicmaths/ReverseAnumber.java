package com.dsa.striver.dsa.rev1.basicmaths;

public class ReverseAnumber {
     public static void main(String[] args) {
         int n = 12345;
         System.out.println(reverse(n));
    }
    public static int reverse(int n) {
     int rev = 0;
     while (n != 0) {

         int rem = n % 10;
         rev = rev * 10 + rem;
         n = n / 10;
     }

     return rev;
    }

}
