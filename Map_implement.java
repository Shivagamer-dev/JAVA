import java.util.HashMap;

public class Map_implement {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // Add key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Display map
        System.out.println("Map: " + map);

        // Access value
        System.out.println("Value for key 2: " + map.get(2));

        // Remove key
        map.remove(3);

        System.out.println("After removal: " + map);
    }
}