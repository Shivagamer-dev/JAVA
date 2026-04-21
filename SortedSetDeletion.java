import java.util.*;

public class SortedSetDeletion {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);

        set.remove(10);

        System.out.println(set);
    }
}