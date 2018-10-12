import java.util.ArrayList;

public class Plane {
    private PlaneType type;
    private String airline;
    private ArrayList<String> passengers;

    Plane(PlaneType type, String airline) {
        this.type = type;
        this.airline = airline;
        this.passengers = new ArrayList<>();

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
}
