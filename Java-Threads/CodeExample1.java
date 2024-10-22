/**
 * Code Beispiel 1:
 * <p>
 * Ganz normaler Methodenaufruf, keine Verwendung von Threads.
 * <p>
 * Ergebnis: Count: 2_000_000
 */

public class CodeExample1 {
    static int count = 0;

    static void increment() {
        for (int i = 0; i < 1_000_000; i++) count++;
    }

    public static void main(String[] args) {
        count = 0;
        increment();
        increment();
        System.out.println("Count: " + count);
    }
}

