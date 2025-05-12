package com.dsa.collections;
import java.util.ArrayList;
import java.util.Collections;
public class SortAnArrayListOfIntegers {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(141);
        arrayList.add(131);
        arrayList.add(121);
        arrayList.add(11);
        arrayList.add(101);
        Collections.sort(arrayList); // Ascending
        System.out.println("Sorted: " + arrayList);
        Collections.reverse(arrayList); // Descending
        System.out.println("Reversed: " + arrayList);
    }
}
