package Day5.Hierarchical.Problem_1;

// Base class: Person
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Display common details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to be overridden by subclasses
    public void displayRole() {
        System.out.println("Role: General Person");
    }
}

// Subclass: Teacher
class Teacher extends Person {
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Getters and Setters
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Override displayRole
    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
    }

    // Display additional details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

// Subclass: Student
class Student extends Person {
    private String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    // Getters and Setters
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Override displayRole
    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }

    // Display additional details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}

// Subclass: Staff
class Staff extends Person {
    private String department;

    // Constructor
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Getters and Setters
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Override displayRole
    @Override
    public void displayRole() {
        System.out.println("Role: Staff");
    }

    // Display additional details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

// Main class to test the school system
public class SchoolSystemDemo {
    public static void main(String[] args) {
        // Create a Teacher object
        Teacher teacher = new Teacher("Alice Johnson", 35, "Mathematics");
        teacher.displayRole();
        teacher.displayDetails();

        System.out.println();

        // Create a Student object
        Student student = new Student("John Smith", 16, "10th Grade");
        student.displayRole();
        student.displayDetails();

        System.out.println();

        // Create a Staff object
        Staff staff = new Staff("Robert Brown", 45, "Administration");
        staff.displayRole();
        staff.displayDetails();
    }
}
