package airport ;

import java.awt.*;

public class main {
    public static void main(String[] args) {

        Airport airport = new Airport(10, 5, 5);
        Airline airline = new Airline("United", "UND");
        Flight flight = new Flight("0001", "00:00", "02:00", false, "SFO", "LAX", 200.00);
        Employee employee = new Employee("firstname", "lastname", 123456489, 50, 000);
        Plane plane = new Plane("Boeing", "747", 450, 65, 000);
        Runway runway = new Runway(245);
        Weather weather = new Weather(40, 40, "northwest", .22, .50, false);

        System.out.println("total cost of flight" + Flight.getAirfare());


    }
}