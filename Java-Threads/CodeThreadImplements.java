/**
 * Code Beispiel mit Implementierung des Runnable-Interfaces.
 */
public class CodeThreadImplements implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        CodeThreadImplements codeThreadImplements = new CodeThreadImplements();
        Thread thread = new Thread(codeThreadImplements);
        thread.start();
    }
}
