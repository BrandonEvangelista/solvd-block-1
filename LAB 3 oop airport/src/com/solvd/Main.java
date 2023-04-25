package com.solvd;

public class Main {
    public static void main(String[] args) {

        Pilot pilotJohn = new Pilot("John","Doe", 30, 90000,"Pilot");
        Pilot pilotDoe = new Pilot("Doe","John", 30, 90000,"Pilot");
        Bartender bartender1 = new Bartender("Bart","Simpson", 30, 90000,"Bartender");
        Bartender bartender2 = new Bartender("Lisa","Simpson", 30, 90000,"Bartender");


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

        CabinCrew cabinCrew1 = new CabinCrew( pilotJohn, attendantsFlightA123, bartender1 );
        CabinCrew cabinCrew2 = new CabinCrew( pilotDoe, attendantsFlightB123, bartender2 );

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

      Flight A123 = new Flight("United","A123","SFO","LAX",1,100,passengersFlightA123);
      Flight B123 = new Flight("Delta","B123","SFO","JFK",3,300,passengersFlightB123);



        //lets calculate Bruce Wayne's Airfare
        System.out.println( "total cost of flight " + Flight.calculateFlightCost(A123.getBaseCost(),passenger1.getNumberOfCheckedBags(),passenger1.isMealOrdered(),passenger1.getSeatClass()));

        flightAttendant1.doAssignedTask1();  // Board passengers + safety debrief

        pilotJohn.doAssignedTask1();    // Pilot Takes off

        bartender1.doAssignedTask1();  // opens bar...sells drinks

        flightAttendant1.doAssignedTask2(); // serves meals.

        bartender1.doAssignedTask2();  // closes bar..

        pilotJohn.doAssignedTask2();   // Pilot Lands plane

    }
}