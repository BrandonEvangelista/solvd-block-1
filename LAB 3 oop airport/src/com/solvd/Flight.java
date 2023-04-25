package com.solvd;


    public class Flight {
        private String airline;
        private String flightNumber;
        private String flightOrigin;
        private String flightDestination;
        private int numberOfStops;
        private int baseCost;  // cost is based on economy price. multiplier is added for business/first-class
        private Passenger[] passengers;

        public Flight(String airline, String flightNumber, String flightOrigin, String flightDestination, int numberOfStops, int baseCost, Passenger[] passengers) {
            this.airline = airline;
            this.flightNumber = flightNumber;
            this.flightOrigin = flightOrigin;
            this.flightDestination = flightDestination;
            this.numberOfStops = numberOfStops;
            this.baseCost = baseCost;
            this.passengers = passengers;
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

        public static double calculateFlightCost(int baseCost, int numberOfBagsChecked, boolean orderedMeal, String seatClass) {
            double totalFlightCost = 0;
            double economyClassMultiplier= 1.0;
            double firstClassMultiplier = 2.0;
            double busClassMultiplier = 1.5;
            double seatMultiplier;

            if (seatClass.equals("economy")) {
                seatMultiplier = economyClassMultiplier;
            } else if (seatClass.equals("business")) {
                seatMultiplier = busClassMultiplier;
                }  else {
                    seatMultiplier = firstClassMultiplier;
                     }

            totalFlightCost = seatMultiplier * baseCost;

            int costOfBags = numberOfBagsChecked * 15;

            totalFlightCost += costOfBags;

            if (orderedMeal){
                totalFlightCost+= 20;
            }

            return totalFlightCost;
        }



    }
