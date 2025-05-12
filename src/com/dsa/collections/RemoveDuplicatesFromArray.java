package com.dsa.collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        String[] names = {"Rahul","Virat","Rahul","Shubman",
        "Virat","Rohit"};
        Set<String> uniqueNames = new LinkedHashSet<>();
//        for (String name : names){
//            uniqueNames.add(name);
//        }
        uniqueNames.addAll(Arrays.asList(names));
        System.out.println("After removing duplicates:");
        System.out.println(uniqueNames);
        // Use a lambda expression to traverse
        // uniqueNames.forEach(str -> System.out.print(str + " "));
        uniqueNames.forEach(System.out::println);
        // This :: is used in the Stream API from Java version 8
    }
}
