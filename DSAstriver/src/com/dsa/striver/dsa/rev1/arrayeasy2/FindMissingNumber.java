package com.dsa.striver.dsa.rev1.arrayeasy2;

import java.util.HashMap;
import java.util.Map;

public class FindMissingNumber {
    // Using Map

    public static void main(String[] args) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int[] arr = {1,2,3,3,2,1,4};
        for (int i = 0; i < arr.length; i++) {
            int value = mpp.getOrDefault(arr[i],0);
            mpp.put(arr[i],value+1);
        }
        for (Map.Entry<Integer,Integer> it:
             mpp.entrySet()) {
            if(it.getValue() == 1){
                System.out.println(it.getKey());
            }
        }

    }

}
