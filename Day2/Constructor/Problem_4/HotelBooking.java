package Day2.Constructor.Problem_4;

public class HotelBooking {
    private String guestName;
    private String roomType;
    private int night;

    //Parameterized constructor
    HotelBooking(String guestName, String roomType, int night){
        this.guestName = guestName;
        this.roomType = roomType;
        this.night = night;
    }

    //Default constructor
    HotelBooking(){
        guestName = "Siddhart";
        roomType = "Single suit";
        night = 4;
    }

    //Copy Constructor
    HotelBooking(HotelBooking previousBooking){
        this.guestName = previousBooking.guestName;
        this.roomType = previousBooking.roomType;
        this.night = previousBooking.night;
    }

    //Display details
    public void displayBookingDetails(){
        System.out.println(" Guest Name : " + guestName);
        System.out.println("Room type : " + roomType);
        System.out.println("Night stay : " + night);
    }
}

class Main{
    public static void main(String[] args) {
        HotelBooking hotelBooking1 = new HotelBooking("Shriyansh" , "Juniour Suit" , 6);
        hotelBooking1.displayBookingDetails();

        System.out.println();

        //Copy constructor
        HotelBooking hotelBooking2 = new HotelBooking(hotelBooking1);
        hotelBooking2.displayBookingDetails();

        System.out.println();

        //Default constructor
        HotelBooking hotelBooking3 = new HotelBooking();
        hotelBooking3.displayBookingDetails();
    }
}
