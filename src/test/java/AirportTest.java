import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {
    Plane plane1;
    Plane plane2;
    Flight flight1;
    Airport airport;

    @Before
    public void before() {
        plane1 = new Plane(PlaneType.BATFLYINGCAVE);
        plane2 = new Plane(PlaneType.TINYPLANE);
        flight1 = new Flight(plane2, 2, "TestLand");
    }

    @Test
    public void canCreateFlight() {
        airport.createFlight(plane1, 3, "Endor");
        assertEquals(1, airport.countFlights());
    }
}
