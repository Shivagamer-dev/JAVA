// Write a program to implement Set in Java.
import java.util.HashSet;

public class setImplement {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // Add elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // duplicate

        // Display set
        System.out.println("Set: " + set);

        // Remove element
        set.remove(20);

        System.out.println("After removal: " + set);
    }
}