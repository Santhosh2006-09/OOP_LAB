class Person {
    String name = "Alice";

    void showName() {
        System.out.println("Name: " + name);
    }
}

class Teacher extends Person {
    String subject = "Mathematics";

    void teach() {
        System.out.println(name + " teaches " + subject);
    }
}

class Principal extends Teacher {
    void manageSchool() {
        System.out.println(name + " is managing the school.");
    }
}

public class SchoolManagement {
    public static void main(String[] args) {
        Principal principal = new Principal();
        
        principal.showName();
        principal.teach();
        principal.manageSchool();
    }
}
