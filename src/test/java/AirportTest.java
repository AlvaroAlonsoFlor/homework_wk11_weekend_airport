import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AirportTest {
    Plane plane1;
    Plane plane2;
    Flight flight1;
    Airport airport;

    @Before
    public void before() {
        plane1 = new Plane(PlaneType.BATFLYINGCAVE, "Batman Airlines");
        plane2 = new Plane(PlaneType.TINYPLANE, "SmallWorld Airlines");
        flight1 = new Flight(plane2, 2, "TestLand");
        airport = new Airport(AirportCode.EDI);
    }

    @Test
    public void addPlane() {
        airport.addPlane(plane1);
        assertEquals(1, airport.countPlanes());
    }

    @Test
    public void findPlane() {
        airport.addPlane(plane1);
        assertEquals(plane1, airport.findPlane(plane1));
    }

    @Test
    public void removePlane() {
        airport.addPlane(plane1);
        assertTrue(airport.removePlane(plane1));
    }

    @Test
    public void removePlaneFalse() {
        airport.addPlane(plane2);
        assertFalse(airport.removePlane(plane1));
    }



    @Test
    public void canCreateFlight() {
        airport.addPlane(plane1);
        airport.createFlight(plane1, 3, "Endor");
        assertEquals(1, airport.countFlights());
    }
}
