package com.dsa.striver.solveProblemsOnArray.easy;

/**
 * @author Irfan.Katarki on 23-07-2023
 * @project DontOpen
 */
public class LengthOfLongestSubArrayBetterUsingOptima {

    public static void main(String[] args) {
        int[] a = {4,1,1,1,-1,-1,1,1,1};
        int k = 4;
        System.out.println(" Final maxLen "+lengthOfLongest(a,k));

    }

    private static int lengthOfLongest(int[] a, int k) {

        int i = 0;
        int sum = 0;
        int maxLen = 0;
        for (int j = 0; j < a.length; j++) {
            sum+= a[j];
            if(sum == k){
                maxLen = Math.max(maxLen, j-i+1);
                System.out.println(" everytime "+maxLen);
                continue;
            }
            else if(sum > k){
                while(i <= j){

                    sum-=a[i];
                    i++;
                    if(sum == k){
                        maxLen = Math.max(maxLen, j-i+1);
                        System.out.println(" everytime "+maxLen);
                    }
                    else if(sum < k){
                        break;
                    }
                }


            }


        }


      return maxLen;
    }


}
