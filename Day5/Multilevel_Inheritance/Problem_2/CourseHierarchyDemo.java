package Day5.Multilevel_Inheritance.Problem_2;

// Base class: Course
class Course {
    private String courseName;
    private int duration; // duration in hours

    // Constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Getters and Setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Display course details
    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

// Subclass: OnlineCourse
class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    // Constructor
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Getters and Setters
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public boolean isRecorded() {
        return isRecorded;
    }

    public void setRecorded(boolean isRecorded) {
        this.isRecorded = isRecorded;
    }

    // Override displayDetails to include additional attributes
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Is Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass: PaidOnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // discount as a percentage

    // Constructor
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Getters and Setters
    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    // Calculate the final fee after discount
    public double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }

    // Override displayDetails to include fee and discount
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: $" + calculateFinalFee());
    }
}

// Main class to test the hierarchy
public class CourseHierarchyDemo {
    public static void main(String[] args) {
        // Create a Course object
        Course basicCourse = new Course("Introduction to Programming", 10);
        basicCourse.displayDetails();

        System.out.println();

        // Create an OnlineCourse object
        OnlineCourse onlineCourse = new OnlineCourse("Java Programming", 20, "Udemy", true);
        onlineCourse.displayDetails();

        System.out.println();

        // Create a PaidOnlineCourse object
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced Java", 30, "Coursera", false, 199.99, 20);
        paidCourse.displayDetails();
    }
}

