import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
