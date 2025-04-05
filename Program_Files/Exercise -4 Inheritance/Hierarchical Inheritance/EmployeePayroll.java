class Employee {
    String name = "John Doe";
    double salary = 40000;

    void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: $" + salary);
    }
}

class FullTimeEmployee extends Employee {
    void calculateBonus() {
        double bonus = salary * 0.10;
        System.out.println("Full-Time Employee Bonus: $" + bonus);
    }
}

class PartTimeEmployee extends Employee {
    void calculateHourlyPay(int hours) {
        double hourlyRate = salary / 160; // Assuming 160 working hours in a month
        System.out.println("Part-Time Employee Pay for " + hours + " hours: $" + (hourlyRate * hours));
    }
}

public class EmployeePayroll {
    public static void main(String[] args) {
        FullTimeEmployee fullTime = new FullTimeEmployee();
        fullTime.displayInfo();
        fullTime.calculateBonus();

        PartTimeEmployee partTime = new PartTimeEmployee();
        partTime.displayInfo();
        partTime.calculateHourlyPay(20);
    }
}
