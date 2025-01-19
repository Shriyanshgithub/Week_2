package Day2.Instance_VS_Class.Problem_3;

public class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable (shared by all instances)
    private static double registrationFee = 500.0;  // Fixed registration fee

    // Constructor to initialize ownerName and vehicleType
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class method to update registration fee (affects all instances)
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: " + registrationFee);
    }

    public static void main(String[] args) {
        // Creating instances of Vehicle class
        Vehicle vehicle1 = new Vehicle("Alice", "Car");
        Vehicle vehicle2 = new Vehicle("Bob", "Bike");

        // Display details of each vehicle
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
        System.out.println();

        // Updating the registration fee
        Vehicle.updateRegistrationFee(600.0);

        // Displaying details again after updating registration fee
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
    }
}

