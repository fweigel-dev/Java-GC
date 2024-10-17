public class LargeObject {
    private final byte[] data;

    public LargeObject() {
        data = new byte[100 * 1024];
    }
}