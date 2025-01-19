package Day2.Access_Modifier.Problem_4;

// Base class: Employee
class Employee {
    // Instance variables
    public String employeeID;    // Public variable
    protected String department;  // Protected variable
    private double salary;        // Private variable

    // Constructor to initialize employee details
    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Subclass: Manager (Inheriting from Employee)
class Manager extends Employee {
    // Constructor for Manager
    public Manager(String employeeID, String department, double salary) {
        // Calling the superclass constructor
        super(employeeID, department, salary);
    }

    // Method to display manager details (Demonstrating access to employeeID and department)
    public void displayManagerDetails() {
        // Accessing public employeeID and protected department from parent class
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);  // Accessing public employeeID
        System.out.println("Department: " + department);  // Accessing protected department
        System.out.println("Salary: " + getSalary());    // Accessing private salary through getter method
    }
}

class Main {
    public static void main(String[] args) {
        // Creating an object of Manager class
        Manager manager = new Manager("M123", "Sales", 75000.00);

        // Displaying manager details
        manager.displayManagerDetails();

        // Modifying salary using the setter method
        manager.setSalary(80000.00);

        // Displaying updated manager details
        System.out.println("\nUpdated Manager Details:");
        manager.displayManagerDetails();
    }
}

