import java.util.HashSet;

public class CustomHashSet {

    private final HashSet<String> hashSet;

    public CustomHashSet() {
        this
                .hashSet = new HashSet<>();
    }

    public HashSet<String> getHashSet() {
        return hashSet;
    }

    public void add(String string) {
        hashSet
                .add(string);
    }

    public void remove(String string) {
        hashSet
                .remove(string);
    }
}
