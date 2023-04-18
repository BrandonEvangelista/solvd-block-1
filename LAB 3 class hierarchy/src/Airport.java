class Airport {
    String airportCode;
    int numberOfGates;
    int numberOfTerminals;
    int numberOfRunways;

    // constructor
    public Airport(String airportCode, int gate, int terminals, int runways) {
        this.airportCode = airportCode;
        this.numberOfGates = gate;
        this.numberOfTerminals = terminals;
        this.numberOfTerminals= runways;
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
}
