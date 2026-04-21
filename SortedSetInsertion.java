import java.util.*;

public class SortedSetInsertion {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();

        set.add(30);
        set.add(10);
        set.add(20);

        System.out.println(set); // Sorted output
    }
}