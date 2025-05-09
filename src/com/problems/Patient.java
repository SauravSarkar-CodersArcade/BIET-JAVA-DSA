package com.problems;
public class Patient {
    String patientName;
    int patientAge;
    String doa;
    String disease;
    Information info;
    Payment pay;
    public Patient(String patientName, int patientAge, String doa, String disease,
    Information info, Payment pay) {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.doa = doa;
        this.disease = disease;
        this.info = info;
        this.pay = pay;
    }
    void patientDetails(){
        System.out.println("The details of the patient are:");
        System.out.println("Name: " + this.patientName);
        System.out.println("Age: " + this.patientAge);
        System.out.println("Date Of Arrival: " + this.doa);
        System.out.println("Disease: " + this.disease);
        System.out.println("Block Number: " + this.info.blockNo);
        System.out.println("Floor Number: " + this.info.floorNo);
        System.out.println("Room Number: " + this.info.roomNo);
        System.out.println("Bed Number: " + this.info.bedNo);
        System.out.println("Admission Fees: " + this.pay.admFees);
        System.out.println("Registration Fees: " + this.pay.regFees);
        System.out.println("Balance Amount: " + this.pay.balAmt);
    }
    public static void main(String[] args) {
        Information info = new Information("A", 3,
                304, 5);
        Payment pay = new Payment(5000,10000,2000);
        Patient p1 = new Patient("XYZ",19,
                "09/05/25","Jaundice", info,pay);
        p1.patientDetails();
    }

}
