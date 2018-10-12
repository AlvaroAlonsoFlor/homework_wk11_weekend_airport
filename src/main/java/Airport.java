import java.util.ArrayList;
import java.util.Map;

public class Airport {
    private ArrayList<Plane> hangar;
    private ArrayList<Flight> flights;
    private AirportCode airportCode;

    Airport(AirportCode airportCode) {
        this.hangar = new ArrayList<>();
        this.airportCode = airportCode;
        this.flights = new ArrayList<>();
    }

    public int countFlights() {
        return flights.size();
    }

    public void createFlight(Plane plane, int flightNumber, String destination) {
        //find plane
    }

    public void addPlane(Plane plane) {
        hangar.add(plane);
    }

    public int countPlanes() {
        return hangar.size();
    }

    public Plane findPlane(Plane planetoSearch) {
        for (Plane plane: this.hangar) {
            if (plane == planetoSearch) {
                return plane;
            }
        }
        return null;
    }
}
