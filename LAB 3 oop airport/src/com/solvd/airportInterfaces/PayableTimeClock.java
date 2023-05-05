package com.solvd.airportInterfaces;

public interface PayableTimeClock {

    // Method for clocking in
    void clockIn();

    // Method for clocking out
    void clockOut();

    // Method for calculating the time worked
    double calculateTimeWorked();

}

