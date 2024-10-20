public abstract class FourWheeler extends Vehicle {
    protected int numberOfDoors;

    public FourWheeler(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public abstract void changeGear(int newGear);
}

