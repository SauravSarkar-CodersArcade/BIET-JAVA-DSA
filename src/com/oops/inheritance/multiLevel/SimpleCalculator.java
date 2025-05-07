package com.oops.inheritance.multiLevel;

public class SimpleCalculator {
    void addition(int a, int b){
        System.out.println(a+b);
    }
}
class AdvancedCalculator extends SimpleCalculator{
    void subtraction(int a, int b){
        System.out.println(a-b);
    }
}
class SuperAdvancedCalculator extends AdvancedCalculator{
    void multiplication(int a, int b){
        System.out.println(a*b);
    }
    void division(int a, int b){
        System.out.println(a/b);
    }

    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.addition(1,2);
        System.out.println("----------------------------------------");
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        advancedCalculator.addition(1,2);
        advancedCalculator.subtraction(10,5);
        System.out.println("----------------------------------------");
        SuperAdvancedCalculator superAdvancedCalculator = new SuperAdvancedCalculator();
        superAdvancedCalculator.addition(10,20);
        superAdvancedCalculator.subtraction(2,1);
        superAdvancedCalculator.division(10,2);
        superAdvancedCalculator.multiplication(100,4);
        System.out.println("----------------------------------------");
    }
}
