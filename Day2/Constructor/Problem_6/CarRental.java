package Day2.Constructor.Problem_6;

import java.util.Scanner;

public class CarRental {
    //Declare the attributes
    private String customer_name;
    private String carModel;
    private int rentalDays;

     //Constructor
    CarRental(String customer_name, String carModel , int rentalDays){
        this.customer_name = customer_name;
        this.carModel = carModel;
        this.rentalDays = rentalDays;

    }

    //Method to find the total cost
    public void totalCost(String[][] carModels , String nameOfCar , int numberOfDays){
        int totalCostOfCar =0;
        for(int i = 0 ;  i< carModels.length; i++){
            if(carModels[i][0].equals(nameOfCar) ){
                 totalCostOfCar = Integer.parseInt(carModels[i][1]) * numberOfDays;
                System.out.println("Total cost of the car is : " + totalCostOfCar);
            }
        }

    }

    //Dispplay customer details
    public void displayDetails(){
        System.out.println("Customer name : " + customer_name);
        System.out.println("The car model to rent : " + carModel);
        System.out.println(" How many number of days you have to rent : " + rentalDays);

    }

}

//main class
class Main {
    //Main function entry point of the program
    public static void main(String[] args) {

        //Scanner class
        Scanner sc = new Scanner(System.in);

        //Take input from the user
        System.out.println("Enter the customer name");
        String name = sc.nextLine().trim();

        System.out.println("Enter the number of days to have to rent the car");
        int days = sc.nextInt();

        System.out.println("Enter the car model");
        String carModel = sc.next();

        //Declare the 2D array to define the car and their rent per day
        String[][] cars = {
                {"Honda" ,"200"},
                {"TATA" , "300"},
                {"Hyundai" , "350"},
                {"Toyota", "500"}
        };

        //initalize the class object
        CarRental carRental = new CarRental(name , carModel,days);

        //method calling
         carRental.totalCost(cars , carModel , days);
         carRental.displayDetails();

    }
}


