package Day6.Problem_6;
import java.util.List;

// Abstract class
abstract class FoodItem {
    // Private attributes to store item details
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize the attributes
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method to be implemented by child classes for calculating total price
    public abstract double calculateTotalPrice();

    // Concrete method to display item details
    public void getItemDetails() {
        System.out.println("The name of items is : " + itemName);
        System.out.println("The price of item is : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total price of items is : " + calculateTotalPrice());
    }

    // Getter and Setter methods for item attributes
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

// Interface to define discount-related methods
interface Discountable {
    // Abstract method to apply a discount to the item
    public void applyDiscount();

    // Abstract method to check if a discount is applicable
    public boolean getDiscountDetails();
}

// VegItem class extending FoodItem and implementing Discountable interface
class VegItem extends FoodItem implements Discountable {
    private double discount; // Discount percentage

    // Constructor to initialize VegItem attributes
    public VegItem(String itemName, double price, int quantity, double discount) {
        super(itemName, price, quantity); // Calling parent class constructor
        this.discount = discount;
    }

    // Overriding calculateTotalPrice() to calculate total price for VegItem
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    // Overriding applyDiscount() to calculate and print discounted price
    @Override
    public void applyDiscount() {
        if (getDiscountDetails()) {
            double discountPrice = calculateTotalPrice() - calculateTotalPrice() * (discount / 100);
            System.out.println("Your final bill after discount is : " + discountPrice);
        } else {
            System.out.println("Discount is not applicable, your order price is less than 500.");
        }
    }

    // Overriding getDiscountDetails() to check if discount is applicable
    @Override
    public boolean getDiscountDetails() {
        if (calculateTotalPrice() > 500) {
            System.out.println("You get the discount of " + discount);
            return true;
        }
        return false;
    }

    // Getter and Setter for discount
    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}

// NonVegItem class extending FoodItem and implementing Discountable interface
class NonVegItem extends FoodItem implements Discountable {
    private double discount; // Discount percentage

    // Constructor to initialize NonVegItem attributes
    public NonVegItem(String itemName, double price, int quantity, double discount) {
        super(itemName, price, quantity); // Calling parent class constructor
        this.discount = discount;
    }

    // Overriding calculateTotalPrice() to calculate total price for NonVegItem
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    // Overriding applyDiscount() to calculate and print discounted price
    @Override
    public void applyDiscount() {
        if (getDiscountDetails()) {
            double discountPrice = calculateTotalPrice() - calculateTotalPrice() * (discount / 100);
            System.out.println("Your final bill after discount is : " + discountPrice);
        } else {
            System.out.println("Discount is not applicable, your order price is less than 500.");
        }
    }

    // Overriding getDiscountDetails() to check if discount is applicable
    @Override
    public boolean getDiscountDetails() {
        if (calculateTotalPrice() > 500) {
            System.out.println("You get the discount of " + discount);
            return true;
        }
        return false;
    }

    // Getter and Setter for discount
    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}

// Main class to run the FoodDeliverySystem
public class FoodDeliverySystem {
    public static void main(String[] args) {
        // Creating VegItem and NonVegItem objects
        FoodItem vegItem = new VegItem("Paneer", 150, 2, 5); // Total = 300
        FoodItem nonvegItem = new NonVegItem("Chicken Handi", 350, 3, 5); // Total = 1050

        // Adding items to a list
        List<FoodItem> foodItems = List.of(vegItem, nonvegItem);

        // Iterating over each item and displaying details
        for (FoodItem foodItem : foodItems) {
            foodItem.getItemDetails(); // Print basic details
            if (foodItem instanceof Discountable) { // Check if item is discountable
                ((Discountable) foodItem).getDiscountDetails(); // Print discount details
                ((Discountable) foodItem).applyDiscount(); // Apply and print discount
            }
            System.out.println();
        }
    }
}
