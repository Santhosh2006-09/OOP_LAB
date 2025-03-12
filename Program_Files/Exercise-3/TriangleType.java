import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three sides of the triangle: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("It is an Equilateral Triangle.");
        } else if (a == b || b == c || a == c) {
            System.out.println("It is an Isosceles Triangle.");
        } else {
            System.out.println("It is a Scalene Triangle.");
        }
        scanner.close();
    }
}