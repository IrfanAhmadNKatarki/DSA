package com.dsa.striver.dsa.rev1.basicRecursion;

import java.util.Locale;

public class StringIsPalindrome {

    public static void main(String[] args) {
        String palindrome = "KallaS";
        //Brute Force
//        System.out.println(isPalindrome(palindrome));
        //Using Recursion
        int i = 0;
        int j = palindrome.length() - 1;
        System.out.println(is2Palindrome(palindrome,i,j));
    }

    private static boolean is2Palindrome(String palindrome, int i, int j) {
       if (i >= j){
           return true;
       }
       if(palindrome.charAt(i) == palindrome.charAt(j)){
           return is2Palindrome(palindrome,i+1,j-1);
       }
       return false;
    }

    private static boolean isPalindrome(String palindrome) {
        for (int i = 0, j = palindrome.length() - 1; i < j; i++, j--) {
            if (palindrome.charAt(i)!= palindrome.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
