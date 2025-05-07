package com.oops.abstraction.abstractClassesAndMethods;
abstract class Animals {
    // Normal or Concrete Methods
    void eat(){
        System.out.println("Animals eat some food");
    }
    // Abstract Methods
    abstract void speed(); // This will be completed in child class
}
class Cat extends Animals{
    @Override
    void speed(){
        System.out.println("Cat's speed is fast....!!!");
    }
}
class Cheetah extends Animals{
    @Override
    void speed() {
        System.out.println("Cheetah's speed is very fast....!!!");
    }
}
class AbstractionDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cheetah cheetah = new Cheetah();
        cat.eat();
        cheetah.eat();
        cat.speed();
        cheetah.speed();
    }
}
