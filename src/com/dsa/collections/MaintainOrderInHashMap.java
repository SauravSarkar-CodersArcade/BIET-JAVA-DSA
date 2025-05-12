package com.dsa.collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class MaintainOrderInHashMap {
    public static void main(String[] args) {
        HashMap<String,String> hm1 = new HashMap<>();
        hm1.put("03","aaaa");
        hm1.put("01","xxxx");
        hm1.put("04","bbbb");
        hm1.put("02","cccc");
        System.out.println("Iterating over HashMap:");
        for (Map.Entry<String,String> entry : hm1.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        HashMap<String,String> hm2 = new LinkedHashMap<>();
        hm2.put("03","aaaa");
        hm2.put("01","xxxx");
        hm2.put("04","bbbb");
        hm2.put("02","cccc");
        System.out.println("Iterating over LinkedHashMap:");
        for (Map.Entry<String,String> entry : hm2.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
