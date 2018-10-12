public enum PlaneType {
    BOEING747(416),
    SUPERFAST(100),
    BATFLYINGCAVE(30),
    TINYPLANE(3);

    private final int value;

    PlaneType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
