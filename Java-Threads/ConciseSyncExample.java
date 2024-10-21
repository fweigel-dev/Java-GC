public class ConciseSyncExample {
    static int count = 0;

    static void incrementUnsync() {
        for (int i = 0; i < 1000000; i++) count++;
    }

    static synchronized void incrementSync() {
        for (int i = 0; i < 1000000; i++) count++;
    }

    public static void main(String[] args) throws InterruptedException {
        count = 0;
        Thread t1 = new Thread(ConciseSyncExample::incrementUnsync);
        Thread t2 = new Thread(ConciseSyncExample::incrementUnsync);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Unsynchronized: " + count);

        count = 0;
        t1 = new Thread(ConciseSyncExample::incrementSync);
        t2 = new Thread(ConciseSyncExample::incrementSync);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Synchronized: " + count);
    }
}