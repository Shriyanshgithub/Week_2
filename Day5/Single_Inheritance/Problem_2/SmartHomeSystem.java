package Day5.Single_Inheritance.Problem_2;

// Superclass: Device
class Device {
    String deviceId;
    String status;

    // Constructor for Device class
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display general device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass: Thermostat that extends Device
class Thermostat extends Device {
    int temperatureSetting;

    // Constructor for Thermostat class
    public Thermostat(String deviceId, String status, int temperatureSetting) {
        // Call the superclass constructor (Device)
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Override displayStatus to show both general device status and thermostat settings
    @Override
    public void displayStatus() {
        // Call the superclass method to display general device status
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class to test the Device and Thermostat classes
public class SmartHomeSystem {
    public static void main(String[] args) {
        // Create a Thermostat object with device details and temperature setting
        Thermostat thermostat1 = new Thermostat("T1234", "ON", 22);

        // Display the status of the thermostat (device + specific thermostat settings)
        thermostat1.displayStatus();
    }
}

