import java.util.*;

public class SortedSetUpdate {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);

        // Update 20 → 25
        set.remove(20);
        set.add(25);

        System.out.println(set);
    }
}