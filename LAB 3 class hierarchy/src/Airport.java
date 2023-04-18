class Airport {
    private String airportCode;
    private int numberOfGates;
    private  int numberOfTerminals;
    private  int numberOfRunways;

    // constructor
    public Airport(String airportCode, int gate, int terminals, int runways) {
        this.airportCode = airportCode;
        this.numberOfGates = gate;
        this.numberOfTerminals = terminals;
        this.numberOfRunways = runways;
    }

    // getters + setters

    public void setAirportCode(String code) {
        airportCode = code;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setNumberOfGates(int gates) {
        numberOfGates = gates;
    }

    public int getNumberOfGates() {
        return numberOfGates;
    }

    public void setNumberOfTerminals(int terminals) {
        numberOfGates = terminals;
    }

    public int getNumberOfTerminals() {
        return numberOfTerminals;
    }

    public void setNumberOfRunways(int runway) {
        numberOfRunways = runway;
    }

    public int getNumberOfRunways() {
        return numberOfRunways;
    }

    // print


    public void printDetails() {
        System.out.println("Airport Details: ");
        System.out.println("   Airport Code: " + getAirportCode());
        System.out.println("   Number of gates: " + getNumberOfGates());
        System.out.println("   Number of runways: " + getNumberOfRunways());
    }
}
