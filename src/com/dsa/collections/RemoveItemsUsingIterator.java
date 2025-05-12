package com.dsa.collections;
import java.util.ArrayList;
import java.util.Iterator;

public class RemoveItemsUsingIterator {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(11);
        numbers.add(21);
        numbers.add(10);
        numbers.add(15);
        numbers.add(0);
        numbers.add(9);
        numbers.add(6);
        // Use the Iterator to remove numbers < 10
        System.out.println("Before: " + numbers);
//        Iterator<Integer> it = numbers.iterator();
//        while (it.hasNext()){
//            Integer i = it.next();
//            if(i < 10){
//                it.remove();
//            }
//        }
        // Lambda Expressions -> Java 8 (Stream API)
        numbers.removeIf(n -> n > 10);
        System.out.println("After: " + numbers);
    }
}
