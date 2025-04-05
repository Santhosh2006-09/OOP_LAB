class Car {
    private String model;
    private int year;
    
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    
    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
    
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Camry", 2022);
        myCar.displayInfo();
    }
}
public class CarInfo {
    private String model;
    private int year;
    
    public void Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    
    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
    
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Camry", 2022);
        myCar.displayInfo();
    }
}