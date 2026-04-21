import java.util.*;

public class SetUpdate {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");

        // Update Banana → Orange
        set.remove("Banana");
        set.add("Orange");

        System.out.println(set);
    }
}