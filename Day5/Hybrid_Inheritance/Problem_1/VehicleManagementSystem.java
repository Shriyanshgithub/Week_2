package Day5.Hybrid_Inheritance.Problem_1;

// 1. Superclass: Vehicle
class Vehicle {
    private String model;
    private int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

// 2. Interface: Refuelable
interface Refuelable {
    void refuel();
}

// 3. Subclass: ElectricVehicle
class ElectricVehicle extends Vehicle {
    private int batteryLevel;

    public ElectricVehicle(String model, int maxSpeed, int batteryLevel) {
        super(model, maxSpeed);
        this.batteryLevel = batteryLevel;
    }

    public void charge() {
        System.out.println("Charging the electric vehicle...");
        batteryLevel = 100;  // Assume full charge
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Level: " + batteryLevel + "%");
    }
}

// 4. Subclass: PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelLevel;

    public PetrolVehicle(String model, int maxSpeed, int fuelLevel) {
        super(model, maxSpeed);
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle...");
        fuelLevel = 100;  // Assume full tank
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Level: " + fuelLevel + "%");
    }
}

// Main class to test the implementation
public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model X", 250, 80);
        PetrolVehicle pv = new PetrolVehicle("Toyota Corolla", 180, 50);

        // Display information
        ev.displayInfo();
        pv.displayInfo();

        // Refuel and charge
        ev.charge();  // Charging electric vehicle
        pv.refuel();  // Refueling petrol vehicle

        // Display updated info after charge and refuel
        System.out.println("\nAfter charging and refueling:\n");
        ev.displayInfo();
        pv.displayInfo();
    }
}

