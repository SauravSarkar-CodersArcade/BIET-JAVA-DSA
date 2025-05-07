package com.oops.polymorphism.overriding;
public class ReserveBankOfIndia {
    double rateOfInterest(){
        return 7.5;
    }
}
class HDFC extends ReserveBankOfIndia {
    @Override
    double rateOfInterest(){
        return 8;
    }
}
class ICICI extends ReserveBankOfIndia {
    @Override
    double rateOfInterest(){
        return 8.5;
    }
}
class IDBI extends ReserveBankOfIndia {
    @Override
    double rateOfInterest(){
        return 9;
    }
}
class OverridingDemo {
    public static void main(String[] args) {
        ReserveBankOfIndia sbi = new ReserveBankOfIndia();
        HDFC hdfc = new HDFC();
        IDBI idbi = new IDBI();
        ICICI icici = new ICICI();

        System.out.println("RBI Rate of Interest: " + sbi.rateOfInterest()+ "%");
        System.out.println("HDFC Rate of Interest: " + hdfc.rateOfInterest()+ "%");
        System.out.println("IDBI Rate of Interest: " + idbi.rateOfInterest()+ "%");
        System.out.println("ICICI Rate of Interest: " + icici.rateOfInterest()+ "%");
    }
}

