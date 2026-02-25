import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class file2 {
public static void main(String[] args) {
try {
FileReader fr = new FileReader("sample.txt");
int i;
while((i = fr.read()) != -1) {
System.out.print((char)i);
}
fr.close();
FileWriter fw = new FileWriter("sample.txt");
fw.write("Learning to do file handling in java");
fw.close();
System.out.println("File written successfully.");
FileReader fre = new FileReader("sample.txt");
int s;
while((s = fre.read()) != -1) {
System.out.print((char)s);
}
fr.close();
} catch (IOException e) {
System.out.println(e);
}
}}