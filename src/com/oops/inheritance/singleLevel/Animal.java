package com.oops.inheritance.singleLevel;
public class Animal { // Parent // Super Class
    String name;
    void eat(){
        System.out.println(this.name + " eats some food...!!");
    }
}
class Cat extends Animal { // Child // Base // Sub Class
    String speed;
    Cat(String speed, String name){
        this.speed = speed;
        this.name = name;
    }
    void speedData(){
        System.out.println(name + " runs " + speed);
    }
    public static void main(String[] args) {
        Cat cat = new Cat("Fast", "Tom");
//        cat.name = "Tom";
        cat.eat(); // Parent
        cat.speedData();
    }
}
