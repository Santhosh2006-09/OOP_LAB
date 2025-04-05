import file.utils.FileOperations;
import string.utils.StringOperations;
import java.io.IOException;
import java.util.List;

public class TextFileProcessor {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        
        try {
            FileOperations.createFile(inputFile);
            FileOperations.writeToFile(inputFile, "This is the first line.\n");
            FileOperations.appendToFile(inputFile, "This is the second line.\n");
            FileOperations.appendToFile(inputFile, "Madam Arora teaches malayalam\n");
            
            String content = FileOperations.readFile(inputFile);
            String processedContent = processContent(content);
            
            FileOperations.writeToFile(outputFile, processedContent);
            
            System.out.println("File processing complete.");
            System.out.println("Original content:\n" + content);
            System.out.println("\nProcessed content:\n" + processedContent);
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private static String processContent(String content) {
        String[] lines = content.split("\n");
        StringBuilder result = new StringBuilder();
        
        for (String line : lines) {
            String processedLine = StringOperations.capitalizeWords(line);
            if (StringOperations.isPalindrome(line.replaceAll("[^a-zA-Z]", ""))) {
                processedLine += " [PALINDROME]";
            }
            result.append(processedLine).append("\n");
        }
        
        return result.toString();
    }
}