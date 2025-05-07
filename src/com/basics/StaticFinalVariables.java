package com.basics;

public class StaticFinalVariables {
    final int x;
    // Where do we initialize a final variable?
    // Ans: Constructor
    StaticFinalVariables(){
        x = 20;
    }
    static final int y;
    // Where do we initialize a static final variable?
    // Ans: In the static block
    static {
        y = 30;
    }
}
