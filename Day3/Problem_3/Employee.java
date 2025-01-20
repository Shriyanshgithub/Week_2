package Day3.Problem_3;

//import scanner class
import java.util.Scanner;

class Employee{
    //instance Attribute
    private String name;
    private final int ID;
    private String designation;

    //static attributes
    static int totalEmployees = 0;
    static String companyName = "Rajveer Technologies";

    //constructer to initialze variables
    public Employee(String name, int ID, String designation) {
        this.name = name;
        this.ID = ID;
        this.designation = designation;
        totalEmployees++;
    }
    //static method to show the total number of employees
    public static void displayTotalEmployees(){
        System.out.println("\ntotal number of empolyees - " + totalEmployees);
    }
    //method to display employee details
    public void displayDitails(){
        System.out.println("\nEmployee name - " + name +
                "\nID - " + ID +
                "\nDesignation - " + designation +
                "\nCompany - " + companyName);
    }
}

class EmployeeManagement {
    //main method
    public static void main(String[] args) {
        //create object of scanner class
        Scanner input = new Scanner(System.in);

        //get input
        System.out.println("Employee 1-");
        System.out.println("Enter name - ");
        String name1 = input.nextLine();
        System.out.println("Enter id - ");
        int ID1 = input.nextInt();
        input.nextLine();
        System.out.println("Enter Designation - ");
        String designation1 = input.nextLine();

        System.out.println("Employee 2-");
        System.out.println("Enter name - ");
        String name2 = input.nextLine();
        System.out.println("Enter id - ");
        int ID2 = input.nextInt();
        input.nextLine();
        System.out.println("Enter Designation - ");
        String designation2 = input.nextLine();

        //create object of Employee class
        Employee employee1 = new Employee(name1, ID1, designation1);
        Employee employee2 = new Employee(name2, ID2, designation2);

        //display total number of empoyees
        Employee.displayTotalEmployees();

        //Check if an employee object is an instance of the Employee
        if(employee1 instanceof Employee){
            employee1.displayDitails();
        }
        if(employee2 instanceof Employee) {
            employee2.displayDitails();
        }
        //close scanner object
        input.close();
    }
}

