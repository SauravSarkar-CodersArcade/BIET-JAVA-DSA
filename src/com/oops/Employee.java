package com.oops;
public class Employee {
    public Employee(String name, String email, int salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    String name;
    String email;
    int salary;
    static final String company = "Tripillar";

    void employeeDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Salary: Rs." + this.salary);
        System.out.println("Company: " + company);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("Vikrant",
                "vikrant@tripillar.com", 80000);
        e1.employeeDetails();

        Employee e2 = new Employee("Nirmal",
                "nirmal@tripillar.com", 60000);
        e2.employeeDetails();

    }
}
