import java.util.HashSet;
import java.util.Set;

// Adapted Code Example from https://www.baeldung.com/java-verbose-gc
public class MinorAndMayorCollection {

    private static final Set<String> stringContainer = new HashSet<>();

    public static void main(String[] args) {
        String stringWithPrefix = "stringWithPrefix";

        for (int i = 0; i < 3_000_000; i++) {
            String newString = stringWithPrefix + i;
            stringContainer.add(newString);
        }
        System.out.println("MAP size: " + stringContainer.size());

        System.gc();

        for (int i = 0; i < 2_000_000; i++) {
            String newString = stringWithPrefix + i;
            stringContainer.remove(newString);
        }

        System.out.println("MAP size: " + stringContainer.size());
    }
}