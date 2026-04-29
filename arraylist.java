import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Display list
        System.out.println("ArrayList: " + list);

        // Access element
        System.out.println("Element at index 1: " + list.get(1));

        // Remove element
        list.remove(2);

        System.out.println("After removal: " + list);
    }
}