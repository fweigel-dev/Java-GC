public class Bike extends TwoWheeler {
    private final boolean isElectric;

    public Bike(String brand, String model, int year, boolean hasKickStart, boolean isElectric) {
        super(brand, model, year, hasKickStart);
        this.isElectric = isElectric;
    }

    @Override
    public void start() {
        if (isElectric) {
            System.out.println("Electric bike powered on");
        } else {
            System.out.println("Bike engine started");
        }
    }

    @Override
    public void stop() {
        if (isElectric) {
            System.out.println("Electric bike powered off");
        } else {
            System.out.println("Bike engine stopped");
        }
    }

    @Override
    public void balance() {
        System.out.println("Balancing the bike");
    }

    public void pedal() {
        System.out.println("Pedaling the bike");
    }
}

