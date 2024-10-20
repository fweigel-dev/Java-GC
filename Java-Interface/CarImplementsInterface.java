public class CarImplementsInterface extends FourWheeler implements AirConditioned {
    private final boolean isConvertible;
    private int temperature;

    public CarImplementsInterface(String brand, String model, int year, int numberOfDoors, boolean isConvertible) {
        super(brand, model, year, numberOfDoors);
        this.isConvertible = isConvertible;
        this.temperature = 20;
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

    @Override
    public void setTemperature(int temperature) {
        if (temperature < 15) {
            System.out.println("Temperature is too low");
        } else if (temperature > 30) {
            System.out.println("Temperature is too high");
        } else {
            System.out.println("Temperature set to " + temperature);
            this.temperature = temperature;
        }
    }

    @Override
    public void increaseTemperature(int increment) {
        if (temperature + increment > 30) {
            System.out.println("Temperature can't be increased by " + increment + " degrees");
        } else {
            System.out.println("Temperature increased by " + increment + " degrees");
            temperature += increment;
        }

    }
}

