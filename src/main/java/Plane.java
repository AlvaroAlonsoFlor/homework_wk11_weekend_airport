import java.util.ArrayList;

public class Plane {
    private PlaneType type;
    private String airline;
    private ArrayList<String> passengers;
    private int seatsAvailable;

    Plane(PlaneType type, String airline) {
        this.type = type;
        this.airline = airline;
        this.passengers = new ArrayList<>();
        this.seatsAvailable = getType().getCapacity();

    }

    public PlaneType getType() {
        return type;
    }

    public String getAirline() {
        return airline;
    }

    public ArrayList<String> getPassengers() {
        return passengers;
    }

    public int countPassengers() {
        return passengers.size();
    }

    public boolean addPassenger(String passenger) {
        if (enoughSpace()) {
            passengers.add(passenger);
            seatsAvailable -= 1;
            return true;
        }
        return false;
    }



    public boolean enoughSpace() {
        if (seatsAvailable > 0) {
            return true;
        }
        return false;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }


    public boolean addSeveralPassengers(ArrayList<String> passengers) {
        if (seatsAvailable >= passengers.size()) {
//            for (String passenger: passengers) {
//                this.passengers.add(passenger);
//            }
            // I could do that but I will be always using it at the beginning
            this.passengers = passengers;
            seatsAvailable -= passengers.size();
            return true;
        }

        return false;
    }
}
