public abstract class TwoWheeler extends Vehicle {
    protected boolean hasKickStart;

    public TwoWheeler(String brand, String model, int year, boolean hasKickStart) {
        super(brand, model, year);
        this.hasKickStart = hasKickStart;
    }

    public abstract void balance();
}

