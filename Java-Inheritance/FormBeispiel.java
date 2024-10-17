public class FormBeispiel {
    public static void main(String[] args) {
        Form kreis = new Kreis("rot", 5);
        Form rechteck = new Rechteck("blau", 4, 6);

        System.out.println("Fläche des Kreises: " + kreis.berechneFlaeche());
        System.out.println("Farbe des Kreises: " + kreis.getFarbe());
        kreis.beschreibeForm();

        System.out.println("Fläche des Rechtecks: " + rechteck.berechneFlaeche());
        System.out.println("Farbe des Rechtecks: " + rechteck.getFarbe());
        rechteck.beschreibeForm();
    }
}