public class Car extends FourWheeler {
    private final boolean isConvertible;

    public Car(String brand, String model, int year, int numberOfDoors, boolean isConvertible) {
        super(brand, model, year, numberOfDoors);
        this.isConvertible = isConvertible;
    }

    @Override
    public void start() {
        System.out.println("Car engine started");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped");
    }

    @Override
    public void changeGear(int newGear) {
        System.out.println("Car gear changed to " + newGear);
    }

    public void openRoof() {
        if (isConvertible) {
            System.out.println("Opening the convertible roof");
        } else {
            System.out.println("This car doesn't have a convertible roof");
        }
    }
}

