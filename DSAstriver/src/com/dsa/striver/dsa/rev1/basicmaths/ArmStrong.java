package com.dsa.striver.dsa.rev1.basicmaths;

public class ArmStrong {

    public static void main(String[] args) {
        int n = 123;
        System.out.println(checkIfArmStrong(n));
    }

    private static boolean checkIfArmStrong(int n) {
        int n2  = n;
        int sum = 0;
        while (n!=0){
            int rem = n % 10;

            sum = rem * rem * rem + sum;

            n = n / 10;
        }
        if(n2 == sum){
            return true;
        }
        return false;
    }


}
