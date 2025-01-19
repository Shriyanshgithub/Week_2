import java.util.Scanner;

public class Book {
    
    String title, author;
    double price; 

    Book(String title , String author  ,double price )
    {
        this.title = title;
        this.author =author;
        this.price=price;
    }

    public void display()
    {
        System.out.println("Book Name: "+title+ "\nAuthor: "+author+"\nxPrice:"+price);
    }
}

class BookMain
{
    public static void main(String ar[])
    {
     Scanner input = new Scanner(System.in);
 
     System.out.println("Enter Book Title");
     String title = input.next();
     System.out.println("Enter Author Name ");
    String author = input.next(); 
    System.out.println("Enter Book Price");
     double price = input.nextDouble();

     Book book = new Book(title, author, price);

     book.display();
    }


}
