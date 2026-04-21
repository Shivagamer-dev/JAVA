import java.util.*;

public class SetDeletion {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");

        set.remove("Apple");

        System.out.println(set);
    }
}