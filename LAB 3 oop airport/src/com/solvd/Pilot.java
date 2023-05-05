package com.solvd;

public class Pilot extends Employee {

    public Pilot(String fName, String lName, int years, int salary, String role) {
        super(fName, lName, years, salary, role);
    }

    @Override
    public void doAssignedTask1() {
        System.out.println("Cleared for Takeoff, Departing Airport of Origin");
    }

    @Override
    public void doAssignedTask2() {
        System.out.println("Cleared to Land, Destination Reached");
    }
}
