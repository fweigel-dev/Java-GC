public class Rechteck extends Form {
    private final double laenge;
    private final double breite;

    public Rechteck(String farbe, double laenge, double breite) {
        super(farbe);
        this.laenge = laenge;
        this.breite = breite;
    }

    public double berechneFlaeche() {
        return laenge * breite;
    }
}
