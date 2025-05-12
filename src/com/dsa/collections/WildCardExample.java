package com.dsa.collections;
import java.util.ArrayList;
import java.util.List;
public class WildCardExample {
    public static void printListData(List<?> list){
        for (Object obj : list){
            System.out.print(obj + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(12);
        integerList.add(14);
        integerList.add(21);
        printListData(integerList);
        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");
        stringList.add("SQL");
        printListData(stringList);
    }
}
