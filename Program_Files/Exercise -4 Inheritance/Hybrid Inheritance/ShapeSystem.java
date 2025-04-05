import java.util.Scanner;

public class ShapeSystem {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getColor();
        circle.getArea();
        circle.getRadius();
    }
}

class Shape {
    String color;
    void getColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter shape color: ");
        color = scanner.nextLine();
    }
}

class ColorInfo {
    String hexCode;
    void getHexCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter color hex code: ");
        hexCode = scanner.nextLine();
    }
}

class TwoDShape extends Shape {
    double area;
    void getArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter area: ");
        area = scanner.nextDouble();
    }
}

class Circle extends TwoDShape {
    double radius;
    void getRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();
    }
}