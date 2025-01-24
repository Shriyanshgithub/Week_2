package Day5.Multilevel_Inheritance.Problem_1;

// Base class: Order
class Order {
    String orderId;
    String orderDate;

    // Constructor for Order class
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get order status (Base method)
    public String getOrderStatus() {
        return "Order placed on " + orderDate + " with ID: " + orderId;
    }
}

// Subclass: ShippedOrder that extends Order
class ShippedOrder extends Order {
    String trackingNumber;

    // Constructor for ShippedOrder class
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        // Call the superclass constructor (Order)
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Override getOrderStatus to show shipping status
    @Override
    public String getOrderStatus() {
        return super.getOrderStatus() + " - Shipped with Tracking Number: " + trackingNumber;
    }
}

// Subclass: DeliveredOrder that extends ShippedOrder
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    // Constructor for DeliveredOrder class
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        // Call the superclass constructor (ShippedOrder)
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Override getOrderStatus to show delivery status
    @Override
    public String getOrderStatus() {
        return super.getOrderStatus() + " - Delivered on " + deliveryDate;
    }
}

// Main class to test the Order management system
public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        // Create an Order object
        Order order1 = new Order("ORD123", "2025-01-15");
        System.out.println(order1.getOrderStatus());  // Order placed

        // Create a ShippedOrder object
        ShippedOrder shippedOrder1 = new ShippedOrder("ORD124", "2025-01-16", "TRACK456");
        System.out.println(shippedOrder1.getOrderStatus());  // Shipped order with tracking

        // Create a DeliveredOrder object
        DeliveredOrder deliveredOrder1 = new DeliveredOrder("ORD125", "2025-01-17", "TRACK789", "2025-01-20");
        System.out.println(deliveredOrder1.getOrderStatus());  // Delivered order with delivery date
    }
}

