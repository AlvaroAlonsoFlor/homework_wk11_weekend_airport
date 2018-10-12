import java.util.ArrayList;

public class Airport {
    ArrayList<Plane> hangar;
    ArrayList<Flight> flights;
    AirportCode airportCode;

    Airport(AirportCode airportCode) {
        this.hangar = new ArrayList<>();
        this.airportCode = airportCode;
        this.flights = new ArrayList<>();
    }

    public int countFlights() {
        return flights.size();
    }

    public void createFlight(Plane plane, int flightNumber, String destination) {
        flights.add(new Flight(plane, flightNumber, destination));
    }
}
