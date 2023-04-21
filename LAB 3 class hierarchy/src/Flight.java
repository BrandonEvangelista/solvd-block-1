class Flight {
    private String flightNumber;
    private String arrivalTime;
    private String departureTime;
    private boolean isFlightDelayed;
    private String airportOfOrigin;
    private String destinationAirport;
    private double airfare;
    private int numberOfStops;

    // constructor;
    public Flight (String flightNum, String arriveTime, String departTime, Boolean delay, String origin, String dest, double cost) {
        this.flightNumber = flightNum;
        this.arrivalTime = arriveTime;
        this.departureTime = departTime;
        this.isFlightDelayed = delay;
        this.airportOfOrigin = origin;
        this.destinationAirport = dest;
        this.airfare = cost;

    }

    // getters + setters

    public void setFlightNumber(String code) {
        flightNumber = code;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setArrivalTime(String arriveTime) {
        arrivalTime = arriveTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setDepartureTime(String departTime) {
        departureTime = departTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setIsFlightDelayed(boolean delayedStatus) {
        isFlightDelayed = delayedStatus;
    }

    public boolean getIsFlightDelayed() {
        return isFlightDelayed;
    }

    public void setAirportOfOrigin(String origin) { airportOfOrigin = origin;}

    public String getAirportOfOrigin() {return airportOfOrigin;}

    public void setDestinationAirport(String destination) {destinationAirport = destination;}

    public String getDestinationAirport () {return destinationAirport;}

    public void setAirfare (double cost) {airfare = cost;}

    public double getAirfare () {return airfare;}






    // print


    public void printDetails() {
        System.out.println("Flight Details: ");
        System.out.println("   FLight Number: " + getFlightNumber());
        System.out.println("   Arrival Time: " + getArrivalTime());
        System.out.println("   Departure Time: " + getDepartureTime());
        System.out.println("  Airfare Cost: " + getAirfare());
    }
}
