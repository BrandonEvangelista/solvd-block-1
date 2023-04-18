class Flight {
    private String flightNumber;
    private String  arrivalTime;
    private String departureTime;
    private boolean isFlightDelayed;
    private String aiportOfOrigin;
    private String destinationAirport;

    // constructor;
    public Airport(String flightNum, String arriveTime, String departTime, Boolean delay, String origin,String dest) {
            this.flightNumber= flightNum;
            this.arrivalTime = arriveTime;
            this.departureTime = departTime
        this.isFlightDelayed= delay;
        this.aiportOfOrigin= origin;
        this.destinationAirport= dest;
    }

    // getters + setters

    public void setFlightNumber(String code) {
        flightNumber = code;
    }
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setNumberOfGates(int gates) {
        numberOfGates = gates;
    }
    public int getNumberOfGates() {
        return numberOfGates;
    }

    public void setNumberOfTerminals (int terminals) {
        numberOfGates = terminals;
    }
    public int getNumberOfTerminals() {
        return numberOfTerminals;
    }

    public void setNumberOfRunways (int runway) {
        numberOfRunways = runway;
    }
    public int getNumberOfRunways() {
        return numberOfRunways;
    }

    // print


    public void printDetails() {
        System.out.println("Airport Details: ");
        System.out.println("   Airport Code: "+ getAirportCode());
        System.out.println("   Number of gates: "+ getNumberOfGates() );
        System.out.println("   Number of runways: "+ getNumberOfRunways());
    }
}
