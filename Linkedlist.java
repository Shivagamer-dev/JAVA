import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // Add elements
        list.add(10);
        list.addFirst(5);
        list.addLast(20);

        // Display list
        System.out.println("LinkedList: " + list);

        // Remove first element
        list.removeFirst();

        System.out.println("After removal: " + list);
    }
}