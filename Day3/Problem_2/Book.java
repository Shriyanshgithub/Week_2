package Day3.Problem_2;

//Library Management System
public class Book{

    //A static variable bankName shared across all books.
    private static String libraryName = "Kiran Library";


    //Book Title
    private final String title;

    //Book author
    private final String author;

    //Unique identifier
    private final String isbn;


    //All args constructor
    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    //A static method  to display the Library name.
    public static String displayLibraryName(){
        return Book.libraryName;
    }


    @Override
    public String toString(){
        return "Title: " + this.title + ", Author: " + this.author + " in " +
                Book.libraryName;
    }
}

//Class Main
class Main{
    //main method
    public static void main(String... args){

        Book book = new Book("A song of ice and fire", "George RR. Martin", "798ffabb44");
        //Check if an book object is an instance of the Book class before displaying its details.
        if(book instanceof Book){
            System.out.println(book);
        }
    }
}