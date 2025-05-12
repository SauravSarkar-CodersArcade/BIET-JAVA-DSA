package com.oops.lambdas;
public interface Demo {
    void method();
}
class BIET {
    public static void main(String[] args) {
        // We cannot create object of interface
        // But, if we provide the implementation, we can create object
        // Boiler-plate code
        Demo demo = new Demo() {
            public void method(){
                System.out.println("This is interface method.!");
            }
        };
        demo.method();
        // From Java version 8: Scala Inspired Java Code
        Demo demo1 = () -> System.out.println("Lambda Expression - Scala..!!");
        demo1.method();
    }
}
