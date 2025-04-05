class Product {
    protected String name;
    protected double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public void displayDetails() {
        System.out.println(name + " - $" + price);
    }
}

class Electronics extends Product {
    public Electronics(String name, double price) {
        super(name, price);
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Electronic");
    }
}

class Grocery extends Product {
    public Grocery(String name, double price) {
        super(name, price);
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Grocery");
    }
}

public class ECommerce {
    public static void main(String[] args) {
        Product laptop = new Electronics("Laptop", 999.99);
        Product milk = new Grocery("Milk", 3.99);
        
        System.out.println("=== Products ===");
        laptop.displayDetails();
        System.out.println();
        milk.displayDetails();
    }
}