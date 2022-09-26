import People.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void setUp(){
        passenger = new Passenger("Avin", 2);

    }

    @Test
    public void passengerHasName(){

        assertEquals("Avin",this.passenger.getName());
    }

    @Test
    public void passengerGetNoOfBags(){

        assertEquals(2 ,this.passenger.getNoOfBags(),0.0);
    }
}
