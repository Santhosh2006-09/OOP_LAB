import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt(); // Causes InputMismatchException if input is not a number
            System.out.println("You entered: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
        }
    }
}
