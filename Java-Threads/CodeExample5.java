/**
 * Code Beispiel 4:
 * <p>
 * Jeder Thread hat zu jedem Zeitpunkt einen Zustand. Es gibt folgende 6 Zustände:
 * <p>
 * 1. {@link Thread.State#NEW}: Der Thread wurde erstellt, aber noch nicht gestartet. <p>
 * 2. {@link Thread.State#RUNNABLE}: Der Thread wird gerade ausgeführt. <p>
 * 3. {@link Thread.State#BLOCKED}: Der Thread wartet auf einen Monitor-Lock, um fortzufahren. <p>
 * 4. {@link Thread.State#WAITING}: Der Thread wartet auf ein bestimmtes Ereignis, um fortzufahren. <p>
 * 5. {@link Thread.State#TIMED_WAITING}: Der Thread wartet auf ein bestimmtes Ereignis für eine bestimmte Zeit. <p>
 * 6. {@link Thread.State#TERMINATED}: Der Thread wurde beendet. <p>
 */

public class CodeExample5 {
    static int count = 0;

    static synchronized void increment() {
        for (int i = 0; i < 1_000_000; i++) count++;
    }

    public static void main(String[] args) throws InterruptedException {
        count = 0;
        Thread t1 = new Thread(CodeExample5::increment);
        System.out.println("Thread 1: " + t1.getState());

        t1.start();
        System.out.println("Thread 1: " + t1.getState());

        t1.join();
        System.out.println("Thread 1: " + t1.getState());
    }
}
