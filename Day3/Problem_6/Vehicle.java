package Day3.Problem_6;

public class Vehicle {
    // Static variable for registration fee (common for all vehicles)
    static int registrationFee;
    String ownerName; // Instance variables
    String vehicleType;// Instance variables

    // Final variable for registration number (cannot be changed after initialization)
    final int registrationNumber;

    // Constructor to initialize the vehicle object
    Vehicle(int registrationFee, String ownerName, String vehicleType, int registrationNumber) {
        // Initialize the final registration number
        this.registrationNumber = registrationNumber;

        this.vehicleType = vehicleType;
        this.ownerName = ownerName;

        // Set the static registration fee
        this.registrationFee = registrationFee;
    }

    // Static method to update the registration fee (affects all vehicles)
    static void updateRegistrationFee(int newRegistrationFee) {
        registrationFee = newRegistrationFee;
        System.out.println("Updated Registration Fee: " + newRegistrationFee);
    }

    // Method to display the details of the vehicle
    void displayDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println("Registration Number: " + registrationNumber);
    }
}
 class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Create a new Vehicle object
        Vehicle v1 = new Vehicle(1000, "Pradeep", "XUV700", 12321);

        // Check if the object is an instance of the Vehicle class
        if (v1 instanceof Vehicle) {
            // Display the details of the vehicle
            v1.displayDetails();

            // Update the registration fee
            Vehicle.updateRegistrationFee(1200);
                }
        }
}
