package com.dsa.collections;
import java.util.Hashtable;
import java.util.Map;
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106,"Shree");
        ht.put(117,"Nitish");
        ht.put(128,"Rama");
        ht.put(102,"Monika");
        ht.put(99,"Saraswati");
        ht.put(100,"Pooja");
        for (Map.Entry kv : ht.entrySet()){
            System.out.println(kv.getKey() + " " +
                    kv.getValue());
        }
    }
}
