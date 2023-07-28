package com.dsa.striver.recursion;

/**
 * @author Irfan.Katarki on 27-07-2023
 * @project DontOpen
 */
public class GivenStringPalindromeOrNot {

    public static void main(String[] args) {
        int i = 0;
        String palindromeString = "MADAMS";

        System.out.println(checkIfStringIsPalindrome(palindromeString,i));

    }

    private static boolean checkIfStringIsPalindrome(String palindromeString, int i) {
            if(i >= palindromeString.length()/2){
                    return true;
            }

            if(palindromeString.charAt(i) != palindromeString.charAt(palindromeString.length() - 1 - i)){
               return false;
            }



        return checkIfStringIsPalindrome(palindromeString,i+1);
    }
}
