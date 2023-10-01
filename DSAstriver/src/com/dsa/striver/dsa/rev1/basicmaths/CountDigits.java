package com.dsa.striver.dsa.rev1.basicmaths;

public class CountDigits{

    public static void main(String[] args) {
       int count = 82882820;
        System.out.println(funCountDigits(count));

    }

    private static int funCountDigits(int count) {
       int c = 0;
        while (count!=0){
            count = count/10;
            c++;
        }
        return c;
    }
}
