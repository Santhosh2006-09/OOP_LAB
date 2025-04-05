abstract class Employee {
    String name;
    double salary;
    
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    abstract double getPay();
    
    void showInfo() {
        System.out.println(name + ": $" + getPay());
    }
}

class Manager extends Employee {
    double bonus;
    
    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    
    @Override
    double getPay() {
        return salary + bonus;
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }
    
    @Override
    double getPay() {
        return salary;
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Employee emp1 = new Manager("John", 5000, 1000);
        Employee emp2 = new Developer("Alice", 4000);
        
        emp1.showInfo(); // John: $6000.0
        emp2.showInfo(); // Alice: $4000.0
    }
}