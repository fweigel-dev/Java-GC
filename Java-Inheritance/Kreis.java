public class Kreis extends Form {
    private final double radius;

    public Kreis(String farbe, double radius) {
        super(farbe);
        this.radius = radius;
    }

    public double berechneFlaeche() {
        return Math.PI * radius * radius;
    }
}
