package Day6.Problem_7;

import java.util.ArrayList;
import java.util.List;

// Abstract class Patient
abstract class Patient {
    // Protected fields to allow access within subclasses
    private String patientId;
    private String name;
    private int age;

    // Constructor
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract method to calculate the bill (to be implemented by subclasses)
    public abstract double calculateBill();

    // Concrete method to get patient details
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Getters and setters
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

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
}

// Interface for handling medical records
interface MedicalRecord {
    void addRecord(String record);

    List<String> viewRecords();
}

// Subclass for InPatients
class InPatient extends Patient implements MedicalRecord {
    private double roomCharges;
    private int numberOfDays;
    private List<String> medicalRecords = new ArrayList<>(); // List to store medical records

    // Constructor
    public InPatient(String patientId, String name, int age, double roomCharges, int numberOfDays) {
        super(patientId, name, age);
        this.roomCharges = roomCharges;
        this.numberOfDays = numberOfDays;
    }

    // Overriding calculateBill() to include room charges and other expenses
    @Override
    public double calculateBill() {
        return roomCharges * numberOfDays;
    }

    // Implementing methods from the MedicalRecord interface
    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return medicalRecords;
    }

    // Getters and setters for encapsulated fields
    public double getRoomCharges() {
        return roomCharges;
    }

    public void setRoomCharges(double roomCharges) {
        this.roomCharges = roomCharges;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
}

// Subclass for OutPatients
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> medicalRecords = new ArrayList<>(); // List to store medical records

    // Constructor
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    // Overriding calculateBill() to include only the consultation fee
    @Override
    public double calculateBill() {
        return consultationFee;
    }

    // Implementing methods from the MedicalRecord interface
    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return medicalRecords;
    }

    // Getters and setters for encapsulated fields
    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }
}

// Main class for testing
public class HospitalPatientManagement {
    public static void main(String[] args) {
        // Creating an InPatient
        InPatient inPatient = new InPatient("P001", "John Doe", 45, 2000, 5); // Total = 2000 * 5 = 10000
        inPatient.addRecord("Admitted for surgery");
        inPatient.addRecord("Underwent appendectomy");

        // Creating an OutPatient
        OutPatient outPatient = new OutPatient("P002", "Jane Smith", 30, 500); // Total = 500
        outPatient.addRecord("Consulted for flu symptoms");

        // List of patients (using polymorphism)
        List<Patient> patients = List.of(inPatient, outPatient);

        // Displaying details dynamically
        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Total Bill: " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                // Viewing medical records
                List<String> records = ((MedicalRecord) patient).viewRecords();
                System.out.println("Medical Records:");
                for (String record : records) {
                    System.out.println("- " + record);
                }
            }

            System.out.println();
        }
    }
}

