package Day2.Constructor.Problem_3;

public class Person {
    private String name;
    private int age;
    private String address;

    //Parameter constructor
    Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //default constructor
    Person(){
        name = "Shriyansh";
        age = 21;
        address = "XYZ Bhopal";
    }
    //Copy constructor
    Person(Person previousPerson){
        this.name = previousPerson.name;
        this.age = previousPerson.age;
        this.address = previousPerson.address;
    }

    public void displayPersonDetails(){
        System.out.println("Name of person : " + name);
        System.out.println("Age of person :" + age);
        System.out.println("Address : " + address);
    }
}

class Main{
    public static void main(String[] args) {
        //Parameterized Constructor
        Person person1 = new Person("Siddharth" , 21, "Infront of XYZ ,Bhopal");
        person1.displayPersonDetails();

        //Copy Constructor
        Person person2 = new Person(person1);
        person2.displayPersonDetails();

        //Default Constructor
        Person person3 = new Person();
        person3.displayPersonDetails();

    }
}
