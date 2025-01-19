import java.util.ArrayList;
import java.util.Iterator;

// CartItem class
class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor to initialize the CartItem
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to get the total cost for the item
    public double getTotalPrice() {
        return this.price * this.quantity;
    }

    @Override
    public String toString() {
        return itemName + " - Price: $" + price + ", Quantity: " + quantity + ", Total: $" + getTotalPrice();
    }
}

// ShoppingCart class
class ShoppingCart {
    private ArrayList<CartItem> items;

    // Constructor to initialize the shopping cart
    public ShoppingCart() {
        items = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(CartItem item) {
        items.add(item);
        System.out.println("Item added: " + item);
    }

    // Method to remove an item from the cart by item name
    public void removeItem(String itemName) {
        Iterator<CartItem> iterator = items.iterator();
        while (iterator.hasNext()) {
            CartItem item = iterator.next();
            if (item.itemName.equalsIgnoreCase(itemName)) {
                iterator.remove();
                System.out.println("Item removed: " + itemName);
                return;
            }
        }
        System.out.println("Item not found: " + itemName);
    }

    // Method to display the total cost of all items in the cart
    public void displayTotalCost() {
        double totalCost = 0;
        for (CartItem item : items) {
            totalCost += item.getTotalPrice();
        }
        System.out.println("Total Cost: $" + totalCost);
    }

    // Method to display all items in the cart
    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            for (CartItem item : items) {
                System.out.println(item);
            }
        }
    }
}

// Main class to test the ShoppingCart functionality
public class ShoppingCartSimulation {
    public static void main(String[] args) {
        // Create a shopping cart instance
        ShoppingCart cart = new ShoppingCart();

        // Create some cart items
        CartItem item1 = new CartItem("Laptop", 999.99, 1);
        CartItem item2 = new CartItem("Headphones", 199.99, 2);
        CartItem item3 = new CartItem("Keyboard", 49.99, 1);

        // Add items to the cart
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        // Display all items in the cart
        System.out.println("\nItems in the cart:");
        cart.displayItems();

        // Display the total cost of the cart
        cart.displayTotalCost();

        // Remove an item from the cart
        System.out.println("\nRemoving item: Headphones");
        cart.removeItem("Headphones");

        // Display items after removal
        System.out.println("\nItems in the cart after removal:");
        cart.displayItems();

        // Display the total cost again after removal
        cart.displayTotalCost();
    }
}
