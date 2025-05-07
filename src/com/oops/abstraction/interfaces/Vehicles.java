package com.oops.abstraction.interfaces;
public interface Vehicles {
    // The methods are completely empty
    // They are implemented in the child classes
    // therefore, they follow 100% abstraction
    void brand();
    void mileage();
}
class BMW implements Vehicles{
    @Override
    public void brand() {
        System.out.println("BMW");
    }
    @Override
    public void mileage() {
        System.out.println("8 km-pl");
    }
}
class Porsche implements Vehicles{
    @Override
    public void brand() {
        System.out.println("Porsche");
    }
    @Override
    public void mileage() {
        System.out.println("9 km-pl");
    }
}
class InterfaceDemo {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        Porsche porsche = new Porsche();
        bmw.brand();
        bmw.mileage();
        porsche.brand();
        porsche.mileage();
    }
}
