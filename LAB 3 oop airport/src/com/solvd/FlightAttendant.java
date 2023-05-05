package com.solvd;

import com.solvd.airportInterfaces.PayableTimeClock;

import java.time.Duration;
import java.time.LocalDateTime;

public class FlightAttendant extends Employee implements PayableTimeClock {

    public FlightAttendant(String fName, String lName, int years, int salary, String role) {
        super(fName, lName, years, salary, role);
    }

    private LocalDateTime clockInTime;
    private LocalDateTime clockOutTime;

    public void clockIn() {
        LocalDateTime clockInTime = LocalDateTime.now();
    }

    public void clockOut() {
        LocalDateTime clockOutTime = LocalDateTime.now();
    }

    public double calculateTimeWorked() {
        Duration duration = Duration.between(clockInTime, clockOutTime);
        long seconds = duration.getSeconds();
        double hours = (double) seconds / 3600;
        return hours;
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
