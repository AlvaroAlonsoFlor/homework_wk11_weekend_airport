import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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

    @Test
    public void addSeveralPassengers() {
        ArrayList<String> passengers = new ArrayList<>();
        passengers.add("Thor");
        passengers.add("Alvaro");
        passengers.add("Estrella");

        assertEquals(true, plane.addSeveralPassengers(passengers));
        assertEquals(3, plane.countPassengers());
    }

    @Test
    public void findPassenger() {
        ArrayList<String> passengers = new ArrayList<>();
        passengers.add("German");
        passengers.add("Alvaro");
        passengers.add("Foteini");
        passengers.add("Ben");
        passengers.add("Colin");
        passengers.add("Alison");

        assertTrue(plane.addSeveralPassengers(passengers));
        assertTrue(plane.findPassenger("Ben"));
    }
}
