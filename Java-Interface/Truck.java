public class Truck extends FourWheeler {
    private final double cargoCapacity;

    public Truck(String brand, String model, int year, int numberOfDoors, double cargoCapacity) {
        super(brand, model, year, numberOfDoors);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void start() {
        System.out.println("Truck engine started");
    }

    @Override
    public void stop() {
        System.out.println("Truck engine stopped");
    }

    @Override
    public void changeGear(int newGear) {
        System.out.println("Truck gear changed to " + newGear);
    }

    public void loadCargo(double weight) {
        if (weight <= cargoCapacity) {
            System.out.println("Cargo loaded: " + weight + " tons");
        } else {
            System.out.println("Cargo weight exceeds capacity");
        }
    }
}

