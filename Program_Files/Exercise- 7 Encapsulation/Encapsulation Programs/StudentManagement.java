class Student {
    private String studentID;
    private String name;
    private double GPA;

    public Student(String studentID, String name, double GPA) {
        this.studentID = studentID;
        this.name = name;
        this.GPA = GPA;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }

    public void updateGPA(double newGPA) {
        if (newGPA >= 0.0 && newGPA <= 4.0) {
            this.GPA = newGPA;
            System.out.println("GPA updated successfully.");
        } else {
            System.out.println("Invalid GPA value.");
        }
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Student student = new Student("S12345", "Emma Watson", 3.8);

        System.out.println("Student: " + student.getName());
        System.out.println("GPA: " + student.getGPA());

        student.updateGPA(3.9);
        System.out.println("Updated GPA: " + student.getGPA());
    }
}
