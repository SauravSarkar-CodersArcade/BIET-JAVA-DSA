package com.basics;

public class MethodsInJava {
    void add(int a, int b){
        System.out.println(a+b);
    }
    public void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void addition(int a, int b){
        System.out.println(a+b);
    }
    private static int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        char[] letters = {'P','r','a','f','f','u','l'};
        String name = new String(letters);
        System.out.println(name); // Prafful
    }
}
