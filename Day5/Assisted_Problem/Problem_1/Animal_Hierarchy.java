package Day5.Assisted_Problem.Problem_1;

//A superclass Animal with attributes name and age, and a method makeSound().
class Animal{
    String name;
    int age;

    //all args constructor
    Animal(String name, int age){
        this.name=name;
        this.age=age;
    }

    //no args constructor
    Animal(){

    }

    //a unique implementation of makeSound()
    void makeSound(){
        System.out.println("Animal make sound");
    }
}


//subclass
class Dog extends Animal{

    //a unique implementation of makeSound()
    @Override
    void makeSound(){
        System.out.println("Dog bark");
    }
     Dog(){

     }
    Dog(String name, int age){
        super(name,age);

    }
}


//subclass
class Cat extends Animal{

    Cat(){

    }

    Cat(String name, int age){
        super(name,age);
    }

    //a unique implementation of makeSound()
    @Override
    void makeSound(){
        System.out.println("Cat make sound meow");
    }
}


public class Animal_Hierarchy {
    public static void main(String[] args) {

        //obj1
        Animal dog= new Dog("Labera dor",4);
        dog.makeSound();

        //obj2
        Animal cat = new Cat("Himanshi",6);
        cat.makeSound();

    }
}
