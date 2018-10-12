public class Flight {
    private Plane plane;
    private int flightNum;
    private String destination;
    private int seatsAvailable;

    Flight(Plane plane, int flightNum, String destination) {
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.seatsAvailable = plane.getType().getCapacity();
    }

    public Plane getPlane() {
        return plane;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public String getDestination() {
        return destination;
    }

}
