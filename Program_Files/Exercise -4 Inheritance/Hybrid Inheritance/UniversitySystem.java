import java.util.Scanner;

public class UniversitySystem {
    public static void main(String[] args) {
        Undergraduate undergrad = new Undergraduate();
        undergrad.getName();
        undergrad.getStudentID();
        undergrad.getMajor();
    }
}

class Person {
    String name;
    void getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter person name: ");
        name = scanner.nextLine();
    }
}

class Course {
    String courseName;
    void getCourseName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter course name: ");
        courseName = scanner.nextLine();
    }
}

class Student extends Person {
    int studentID;
    void getStudentID() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        studentID = scanner.nextInt();
    }
}

class Undergraduate extends Student {
    String major;
    void getMajor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter major: ");
        major = scanner.nextLine();
    }
}