class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.year = 2023;
        this.price = 30000.0;
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = 30000.0;
    }

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void display() {
        System.out.println("Car: " + make + " " + model + ", Year: " + year + ", Price: " + price);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla");
        car1.display();

        Car car2 = new Car("Honda", "Civic", 2022);
        car2.display(); 

        Car car3 = new Car("BMW", "X5", 2021, 50000.0);
        car3.display();
    }
}
