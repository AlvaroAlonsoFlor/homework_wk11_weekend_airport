public enum PlaneType {
    BOEING747(416),
    SUPERFAST(100),
    BATFLYINGCAVE(30),
    TINYPLANE(3);

    private final int capacity;

    PlaneType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

}
