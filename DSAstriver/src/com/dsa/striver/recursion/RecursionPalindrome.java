package com.dsa.striver.recursion;

import java.util.Scanner;

public class RecursionPalindrome {

    public static void main(String[] args) {
        Scanner scn  =  new Scanner(System.in);

        String palindrome = scn.next();
        System.out.println(palindrome);
        int i = 0;

        Boolean isPalindromeOrNot = palindromeRecursion(palindrome, i);
        System.out.println(isPalindromeOrNot);

    }

    private static Boolean palindromeRecursion(String palindrome, int i) {

            if(i > palindrome.length()/2){
                return true;
            }

            if(palindrome.charAt(i)!=palindrome.charAt(palindrome.length() - i - 1)){
                System.out.println(palindrome.charAt(i)+" "+palindrome.charAt(palindrome.length() - i -1));
                return false;
            }
            i++;
        return  palindromeRecursion(palindrome, i);


    }
}
