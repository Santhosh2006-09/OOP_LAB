class MenuItem {
    protected String name;
    protected double price;
    
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public void prepare() {
        System.out.println("Preparing " + name);
    }
    
    public void serve() {
        System.out.println("Serving " + name + " ($" + price + ")");
    }
}

class Pizza extends MenuItem {
    private String crustType;
    
    public Pizza(String name, double price, String crustType) {
        super(name, price);
        this.crustType = crustType;
    }
    
    @Override
    public void prepare() {
        System.out.println("Making " + crustType + " crust pizza: " + name);
        addToppings();
        bake();
    }
    
    private void bake() {
        System.out.println("Baking at 400°F for 15 minutes");
    }
    
    private void addToppings() {
        System.out.println("Adding toppings...");
    }
}

class Drink extends MenuItem {
    private boolean isAlcoholic;
    
    public Drink(String name, double price, boolean isAlcoholic) {
        super(name, price);
        this.isAlcoholic = isAlcoholic;
    }
    
    @Override
    public void serve() {
        super.serve();
        if (isAlcoholic) {
            System.out.println("Checking ID...");
        }
        System.out.println("Adding straw");
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        MenuItem margherita = new Pizza("Margherita", 12.99, "thin");
        MenuItem cola = new Drink("Cola", 2.99, false);
        MenuItem beer = new Drink("Craft Beer", 6.99, true);
        
        System.out.println("=== Order Processing ===");
        processOrder(margherita);
        processOrder(cola);
        processOrder(beer);
    }
    
    public static void processOrder(MenuItem item) {
        item.prepare();
        item.serve();
        System.out.println("------");
    }
}