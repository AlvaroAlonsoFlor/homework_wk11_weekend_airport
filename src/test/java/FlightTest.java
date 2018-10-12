import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Plane plane;
    Flight flight;

    @Before
    public void before() {
        plane = new Plane(PlaneType.TINYPLANE, "Testing Airlines");
        flight = new Flight(plane, 666, "Hell");
    }

    @Test
    public void getPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void getFlisghtNum() {
        assertEquals(666, flight.getFlightNum());
    }

    @Test
    public void getDestination() {
        assertEquals("Hell", flight.getDestination());
    }
}
