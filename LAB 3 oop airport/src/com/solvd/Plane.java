package com.solvd;

public class Plane {
    // Properties
    private String make;
    private String model;
    private int passengerCapacity;
    private CabinCrew cabinCrew;


    // Constructor
    public Plane(String make, String model, int passengerCapacity, CabinCrew cabinCrew) {
        this.make = make;
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.cabinCrew = cabinCrew;


    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public CabinCrew getCabinCrew() {
        return cabinCrew;
    }

    public void setCabinCrew(CabinCrew cabinCrew) {
        this.cabinCrew = cabinCrew;
    }
}

