package com.dsa.striver.dsa.rev1.patterrns;

public class Pattern10
{
 public static void main(String[] args) {
            int n = 5;
        int nsp =  n -1;
        int nst = 1;

        pattern10(n,nsp,nst);
    }
    private static void pattern10(int n, int nsp, int nst) {

        for (int i = 1; i <= 2 * n; i++) {

            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }

            if(i < n){
                nst+=1;
                nsp--;
            }
            else{
                nsp++;
                nst-=1;
            }
            System.out.println();

        }
    }
}
