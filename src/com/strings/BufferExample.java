package com.strings;

public class BufferExample {
    public void stringAppend() {
        StringBuffer buffer = new StringBuffer("BIET");
        System.out.println("Original String: " + buffer);
        buffer.append(" College");
        System.out.println("New String: " + buffer);
    }
    public void stringInsert() {
        StringBuffer buffer = new StringBuffer("JA");
        System.out.println("Original String: " + buffer);
        buffer.insert(1,"AV"); // JAVA
        System.out.println("New String: " + buffer);
    }
    public void stringReverse(){
        StringBuffer buffer = new StringBuffer("NOHTYP");
        System.out.println("Original String: " + buffer);
        buffer.reverse(); // JAVA
        System.out.println("New String: " + buffer);
    }

    public static void main(String[] args) {
        new BufferExample().stringAppend();
        new BufferExample().stringInsert();
        new BufferExample().stringReverse();
    }
}
