package Day5.Hybrid_Inheritance.Problem_1;



// Superclass: Person
class Person {
    private String name;
    private int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface: Worker
interface Worker {
    void performDuties(); // Abstract method to be implemented by subclasses
}

// Subclass: Chef
class Chef extends Person implements Worker {
    private String specialty;

    // Constructor
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    // Getters and Setters
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    // Implement performDuties from Worker
    @Override
    public void performDuties() {
        System.out.println(getName() + " is preparing dishes with a specialty in " + specialty + ".");
    }

    // Display additional details for Chef
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialty: " + specialty);
    }
}

// Subclass: Waiter
class Waiter extends Person implements Worker {
    private String assignedSection;

    // Constructor
    public Waiter(String name, int id, String assignedSection) {
        super(name, id);
        this.assignedSection = assignedSection;
    }

    // Getters and Setters
    public String getAssignedSection() {
        return assignedSection;
    }

    public void setAssignedSection(String assignedSection) {
        this.assignedSection = assignedSection;
    }

    // Implement performDuties from Worker
    @Override
    public void performDuties() {
        System.out.println(getName() + " is serving customers in the " + assignedSection + " section.");
    }

    // Display additional details for Waiter
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Assigned Section: " + assignedSection);
    }
}

// Main class to test the system
public class RestaurantManagementDemo {
    public static void main(String[] args) {
        // Create a Chef object
        Chef chef = new Chef("Gordon Ramsay", 101, "Italian Cuisine");
        chef.displayDetails();
        chef.performDuties();

        System.out.println();

        // Create a Waiter object
        Waiter waiter = new Waiter("John Doe", 201, "Outdoor Seating");
        waiter.displayDetails();
        waiter.performDuties();
    }

}
