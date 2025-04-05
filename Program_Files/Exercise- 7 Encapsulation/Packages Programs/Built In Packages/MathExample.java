import java.util.*;
import java.time.*;
import java.text.*;

public class MathExample {
    public static void main(String[] args) {
        System.out.println("Square root of 25: " + Math.sqrt(25));
        System.out.println("Power: " + Math.pow(2, 3));
        
        Random random = new Random();
        System.out.println("Random number (0-100): " + random.nextInt(101));
        
        System.out.println("Sin 30°: " + Math.sin(Math.toRadians(30)));
        
        System.out.println("PI: " + Math.PI);
        System.out.println("E: " + Math.E);
        
        LocalDate today = LocalDate.now();
        LocalDate futureDate = today.plusDays(100);
        System.out.println("\n100 days from today: " + futureDate);
        
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Formatted PI: " + df.format(Math.PI));
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a number to square: ");
        double num = scanner.nextDouble();
        System.out.println("Square of " + num + ": " + Math.pow(num, 2));
        scanner.close();
    }
}