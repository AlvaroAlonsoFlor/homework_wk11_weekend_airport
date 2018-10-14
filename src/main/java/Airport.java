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

    public Flight createFlight(Plane plane, int flightNumber, String destination) {

        if (findPlane(plane) != null) {
            removePlane(plane);
            Flight flight = new Flight(plane, flightNumber, destination);
            flights.add(flight);
            return flight;
        }

        return null;


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


    public boolean removePlane(Plane plane) {
        return hangar.remove(plane);
    }

    public boolean sellTicket(Flight flight, String passenger) {
        if (findFlight(flight) != null && flight.getPlane().addPassenger(passenger)) {
            return true;
        }
        return false;
    }

    public Flight findFlight(Flight flighttoSearch) {
        for (Flight flight: flights) {
            if (flight == flighttoSearch) {
                return flight;
            }
        }
        return null;
    }

    public void prepareFlight(Flight batFlight) {
        int passengersNum = batFlight.getPlane().countPassengers();
        ArrayList<String> passengers = batFlight.getPlane().getPassengers();
        int capacity = batFlight.getPlane().getType().getCapacity();
        int seatsAvailable = batFlight.getPlane().getSeatsAvailable();



        for (Plane plane: hangar) {
            int seatsAvailableNewPlane = plane.getType().getCapacity() - passengersNum;
            if (seatsAvailable > seatsAvailableNewPlane  && seatsAvailableNewPlane > 0 ) {
                plane.addSeveralPassengers(passengers);
                batFlight.updatePlane(plane);
                prepareFlight(batFlight);
            }

        }
    }
}
