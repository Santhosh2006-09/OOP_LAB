import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("test.txt", true)) {
            writer.write("\nAppending new text!");
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
