package com.solvd;


public class Flight {
    public final static double economyClassMultiplier = 1.0;
    public final static double firstClassMultiplier = 2.0;
    public final static double busClassMultiplier = 1.5;


    private String airline;
    private String flightNumber;
    private String flightOrigin;
    private String flightDestination;
    private int numberOfStops;
    private int baseCost;  // cost is based on total distance
    private Passenger[] passengers;
    private int distanceTraveled;

    public Flight(String airline, String flightNumber, String flightOrigin, String flightDestination, int numberOfStops, int baseCost, Passenger[] passengers, int distanceTraveled) {
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.flightOrigin = flightOrigin;
        this.flightDestination = flightDestination;
        this.numberOfStops = numberOfStops;
        this.baseCost = baseCost;
        this.passengers = passengers;
        this.distanceTraveled = distanceTraveled;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightOrigin() {
        return flightOrigin;
    }

    public void setFlightOrigin(String flightOrigin) {
        this.flightOrigin = flightOrigin;
    }

    public String getFlightDestination() {
        return flightDestination;
    }

    public void setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
    }

    public int getNumberOfStops() {
        return numberOfStops;
    }

    public void setNumberOfStops(int numberOfStops) {
        this.numberOfStops = numberOfStops;
    }

    public int getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(int baseCost) {
        this.baseCost = baseCost;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public double calculateFlightCost(int baseCost, int numberOfBagsChecked, boolean orderedMeal, String seatClass) {
        double totalFlightCost = 1;
        double seatMultiplier;
        int distanceTraveled;


        if (seatClass.equals("firstClass")) {
            seatMultiplier = firstClassMultiplier;
        } else if (seatClass.equals("business")) {
            seatMultiplier = busClassMultiplier;
        } else {
            seatMultiplier = economyClassMultiplier;

        }


        totalFlightCost = seatMultiplier * (baseCost * this.getDistanceTraveled());

        int costOfBags = numberOfBagsChecked * 15;

        totalFlightCost += costOfBags;

        if (orderedMeal) {
            totalFlightCost += 20;
        }

        return totalFlightCost;
    }


}
