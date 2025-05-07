package com.oops.inheritance.multiple;
interface Browser1 {
    void browser1();
}
interface Browser2{
    void browser2();
}
interface Browser3{
    void browser3();
}
class Browsers implements Browser1, Browser2, Browser3{
    public void browser1(){
        System.out.println("Google Chrome");
    }
    public void browser2(){
        System.out.println("Mozilla Firefox");
    }
    public void browser3(){
        System.out.println("Internet Explorer");
    }
}
class MultipleInheritanceDemo{
    public static void main(String[] args) {
        Browsers browsers = new Browsers();
        browsers.browser1();
        browsers.browser2();
        browsers.browser3();
    }
}