package com.solvd;

public class Airport {
    // Properties
    private String name;
    private String code;
    private int numOfRunways;
    private Plane[] planes;
    private AirportToAirportDistance[] airportDistances;

    public Airport(String name, String code, int numOfRunways, Plane[] planes, AirportToAirportDistance[] airportDistances) {
        this.name = name;
        this.code = code;
        this.numOfRunways = numOfRunways;
        this.planes = planes;
        this.airportDistances = airportDistances;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNumOfRunways() {
        return numOfRunways;
    }

    public void setNumOfRunways(int numOfRunways) {
        this.numOfRunways = numOfRunways;
    }

    public Plane[] getPlanes() {
        return planes;
    }

    public void setPlanes(Plane[] planes) {
        this.planes = planes;
    }

    public AirportToAirportDistance[] getAirportDistances() {
        return airportDistances;
    }

    public void setAirportDistances(AirportToAirportDistance[] airportDistances) {
        this.airportDistances = airportDistances;
    }

    @Override
    public String toString() {
        return ("Airport Name: " + name + "Airport Code: " + code + "Number of Runways: " + numOfRunways);

    }
}
