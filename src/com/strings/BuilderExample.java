package com.strings;

public class BuilderExample {
    public void stringAppend() {
        StringBuilder builder = new StringBuilder("BIET");
        System.out.println("Original String: " + builder);
        builder.append(" College");
        System.out.println("New String: " + builder);
    }
    public void stringInsert() {
        StringBuilder builder = new StringBuilder("JA");
        System.out.println("Original String: " + builder);
        builder.insert(1,"AV"); // JAVA
        System.out.println("New String: " + builder);
    }
    public void stringReverse(){
        StringBuilder builder = new StringBuilder("NOHTYP");
        System.out.println("Original String: " + builder);
        builder.reverse(); // JAVA
        System.out.println("New String: " + builder);
    }

    public static void main(String[] args) {
        new BuilderExample().stringAppend();
        new BuilderExample().stringInsert();
        new BuilderExample().stringReverse();
    }
}
