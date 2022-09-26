import Flights.Flight;
import Flights.Plane;
import People.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightCrewTest {

    Flight flight;
    FlightCrew flightCrew;
    CabinCrew cabinCrew;
    Passenger passenger;

    @Before
    public void setUp(){
        flightCrew = new FlightCrew("Paul","ABC123", TypeOfFlightCrew.CAPTAIN);
        cabinCrew = new CabinCrew("Preet", TypeOfCabinCrew.PURSER);
        passenger = new Passenger("Avin", 2);
        flight = new Flight(flightCrew,cabinCrew,passenger,Plane.BOEING737,"BA201","GLA","LHR", "12:00");

    }

    @Test
    public void flightHasCabinCrew() {
        assertEquals(1, flight.getCrew());
    }
}
