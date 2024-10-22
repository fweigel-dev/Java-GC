/**
 * Code Beispiel 2:
 * <p>
 * Methodenaufruf mit Verwendung von Threads.
 * <p>
 * Wichtige Hinweise zu dem Code unten: <p>
 * 1. {@code CodeExample2::increment} ist eine Methodenreferenz, die auf die Methode increment() verweist.<p>
 * 2. {@code CodeExample2::increment} ist ein Lambda-Ausdruck, der die Methode increment aufruft.<p>
 * 3. {@code CodeExample2::increment} ist vom Typ Runnable, weil die Methode increment() keine Argumente akzeptiert und void zurückgibt.<p>
 * 4. {@code t1.join()} blockiert den aufrufenden Thread, bis der Thread t1 beendet ist.<p>
 * 5. {@code System.out.println("Count: " + count)} wird aufgerufen, nachdem die Threads t1 und t2 beendet sind.<p>
 *
 * <b>Große Problem mit unserem Code unten:</b><p>
 *  Wir haben eine sogenannte Race Condition. Thread t1 und t2 greifen auf die gemeinsame Variable count zu und erhöhen sie.
 *  Da die Methode {@code increment()} nicht synchronisiert ist, kann count am Ende zwischen 1_000_000 und 2_000_000 liegen.
 *
 *
 */

public class CodeExample2 {
    static int count = 0;

    static void increment() {
        for (int i = 0; i < 1_000_000; i++) count++;
    }

    public static void main(String[] args) throws InterruptedException {
        count = 0;
        Thread t1 = new Thread(CodeExample2::increment);
        Thread t2 = new Thread(CodeExample2::increment);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count: " + count);
    }
}
