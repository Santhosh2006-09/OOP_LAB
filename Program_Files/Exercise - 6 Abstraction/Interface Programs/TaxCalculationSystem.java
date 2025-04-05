interface Tax {
    void calculateTax();
}

class IndividualTax implements Tax {
    public void calculateTax() {
        System.out.println("Calculating tax for an individual...");
    }
}

class BusinessTax implements Tax {
    public void calculateTax() {
        System.out.println("Calculating tax for a business...");
    }
}

public class TaxCalculationSystem {
    public static void main(String[] args) {
        Tax individual = new IndividualTax();
        Tax business = new BusinessTax();

        individual.calculateTax();
        business.calculateTax();
    }
}
