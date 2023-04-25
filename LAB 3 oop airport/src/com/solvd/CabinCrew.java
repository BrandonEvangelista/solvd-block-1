package com.solvd;

public class CabinCrew {
    private Pilot pilot;
    private FlightAttendant[] flightAttendants;

    public CabinCrew(Pilot pilot, FlightAttendant[] flightAttendants) {
        this.pilot = pilot;
        this.flightAttendants = flightAttendants;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public FlightAttendant[] getFlightAttendants() {
        return flightAttendants;
    }

    public void setFlightAttendants(FlightAttendant[] flightAttendants) {
        this.flightAttendants = flightAttendants;
    }


}
