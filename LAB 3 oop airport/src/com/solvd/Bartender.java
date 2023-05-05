package com.solvd;

public class Bartender extends Employee {


    public Bartender(String fName, String lName, int years, int salary, String role) {
        super(fName, lName, years, salary, role);

    }

    @Override
    public void doAssignedTask1() {
        System.out.println("Bartender: Now Serving Spirits and Wine ");
    }

    @Override
    public void doAssignedTask2() {
        System.out.println("Bartender: Preparing for landing, bar is now closed.");
    }
}
