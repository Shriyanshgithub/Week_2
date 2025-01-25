package Day6.Problem_3;

import java.util.List;

// Abstract class Vehicle
abstract class Vehicle {
    // Fields of the Vehicle class (encapsulation applied by making them private)
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor to initialize the vehicle details
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getter and Setter methods for encapsulation
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    // Abstract method to calculate rental cost, to be implemented by subclasses
    public abstract double calculateRentalCost(int days);
}

// Interface Insurable
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Subclass Car (inherits from Vehicle and implements Insurable)
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber; // Encapsulated sensitive information

    public Car(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Implementing the abstract method to calculate rental cost for Car
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days; // Basic rental calculation for car
    }

    // Implementing methods from Insurable interface
    @Override
    public double calculateInsurance() {
        return 0.05 * getRentalRate(); // 5% of the rental rate for car insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + insurancePolicyNumber + " (Car Insurance)";
    }
}

// Subclass Bike (inherits from Vehicle and implements Insurable)
class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Implementing the abstract method to calculate rental cost for Bike
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days; // Basic rental calculation for bike
    }

    // Implementing methods from Insurable interface
    @Override
    public double calculateInsurance() {
        return 0.03 * getRentalRate(); // 3% of the rental rate for bike insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + insurancePolicyNumber + " (Bike Insurance)";
    }
}

// Subclass Truck (inherits from Vehicle and implements Insurable)
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Implementing the abstract method to calculate rental cost for Truck
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5; // Truck rental is more expensive, multiply by 1.5
    }

    // Implementing methods from Insurable interface
    @Override
    public double calculateInsurance() {
        return 0.07 * getRentalRate(); // 7% of the rental rate for truck insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + insurancePolicyNumber + " (Truck Insurance)";
    }
}

// Main class VehicleRentalSystem to demonstrate the system
public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Create different types of vehicles
        Vehicle car = new Car("CAR123", "Car", 100, "INS1234");
        Vehicle bike = new Bike("BIKE567", "Bike", 30, "INS5678");
        Vehicle truck = new Truck("TRUCK789", "Truck", 200, "INS9101");

        // List to store all the vehicles
        List<Vehicle> vehicles = List.of(car, bike, truck);

        // Iterate over the list of vehicles and calculate rental and insurance costs
        for (Vehicle vehicle : vehicles) {
            int rentalDays = 5; // Example: Rent for 5 days

            // Calculate rental cost for each vehicle
            double rentalCost = vehicle.calculateRentalCost(rentalDays);

            // Initialize tax and insurance cost
            double insuranceCost = 0;

            // Check if the vehicle is insurable (i.e., implements the Insurable interface)
            if (vehicle instanceof Insurable) {
                insuranceCost = ((Insurable) vehicle).calculateInsurance();
            }

            // Calculate the total cost for the vehicle (rental + insurance)
            double totalCost = rentalCost + insuranceCost;

            // Print vehicle details and cost breakdown
            System.out.println("Vehicle: " + vehicle.getType());
            System.out.println("Rental Cost for " + rentalDays + " days: $" + rentalCost);
            System.out.println("Insurance Cost: $" + insuranceCost);
            System.out.println("Total Cost: $" + totalCost);

            // If the vehicle is insurable, print the insurance details
            if (vehicle instanceof Insurable) {
                System.out.println(((Insurable) vehicle).getInsuranceDetails());
            }

            System.out.println();
        }
    }
}

