import java.util.Scanner;

public class car {

    int n;
    int sum = 0;

    public static void main(String[] args) {

        car c = new car();
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        c.n = s.nextInt();

        System.out.println("You entered: " + c.n);

        s.close();
    }
}
