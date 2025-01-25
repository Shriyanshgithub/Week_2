package Day6.Problem_8;

import java.util.Random;

// Abstract class Vehicle
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Abstract method to calculate fare based on distance
    public abstract double calculateFare(double distance);

    // Concrete method to get vehicle details
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }

    // Getters and setters
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }
}

// Interface for GPS functionality
interface GPS {
    String getCurrentLocation();

    void updateLocation(String newLocation);
}

// Subclass for Car
class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm(); // Fare is directly proportional to rate per km
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

// Subclass for Bike
class Bike extends Vehicle implements GPS {
    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.9; // Bikes offer a 10% discount
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

// Subclass for Auto
class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 10; // Fixed base fare of 10
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

// Main class for testing
public class RideHailingApplication {
    public static void main(String[] args) {
        // Create vehicles
        Vehicle car = new Car("C001", "shriyansh", 15, "Downtown");
        Vehicle bike = new Bike("B001", "himanshu", 10, "City Center");
        Vehicle auto = new Auto("A001", "siddhu", 8, "Suburbs");

        // Array of vehicles for dynamic handling
        Vehicle[] vehicles = { car, bike, auto };

        // Random distance for the trip
        double distance = new Random().nextDouble() * 20 + 5; // Between 5 and 25 km

        System.out.printf("Trip Distance: %.2f km\n\n", distance);

        // Display details and calculate fare dynamically
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            if (vehicle instanceof GPS) {
                System.out.println("Current Location: " + ((GPS) vehicle).getCurrentLocation());
            }
            System.out.printf("Fare for %.2f km: %.2f\n\n", distance, vehicle.calculateFare(distance));
        }
    }
}
