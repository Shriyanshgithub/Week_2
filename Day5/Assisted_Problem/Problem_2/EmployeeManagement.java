package Day5.Assisted_Problem.Problem_2;

//Employee Management System

//class Employee with attributes like name, id, and salary, and a method displayDetails().
class Employee{
    protected String name;
   protected  Long id;
    protected double salary;

    //No args constructor
    Employee(){

    }

    ////No args constructor
    public Employee(String name, Long id, double salary) {

        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display(){
        System.out.println("Employee name : " + name);
        System.out.println("Employee id : " + id);
        System.out.println("Employee salary : " + salary);
    }
}

class Manager extends Employee{
    int teamSize;

    //No args constructor
    Manager(){}

    ////No args constructor
    Manager(String name, Long id,  double salary,  int teamSize){
        super(name,id,salary);
        this.teamSize = teamSize;

    }

    @Override
    void display(){
        System.out.println("Manager name : " + this.name);
        System.out.println("Manager salary : " + this.salary);
        System.out.println("Manager id : " + this.id);
        System.out.println("Manager team size : " + teamSize);
    }
}
class Developer extends Employee{
    String programmingLang;

    //No args constructor
    Developer(){}

    ////No args constructor
    Developer( String name, Long id,  double salary, String programmingLang){
        super(name,id,salary);
        this.programmingLang = programmingLang;

    }

    @Override
    void display(){
        System.out.println("id : " + id);
        System.out.println(this.name);
        System.out.println(this.salary);
        System.out.println("Developer programming language : " + programmingLang);
    }
}
class Intern extends Employee{

    //No args constructor
    Intern(){}

    ////No args constructor
    Intern(String name, Long id, double salary){
        super(name, id,salary);

    }
 //override the method
    @Override
    void display(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.salary);
    }
}

public class EmployeeManagement {
    //Main method
    public static void main(String[] args) {

        Employee manager = new Manager("Shriyansh" , 2L, 200000,5);
        manager.display();

        Employee developer = new Developer("Himu" , 3L,3000,"Java");
        developer.display();

        Employee intern = new Intern("Gautam" ,5L,1000);
            intern.display();

    }
}
