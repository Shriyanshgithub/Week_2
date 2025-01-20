package Day3.Problem_4;

// Import Scanner class for user input
import java.util.Scanner;

// Product class to store and manage product details
class Product {
    private static int discount = 5; // Static discount applicable to all products
    private final int productID; // Unique product ID (final value)
    private String productName; // Product name
    private double price; // Product price
    private int quantity; // Product quantity

    // Constructor to initialize product details
    Product(String productName, double price, int quantity, int productID){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Method to update the static discount
    public static void updateDiscount(int discount){
        Product.discount = discount;
    }

    // Method to display product details
    public void displayProductDetails(){
        System.out.println("Product ID : " + productID);
        System.out.println("ProductName : " + productName);
        System.out.println("Price of product :" + price);
        System.out.println("Quantity of product :" + quantity);
    }
}

// Main class to run the program
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object for input

        // Input for product details
        System.out.println("Enter the product name");
        String name = sc.next();
        System.out.println("Enter the quantity");
        int quantity = sc.nextInt();

        // Generate random price and product ID
        double price = Math.round((Math.random()*900) + 100);
        int id = (int)Math.round(Math.random() * 10);

        // Create a Product object
        Product product1 = new Product(name, price, quantity, id);

        // Check if product1 is an instance of Product
        if(product1 instanceof Product){
            System.out.println("product1 is an instance of Product");
        }

        // Display product details
        product1.displayProductDetails();

        // Update discount and display updated product details
        Product.updateDiscount(10);
        product1.displayProductDetails();
    }
}
