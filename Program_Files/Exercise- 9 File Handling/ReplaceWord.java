import java.io.*;
import java.nio.file.*;

public class ReplaceWord {
    public static void main(String[] args) {
        String filePath = "test1.txt";
        String oldWord = "Java";
        String newWord = "Python";

        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            content = content.replaceAll(oldWord, newWord);
            Files.write(Paths.get(filePath), content.getBytes());
            System.out.println("Replaced all occurrences of '" + oldWord + "' with '" + newWord + "'.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
