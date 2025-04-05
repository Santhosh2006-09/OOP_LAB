class Person {
    String name = "Dr. Smith";

    void showName() {
        System.out.println("Doctor Name: " + name);
    }
}

class Doctor extends Person {
    void diagnose() {
        System.out.println(name + " is diagnosing a patient.");
    }
}

class Surgeon extends Doctor {
    void performSurgery() {
        System.out.println(name + " is performing surgery.");
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon();
        
        surgeon.showName();
        surgeon.diagnose();
        surgeon.performSurgery();
    }
}
