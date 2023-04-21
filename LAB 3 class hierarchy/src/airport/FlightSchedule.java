package airport;

public class FlightSchedule {
    private Flight[] flights;
    private int numFlights;

    public FlightSchedule(int capacity) {
        flights = new Flight[capacity];
        numFlights = 0;
    }

    public void addFlight(Flight flight) {
        if (numFlights < flights.length) {
            flights[numFlights] = flight;
            numFlights++;
        } else {
            System.out.println("Flight schedule is full.");
        }
    }



    public Flight[] getFlights() {
        return flights;
    }

    public int getNumFlights() {
        return numFlights;
    }

    public void printSchedule() {
        System.out.println("Flight Schedule:");
        for (int i = 0; i < numFlights; i++) {
            System.out.println(flights[i].toString());
        }
    }
}
