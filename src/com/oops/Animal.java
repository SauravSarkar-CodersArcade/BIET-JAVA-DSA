package com.oops;
public class Animal {
    protected String species;
    public Animal(String species){
        this.species = species;
    }
    public void makeSound(){
        System.out.println("Animal makes a sound.");
    }
}
class Dog extends Animal{
    private String breed;
    public Dog(String species, String breed) {
        super(species);
        this.breed = breed;
    }
    public void makeSound(){
        System.out.println("Dog barks.");
    }
    public void displayInfo(){
        System.out.println("Species: " + super.species);
        System.out.println("Breed: " + this.breed);
        this.makeSound();
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Canine", "German Shepherd");
        dog.displayInfo();
    }

}
