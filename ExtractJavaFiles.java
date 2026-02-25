import java.io.*;

public class ExtractJavaFiles {

    public static void main(String[] args) {

        String file1 = "file1.java";
        String file2 = "filehandling2.java";

        System.out.println("===== Content of file1.java =====");
        readFile(file1);

        System.out.println("\n===== Content of filehandling2.java =====");
        readFile(file2);
    }

    static void readFile(String fileName) {

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading " + fileName + ": " + e.getMessage());
        }
    }
}
