package com.oops.encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student student = new Student();
        // Use of setters
        student.setName("Raushan");
        student.setAge(29);
        student.setRollNo(1234);
        // Use of getters
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getRollNo());
    }
}
