package com.solvd;

public class Main {
    public static void main(String[] args) {


        Person person = new Person ("dan","cook",34);
        System.out.print(person.toString());

        Pilot pilotJohn = new Pilot("John","Doe", 30, 90000,"Pilot");
        Pilot pilotDoe = new Pilot("Doe","John", 30, 90000,"Pilot");

        FlightAttendant flightAttendant1 = new FlightAttendant("Jane","Doe",30,60000,"flight attendant");
        FlightAttendant flightAttendant2 = new FlightAttendant("Jane2","Do2",30,60000,"flight attendant");
        FlightAttendant flightAttendant3 = new FlightAttendant("Jane3","Doe3",30,60000,"flight attendant");
        FlightAttendant flightAttendant4 = new FlightAttendant("Jane4","Do4",30,60000,"flight attendant");

        FlightAttendant[] attendantsFlightA123 = new FlightAttendant[]{
                flightAttendant1,
                flightAttendant2
        } ;

        FlightAttendant[] attendantsFlightB123 = new FlightAttendant[]{
                flightAttendant3,
                flightAttendant4
        } ;

        CabinCrew cabinCrew1 = new CabinCrew( pilotJohn, attendantsFlightA123 );
        CabinCrew cabinCrew2 = new CabinCrew( pilotDoe, attendantsFlightB123 );

        Plane planeA123 = new Plane ("Boeing","747",415,cabinCrew1);
        Plane planeB123 = new Plane ("Boeing","787",550 ,cabinCrew2);

        Plane[] planesAtSFO = new Plane[]{
                planeA123,
                planeB123
        };

        Airport airport = new Airport("San Francisco Intl Airport", "SFO", 4, planesAtSFO );


        Passenger passenger1 = new Passenger("Bruce","Wayne",30,"firstClass",100, true);
        Passenger passenger2 = new Passenger("Clark","Kent",30,"business",0, false);
        Passenger passenger3 = new Passenger("Diana ","Prince",30,"economy",2, false);
        Passenger passenger4 = new Passenger("Billy  ","Batson",30,"economy",5, false);
        Passenger passenger5 = new Passenger("Barry ","Allen",30,"economy",4, false);
        Passenger passenger6 = new Passenger("Barbara  ","Gordon",30,"economy",4, false);

        Passenger[] passengersFlightA123 = new Passenger[] {
            passenger1, passenger2, passenger3
        };

        Passenger[] passengersFlightB123 = new Passenger[]{
            passenger4, passenger5, passenger6
        };


    }
}