import java.util.HashMap;
import java.util.Map;

// Code Example from https://www.baeldung.com/java-verbose-gc
public class MinorAndMayorCollection {

    private static final Map<String, String> stringContainer = new HashMap<>();

    public static void main(String[] args) {
        String stringWithPrefix = "stringWithPrefix";

        for (int i = 0; i < 3000000; i++) {
            String newString = stringWithPrefix + i;
            stringContainer.put(newString, newString);
        }
        System.out.println("MAP size: " + stringContainer.size());

        System.gc();

        for (int i = 0; i < 2000000; i++) {
            String newString = stringWithPrefix + i;
            stringContainer.remove(newString);
        }

        System.out.println("MAP size: " + stringContainer.size());
    }
}