package com.dsa.striver.Hashing;

import javax.crypto.spec.PSource;
import java.util.*;
public class HashingInJavaOneShotDSShradha {


    public static void main(String[] args) {


        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Irfan",100);
        hm.put("Wahran",110);
        hm.put("Rendall",120);
        hm.put("Wiki",130);
        hm.put("No",140);
        hm.put("Ve",150);

        System.out.println(hm);

        Set<Map.Entry<String, Integer>> key = hm.entrySet();
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            String keys = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }



    }


}
