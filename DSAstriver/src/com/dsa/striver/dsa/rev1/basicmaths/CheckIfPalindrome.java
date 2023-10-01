package com.dsa.striver.dsa.rev1.basicmaths;

public class CheckIfPalindrome {
    public static void main(String[] args) {
        int n = 12321;
        System.out.println(reverse(n));
       if( n == reverse(n) ){
           System.out.println(true);
       }else{
           System.out.println(false);
       }
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
