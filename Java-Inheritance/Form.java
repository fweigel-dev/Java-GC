public abstract class Form {
    private final String farbe;

    public Form(String farbe) {
        this.farbe = farbe;
    }

    abstract double berechneFlaeche();

    public String getFarbe() {
        return farbe;
    }

    public void beschreibeForm() {
        System.out.println("Die Form ist " + farbe + " und hat eine Fläche von " + berechneFlaeche());
    }
}
