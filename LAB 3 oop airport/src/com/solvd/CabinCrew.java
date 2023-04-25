package com.solvd;

public class CabinCrew<bartender> {
    private Pilot pilot;
    private FlightAttendant[] flightAttendants;
    private Bartender bartender;

    public CabinCrew(Pilot pilot, FlightAttendant[] flightAttendants, Bartender bartender) {
        this.pilot = pilot;
        this.flightAttendants = flightAttendants;
        this.bartender = bartender;
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

    public Bartender getBartender() {
        return bartender;
    }

    public void setBartender(Bartender bartender) {
        this.bartender = bartender;
    }
}
