package Day5.Assisted_Problem.Problem_3;

//A vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle are subclasses with unique attributes.

//A superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
class Vehicle{
    protected int maxSpeed;
    protected String fuelType;

    //no args constructor
    Vehicle(){}

    //all args constructor
    Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    //display results
    void displayInfo(){
        System.out.println("The max speed of vehicle : " + maxSpeed );
        System.out.println("The fuel type is : " + fuelType);
    }
}

//subclass Car with additional attributes, such as seatCapacity for Car.
class Car extends Vehicle{
    protected int seatCapacity;

    //no args constructor
    Car(){}

    //all args constructor
    Car(int maxSpeed , String fuelType, int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo(){
        System.out.println("The maxSpeed of car is : "  + this.maxSpeed);
        System.out.println("The fuelType of car : " + this.fuelType);
        System.out.println("The seat capacity of car is : " + seatCapacity);
        System.out.println();

    }
}
class Truck extends Vehicle{
    protected int loadingCapacity;

    //no args constructor
    Truck(){}

    //all args constructor
    Truck(int maxSpeed, String fuelType, int loadingCapacity){
        super(maxSpeed,fuelType);
        this.loadingCapacity = loadingCapacity;
    }

    @Override
    void displayInfo(){
        System.out.println("The maxSpeed of truck is : "  + this.maxSpeed);
        System.out.println("The fuelType of truck : " + this.fuelType);
        System.out.println("The loading capacity of truck is : " + loadingCapacity);
        System.out.println();
    }
}
class Motorcycle extends Vehicle{
    protected double mileage;

    //no args constructor
    Motorcycle(){}

    //all args constructor
    Motorcycle(int maxSpeed, String fuelType,double mileage){
        super(maxSpeed,fuelType);
        this.mileage=mileage;
    }

    @Override
    void displayInfo(){
        System.out.println("The maxSpeed of Motorcycle is : "  + this.maxSpeed);
        System.out.println("The fuelType of Motorcycle : " + this.fuelType);
        System.out.println("The mileage of motorcycle is : " + mileage);
        System.out.println();
    }
}
public class VehicleAndTransportSystem {
    public static void main(String[] args) {

        //initialize object 1
        Vehicle car = new Car(200 , "Diesel",7);
        car.displayInfo();

        //initialize object 2
        Vehicle truck = new Truck(150 , "Petrol" , 1000);
        truck.displayInfo();

        //initialize object 3
        Vehicle motorcycle = new Motorcycle(120,"Petrol" ,40);
        motorcycle.displayInfo();
    }
}
