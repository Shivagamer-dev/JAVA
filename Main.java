public class Main {

    static int a = 10;
    static int b = 5;

    static int add() {
        return a + b;
    }

    static int subtract() {
        return a - b;
    }

    public static void main(String[] args) {

        int sum = add();
        int diff = subtract();

        System.out.println("addition: " + sum);
        System.out.println("subtraction: " + diff);
    }
}
