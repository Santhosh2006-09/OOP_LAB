class Food {
    String name = "Generic Food";
    
    void prepare() {
        System.out.println(name + " is being prepared.");
    }
}

class Pizza extends Food {
    void addToppings() {
        System.out.println("Adding cheese and pepperoni.");
    }
}

class Burger extends Food {
    void addSauce() {
        System.out.println("Adding ketchup and mustard.");
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.name = "Pepperoni Pizza";
        pizza.prepare();
        pizza.addToppings();

        Burger burger = new Burger();
        burger.name = "Cheese Burger";
        burger.prepare();
        burger.addSauce();
    }
}
