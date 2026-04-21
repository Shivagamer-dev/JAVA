import java.util.*;

public class UniqueElements {
    public static void main(String[] args) {

        // Step 1: Create ArrayList and add 10 elements (with duplicates)
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);  // duplicate
        list.add(40);
        list.add(50);
        list.add(20);  // duplicate
        list.add(60);
        list.add(70);
        list.add(30);  // duplicate

        // Step 2: Print original list
        System.out.println("Original List: " + list);

        // Step 3: Find unique elements using HashSet
        HashSet<Integer> uniqueSet = new HashSet<>(list);

        // Step 4: Print unique elements
        System.out.println("Unique Elements: " + uniqueSet);
    }
}