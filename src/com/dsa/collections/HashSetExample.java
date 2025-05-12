package com.dsa.collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);
        numbers.add(1);
        numbers.add(4);
        numbers.add(1);
        numbers.add(1);
        numbers.add(3);
        System.out.println(numbers);
        HashSet<String> words = new LinkedHashSet<>();
        words.add("Saurav");
        words.add("Nirmal");
        words.add("Saurav");
        words.add("Anup");
        words.add("Saurav");
        words.add("Vikrant");
        System.out.println(words);
    }
}
