package Day3.Problem_5;

class Student {
    // Static variable for the name of the university (shared by all students)
    static String universityName;

    String name;  // Instance variables
    int rollNumber;  // Instance variables
    char grade;  // Instance variables

    // Static variable to keep track of the total number of students
    static int totalStudent;

    // Constructor to initialize the student object
    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudent++;
    }

    // Static method to display the total number of students
    static void displayTotalStudent() {
        System.out.println("Total Student: " + totalStudent);
    }

    // Method to display the details of a student
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}

 class UniversityStudentManagement {
    public static void main(String[] args) {
        // Create a new student object
        Student s1 = new Student("Pradeep", 121, 'A');

        // Check if the object is an instance of the Student class
        if (s1 instanceof Student) {
            // Display the details of the student
            s1.displayDetails();

            // Display the total number of students
            Student.displayTotalStudent();
                }
        }
}