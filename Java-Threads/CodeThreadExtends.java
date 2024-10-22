/**
 * Code Beispiel mit Vererbung von der Thread-Klasse.
 */
public class CodeThreadExtends extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        CodeThreadExtends thread = new CodeThreadExtends();
        thread.start();
    }
}
