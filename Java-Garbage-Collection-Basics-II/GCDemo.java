public class GCDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 135; i++) {
            allocateMemory();
        }
    }

    private static void allocateMemory() {
        LargeObject[] objects = new LargeObject[10000];
        for (int i = 0; i < objects.length; i++) {
            objects[i] = new LargeObject();
        }
        System.out.println("Memory allocated");
    }
}