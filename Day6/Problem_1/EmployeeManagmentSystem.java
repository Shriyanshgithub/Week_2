package Day6.Problem_1;
import java.util.*;


abstract class Employee{
    private Long employeeId;
    private String name;
    private double baseSalary;

    public Employee(Long employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();

    public void displayDetails(){
        System.out.println("The id of employee is : " + employeeId);
        System.out.println("The name of employee is : 0" + name);
        System.out.println("The base salary of employee is  : " + baseSalary);
        System.out.println("The calculated salary is : " + calculateSalary());
    }

    public Long getEmployeeId() {

        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {

        this.employeeId = employeeId;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getBaseSalary() {

        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {

        this.baseSalary = baseSalary;
    }
}

class FullTimeEmployee extends Employee implements Department{
    private double fixedSalary;
    private String department;
    public FullTimeEmployee(Long employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;

    }

    @Override
    double calculateSalary(){
        return fixedSalary;
    }

    @Override
     public void assignDepartment(String department){
        this.department = department;
    }

    @Override
    public String getDepartmentDetails(){
        return department;
    }

}

//subclass Parttime Employee extends Employee implements Department
class PartTimeEmployee extends Employee implements Department{
    private int workHour;
    private int payPerHour;
    private String department;
    public PartTimeEmployee(Long employeeId, String name, double baseSalary, int workHour, int payPerHour) {
        super(employeeId, name, baseSalary);
        this.workHour = workHour;
        this.payPerHour = payPerHour;
    }

    //override the abstract method
    @Override
    double calculateSalary(){
        return workHour*payPerHour;
    }

    //overrode the abstract method of interface
    @Override
    public void assignDepartment(String department) {

        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {

        return department;
    }

    public void display(){

        System.out.println("The salary of intern is : " + calculateSalary());
    }
}

//interface
interface Department{
    //abstract method
    void assignDepartment(String department);

    //abstract method
    String getDepartmentDetails();
}

//Main class
public class EmployeeManagmentSystem {
    public static void main(String[] args) {
        //Initialize the object
        FullTimeEmployee himanshu = new FullTimeEmployee(2L, "Himanshu", 20000, 25000);
        PartTimeEmployee subham = new PartTimeEmployee(9L,"Subham" , 1000,5,50);

        //assign the department
        himanshu.assignDepartment("HR");
        subham.assignDepartment("Marketing");

        // Create list of employees
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(himanshu);
        employees.add(subham);

        himanshu.calculateSalary();
        subham.calculateSalary();

        subham.display();

        //display the employee
        for(Employee employee : employees){
            employee.displayDetails();
            if (employee instanceof Department) {
                System.out.println(((Department) employee).getDepartmentDetails());
            }
            System.out.println("--------------------------------");
        }
        }

    }
