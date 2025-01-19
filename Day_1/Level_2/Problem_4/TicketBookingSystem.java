//import scanner class
import java.util.Scanner;

class MovieTicket {
    //Attribute
    private String movieName;
    private int seatNumber;
    private double price;

    // Construcor to initialze object
    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    //method to display ticket details
    public void displayDetails() {
        System.out.println("Movie Name- " + movieName + 
        "\nSeat Number- " + seatNumber+
        "\nPrice - " + price);
    }
}

class TicketBookingSystem {
    //main method
    public static void main(String[] args) {
       // create object of scanner class
       Scanner input = new Scanner(System.in);
        int currentSeat = 1;

        System.out.print("Enter the movie name ");
        String movieName = input.nextLine();

        System.out.print("Enter the ticket price ");
        double price = input.nextDouble();

        // /create object of movie ticket class
        MovieTicket ticket = new MovieTicket(movieName, currentSeat, price);
        //increase seat number
        currentSeat++;

        //display result
        ticket.displayDetails();

        input.close();
    }
}
