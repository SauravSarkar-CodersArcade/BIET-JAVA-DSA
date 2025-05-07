package com.oops;
public class ConstructorExample {
    int x; // Instance Variables
    int y; // Instance variables
    ConstructorExample(){
        x = 10;
        y = 20;
    }
    ConstructorExample(int x, int y){
        this.x = x;
        this.y = y;
    }
    ConstructorExample(float a, float b){
        this.x = (int) a;
        this.y = (int) b;
    }
    ConstructorExample(double a, double b){
        this.x = (int) a;
        this.y = (int) b;
    }
    public static void main(String[] args) {
        ConstructorExample obj1 = new ConstructorExample();
        System.out.println(obj1.x + " " + obj1.y);
        ConstructorExample obj2 = new ConstructorExample(50, 100);
        System.out.println(obj2.x + " " + obj2.y);
        ConstructorExample obj3 = new ConstructorExample(4.5f,6.7f);
        System.out.println(obj3.x + " " + obj3.y);
        ConstructorExample obj4 = new ConstructorExample(3.54,5.67);
        System.out.println(obj4.x + " " + obj4.y);
    }
}
