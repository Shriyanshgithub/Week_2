package Day2.Constructor.Problem_5;

import java.sql.SQLOutput;

//import scanner class
import java.util.Scanner;

public class Library {
    //attributes
    private String[] title;
    private String author;
    private int price;

    //constructor
    Library(String[] title , String author , int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //method to display to the result
    public void displayBookDetails(){
        for(String book: title) {
            System.out.println(" - " + book);
        }
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }

    public boolean checkAvailability(String book){
        for(String checkBook  : title){
            if(checkBook.equalsIgnoreCase(book)){
                return true;
            }
        }
        return false;
    }
}
class Main{
    public static void main(String[] args) {

        //Scanner class
        Scanner sc = new Scanner(System.in);
        //Take input from user
        String str = sc.next();

        //book present in library
        String[] title = {"alchemist" , "The Pursuit of Happiness", "Ikagai"};
        Library book1 = new Library(title , "Christ Gardner" , 10000);
        book1.displayBookDetails();

        //check availability of book
        if(book1.checkAvailability(str)){
            System.out.println(" The book " + str + " is available");
        }
        else{
            System.out.println(" The book " + str + " is not available");
        }
    }
}
