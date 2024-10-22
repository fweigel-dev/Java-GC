/**
 * Code Beispiel 4:
 * <p>
 * {@code isAlive()} Methode wird verwendet, um zu überprüfen, ob ein Thread noch aktiv ist.
 * <p>
 * {@code isAlive()} Methode gibt {@code true} zurück, wenn der Thread noch aktiv ist, andernfalls {@code false}.
 * <p>
 * Das unten gezeigte Beispiel bitte NIEMALS in echt verwenden. Wir nennen diesen Zustand "Busy Waiting".
 * Wir verbrauchen unnötig CPU Power, indem wir die Schleife laufen lassen, bis die Threads t1 und t2 beendet sind.
 * <p>
 * Es gibt aber andere Fälle, wo man {@code isAlive()} sinnvoll verwenden kann. Hier wäre die {@code join()} Methode besser geeignet.
 * <p>
 * Ergebnis: Count: 2_000_000
 */

public class CodeExample4 {
    static int count = 0;

    static synchronized void increment() {
        for (int i = 0; i < 1_000_000; i++) count++;
    }

    public static void main(String[] args) throws InterruptedException {
        count = 0;
        Thread t1 = new Thread(CodeExample4::increment);
        Thread t2 = new Thread(CodeExample4::increment);
        t1.start();
        t2.start();
        while (t1.isAlive() || t2.isAlive()) {

        }
        System.out.println("Count: " + count);
    }
}
