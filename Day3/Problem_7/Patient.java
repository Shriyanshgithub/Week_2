package Day3.Problem_7;

public class Patient {
    // Static variable for the name of the hospital (shared by all students)
    static String hospitalName = "ABC Hospital";

    String name;  // Instance variables
    int age;  // Instance variables
    String ailment;  // Instance variables

    // Final variable for PatientID (cannot be changed after initialization)
    final int patientID;
    static int totalPatients;

    // Constructor to initialize the patients object
    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    // Static method to display the total number of patients
    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    // Method to display the details of a patients
    void displayDetails() {
        System.out.println("Hospital Name: "+ hospitalName);
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        System.out.println("ailment: " + ailment);
        System.out.println("Patients ID : "+ patientID );
    }
}


 class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create a new patient object
        Patient p1 = new Patient("Golu", 21, "BP", 1);
        if(p1 instanceof Patient){
            p1.displayDetails();
            Patient.getTotalPatients();
      }


        }
}
