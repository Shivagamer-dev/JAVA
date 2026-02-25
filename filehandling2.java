import java.io.*;
import java.util.Scanner;

public class filehandling2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "sample.txt";

        System.out.print("Enter text to save in file: ");
        String userText = sc.nextLine();

        // 1) Append user input to file
        try (FileWriter fw = new FileWriter(fileName, true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write(userText);
            bw.newLine();
            System.out.println("Saved to " + fileName);

        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
            return;
        }

        System.out.println("\n--- File Content ---");
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }

        sc.close();
    }
}
