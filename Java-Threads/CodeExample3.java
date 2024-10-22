/**
 * Code Beispiel 3:
 * <p>
 * Methodenaufruf mit Verwendung von Threads und synchronisierten Methoden.
 * <p>
 * Hier verwenden wir die Methode {@code synchronized} um die Methode {@code increment()} zu synchronisieren.
 * <p>
 * Eine synchronisierte Methode kann nur von einem Thread gleichzeitig ausgeführt werden. Diese hat während sie ausgeführt wird,
 * einen sogenannten Lock auf das Objekt, auf dem sie aufgerufen wird. Während diese Methode gesperrt ist, wartet der andere Thread
 * darauf, dass der Lock freigegeben wird.
 */

public class CodeExample3 {
    static int count = 0;

    static synchronized void increment() {
        for (int i = 0; i < 1_000_000; i++) count++;
    }

    public static void main(String[] args) throws InterruptedException {
        count = 0;
        Thread t1 = new Thread(CodeExample3::increment);
        Thread t2 = new Thread(CodeExample3::increment);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count: " + count);
    }
}
