import math.utils.MathOperations;
import file.utils.FileOperations;
import java.io.IOException;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        int limit = 100;
        StringBuilder primes = new StringBuilder();
        
        System.out.println("Finding prime numbers up to " + limit);
        for (int i = 2; i <= limit; i++) {
            if (MathOperations.isPrime(i)) {
                primes.append(i).append(" ");
                System.out.print(i + " ");
            }
        }
        
        try {
            FileOperations.writeToFile("primes.txt", primes.toString());
            System.out.println("\n\nPrime numbers saved to primes.txt");
        } catch (IOException e) {
            System.out.println("Error saving primes: " + e.getMessage());
        }
    }
}