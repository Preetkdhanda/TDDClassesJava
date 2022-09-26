import People.CabinCrew;
import People.TypeOfCabinCrew;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    private CabinCrew cabinCrew;
    private CabinCrew cabinCrew2;
    private CabinCrew cabinCrew3;

    @Before
    public void setUp(){

        cabinCrew = new CabinCrew("Preet", TypeOfCabinCrew.PURSER);
        cabinCrew2 = new CabinCrew("Nick", TypeOfCabinCrew.CABINCREW);
        cabinCrew3 = new CabinCrew("Ellis", TypeOfCabinCrew.WORLDCLASSCREW);

    }
    @Test
    public void cabinCrewHasName(){
        assertEquals("Preet", this.cabinCrew.getName());
    }

    @Test
    public void cabinCrewHasRank(){
        assertEquals(TypeOfCabinCrew.PURSER, this.cabinCrew.getRank());
    }
}
