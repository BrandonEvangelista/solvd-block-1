package com.solvd;

public class FlightAttendant extends Employee {

    public FlightAttendant(String fName, String lName, int years, int salary, String role) {
        super(fName, lName, years, salary, role);
    }


    @Override
    public void doAssignedTask1() {
        System.out.println("Boarding Passengers...");
        System.out.println("Flight Attendants: Pre-flight plane safety debrief in process.....");
    }

    @Override
    public void doAssignedTask2() {
        System.out.println("Flight Attendants: Serving meals and refrshments");
    }
}
