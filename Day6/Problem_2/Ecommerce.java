package Day6.Problem_2;
import java.util.List;

// Abstract class Product to define the basic structure for all products
abstract class Product {
    // Fields of abstract class Product
    private Long productId;
    private String name;
    private double price;

    // Constructor to initialize the product details
    public Product(Long productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters for encapsulation
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method for calculating the discount, to be implemented by subclasses
    abstract double calculateDiscount();
}

// Interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
interface Taxable {
    // Method to calculate the tax for a product
    public double calculateTax();

    // Method to get tax details for a product
    public String getTaxDetails();
}

// Concrete class Electronics, extends Product and implements Taxable
class Electronics extends Product implements Taxable {
    // Additional fields for Electronics
    private String waranty;
    private int discount;

    // Constructor to initialize Electronics product
    public Electronics(Long productId, String name, double price, String waranty, int discount) {
        super(productId, name, price);
        this.waranty = waranty;
        this.discount = discount;
    }

    // Override calculateDiscount to apply discount for Electronics (as a percentage)
    @Override
    double calculateDiscount() {
        return getPrice() * (discount / 100.0);
    }

    // Override calculateTax to apply 15% tax for Electronics
    @Override
    public double calculateTax() {
        return getPrice() * 0.15; // 15% tax
    }

    // Override getTaxDetails to provide details for Electronics tax
    @Override
    public String getTaxDetails() {
        return "Electronics have a 15% tax.";
    }
}

// Concrete class Groceries, extends Product and implements Taxable
class Groceries extends Product implements Taxable {
    // Additional fields for Groceries
    private String expirationDate;
    private int discount;

    // Constructor to initialize Groceries product
    public Groceries(Long productId, String name, double price, String expirationDate, int discount) {
        super(productId, name, price);
        this.expirationDate = expirationDate;
        this.discount = discount;
    }

    // Override calculateDiscount to apply discount for Groceries (as a percentage)
    @Override
    double calculateDiscount() {
        return getPrice() * (discount / 100.0);
    }

    // Override calculateTax to apply 20% tax for Groceries
    @Override
    public double calculateTax() {
        return getPrice() * 0.20; // 20% tax
    }

    // Override getTaxDetails to provide details for Groceries tax
    @Override
    public String getTaxDetails() {
        return "Groceries have a 20% tax.";
    }
}

// Concrete class Clothing, extends Product (does not implement Taxable)
class Clothing extends Product {
    // Additional fields for Clothing
    private double sizeOfCloth;
    private int discount;

    // Constructor to initialize Clothing product
    public Clothing(Long productId, String name, double price, double sizeOfCloth, int discount) {
        super(productId, name, price);
        this.sizeOfCloth = sizeOfCloth;
        this.discount = discount;
    }

    // Override calculateDiscount to apply discount for Clothing (as a percentage)
    @Override
    double calculateDiscount() {
        return getPrice() * (discount / 100.0);
    }
}

// Main class Ecommerce to run the e-commerce platform
public class Ecommerce {
    public static void main(String[] args) {
        // Create product objects for different types of products (Electronics, Groceries, Clothing)
        Product electronic = new Electronics(2L, "Washing Machine", 15000, "2 year", 10); // Electronics with 10% discount
        Product groceries = new Groceries(3L, "Tata salt", 20, "4-11-2027", 3); // Groceries with 3% discount
        Product clothing = new Clothing(4L, "T-Shirt", 1300, 2.5, 25); // Clothing with 25% discount

        // List to store products (polymorphism in action, list holds different types of Product)
        List<Product> products = List.of(electronic, groceries, clothing);

        // Iterate through the list of products and calculate the final price for each product
        for (Product product : products) {
            double tax = 0;

            // Check if the product is taxable (instance of Taxable interface)
            if (product instanceof Taxable) {
                // Calculate the tax if the product is taxable
                tax = ((Taxable) product).calculateTax();
            }

            // Calculate the final price: price + tax - discount
            double finalPrice = product.getPrice() + tax - product.calculateDiscount();

            // Print product details and final price
            System.out.println("Product: " + product.getName());
            System.out.println("Final Price: $" + finalPrice);

            // If the product is taxable, print tax details
            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
            }

            // Print a blank line for better readability
            System.out.println();
        }
    }
}
