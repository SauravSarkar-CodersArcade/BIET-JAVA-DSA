package com.oops;
public class Outer {
    private int value = 20;
    class Inner {
        void display(){
            System.out.println("Value is: " + value);
        }
    }
    public static void main(String[] args) {
        Outer out = new Outer();
        System.out.println(out.value);
        // OuterClass.InnerClass in_obj = out_obj.new InnerClass();
        Outer.Inner in = out.new Inner();
        in.display();
    }
}
