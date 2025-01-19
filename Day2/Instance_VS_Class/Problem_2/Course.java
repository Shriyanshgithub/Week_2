package Day2.Instance_VS_Class.Problem_2;

public class Course {
    private static String instituteName = "Technocrats Institute of technology"; // Static variable for the institute name
    private String courseName;
    private int duration;
    private int fee;

    // Default constructor
    Course(){}

    // Setter methods for courseName, duration, and fee
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    // Method to display the course details, including the institute name (static)
    public void displayCourseDetails(){
        System.out.println("Course name : " + courseName);
        System.out.println("Course duration in year : " + duration);
        System.out.println("Fee of course :" + fee);
        System.out.println("Institute name : " + instituteName); // Displays the static variable value
    }

    // Static method to update the institute name (affects all instances)
    public static void updateInstituteName(String newInstituteName){
        instituteName = newInstituteName; // Updates the static variable instituteName
    }

}

class Main{
    public static void main(String[] args) {
        // Creating a course object and setting its details
        Course course1 = new Course();
        course1.setCourseName("Web Development");
        course1.setDuration(2);
        course1.setFee(2000);

        // Updating the static variable 'instituteName' for all instances of Course
        Course.updateInstituteName("Technocratts Institute of technology (Excellence)");

        // Displaying the course details including the updated institute name
        course1.displayCourseDetails(); // Displays the updated institute name and course details
    }
}
