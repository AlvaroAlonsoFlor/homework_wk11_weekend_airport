import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PlaneTest {
    Plane plane;
    @Before
    public void before() {
        plane = new Plane(PlaneType.SUPERFAST, "Batman Airlines");
    }

    @Test
    public void getType() {
        assertEquals(PlaneType.SUPERFAST, plane.getType());
    }

    @Test
    public void getAirline() {
        assertEquals("Batman Airlines", plane.getAirline());
    }

    @Test
    public void countPassengers() {
        assertEquals(0, plane.countPassengers());
    }

    @Test
    public void enoughSpace() {
        assertTrue(plane.enoughSpace());
    }

    @Test
    public void notEnoughSpace() {
        Plane tinyplane = new Plane(PlaneType.TINYPLANE, "Tiny Airlines");
        tinyplane.addPassenger("Thor");
        tinyplane.addPassenger("Alvaro");
        tinyplane.addPassenger("Estrella");
        assertFalse(tinyplane.addPassenger("Aquaman"));
        assertFalse(tinyplane.enoughSpace());
        assertEquals(3, tinyplane.countPassengers());
        assertEquals(0,tinyplane.getSeatsAvailable());
    }
}
