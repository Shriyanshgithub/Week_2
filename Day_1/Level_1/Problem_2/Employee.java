package Day_1.Level_1.Problem_2;

//Declare the Employee class
public class Employee {

    //Attribute of Employee
    private String name;
    private long id;
    private int salary;

     // construtor
    public Employee(){}

     //create the getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Name : " + name + ", id:" + id + " , salary: " + salary;
    }



}

//Declare the another class called main class
 class Main{
     public static void main(String[] args) {
        // Create the object of class Employee and call the constructor
       Employee employee1 = new Employee();

       //set the the name , id , salary
       employee1.setName("Shriyansh");
       employee1.setId(1);
       employee1.setSalary(1000000);
         System.out.println(employee1);
     }
 }
