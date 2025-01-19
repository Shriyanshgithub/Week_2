package Day2.Access_Modifier.Problem_1;

// Base class: Student
class Student {
    // Instance variables
    public int rollNumber;  // public variable
    protected String name;   // protected variable
    private double CGPA;     // private variable

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass: PostgraduateStudent (Inheriting from Student)
class PostgraduateStudent extends Student {
    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        // Calling the superclass constructor
        super(rollNumber, name, CGPA);
    }

    // Method to display postgraduate student details (Demonstrates protected member access)
    public void displayPostgraduateDetails() {
        // Accessing the protected 'name' variable from the base class
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);  // Inherited protected member
        System.out.println("CGPA: " + getCGPA());  // Accessing private 'CGPA' through public getter
    }
}

 class Main {
    public static void main(String[] args) {
        // Creating an object of PostgraduateStudent
        PostgraduateStudent pgStudent = new PostgraduateStudent(101, "Alice", 8.5);

        // Displaying student details using the subclass method
        pgStudent.displayPostgraduateDetails();

        // Accessing and modifying CGPA through public methods
        System.out.println("\nUpdating CGPA...");
        pgStudent.setCGPA(9.0);  // Modifying CGPA
        System.out.println("Updated CGPA: " + pgStudent.getCGPA());

        // Displaying updated details
        System.out.println("\nUpdated Postgraduate Student Details:");
        pgStudent.displayPostgraduateDetails();
    }
}

