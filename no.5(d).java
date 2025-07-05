// Base class
abstract class TaxCategory {
    abstract double calculateVAT(double amount);
}

// Subclass for Retailer
class Retailer extends TaxCategory {
    private static final double VAT_RATE = 0.18; // 18%

    @Override
    double calculateVAT(double amount) {
        return amount * VAT_RATE;
    }
}

// Subclass for Wholesaler
class Wholesaler extends TaxCategory {
    private static final double VAT_RATE = 0.15; // 15%

    @Override
    double calculateVAT(double amount) {
        return amount * VAT_RATE;
    }
}

// Subclass for Importer
class Importer extends TaxCategory {
    private static final double VAT_RATE = 0.10; // 10%

    @Override
    double calculateVAT(double amount) {
        return amount * VAT_RATE;
    }
}

// Main class to demonstrate runtime polymorphism
public class TaxCalculatorDemo {
    public static void main(String[] args) {
        // Array of TaxCategory objects
        TaxCategory[] taxCategories = new TaxCategory[3];
        taxCategories[0] = new Retailer();
        taxCategories[1] = new Wholesaler();
        taxCategories[2] = new Importer();

        // Transaction amounts to calculate VAT for
        double[] transactionAmounts = {1000.0, 2000.0, 3000.0};

        // Calculate and display VAT for each category and transaction amount
        for (TaxCategory category : taxCategories) {
            for (double amount : transactionAmounts) {
                System.out.println("VAT for " + category.getClass().getSimpleName() + " on amount " + amount + ": " + category.calculateVAT(amount));
            }
        }
    }
}
