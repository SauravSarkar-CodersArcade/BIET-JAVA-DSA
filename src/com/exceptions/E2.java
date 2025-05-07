package com.exceptions;
public class E2 {
    static void checkAge(int age){
        if(age >= 18){
            System.out.println("Eligible : Access Granted..!!");
        }else {
            throw new RuntimeException
                    ("Not Eligible : Access Denied..!!");
        }
    }
    public static void main(String[] args) {
        checkAge(12);
    }
}
