package com.oops.polymorphism.overloading;
public class Addition {
    static void add(int a, int b){
        System.out.println(a+b);
    }
    static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    static void add(int a, float b){
        System.out.println(a+b);
    }
}
class Overloading {
    public static void main(String[] args) {
        Addition.add(1,2);
        Addition.add(1,2,3);
        Addition.add(1,2.5f);
    }
}
