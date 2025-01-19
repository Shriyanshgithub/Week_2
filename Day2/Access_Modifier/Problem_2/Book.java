package Day2.Access_Modifier.Problem_2;

// Base class: Book
class Book {
    // Instance variables
    public String ISBN;    // Public variable
    protected String title; // Protected variable
    private String author;  // Private variable

    // Constructor to initialize ISBN, title, and author
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public setter and getter methods for the 'author' variable
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass: EBook (Inheriting from Book)
class EBook extends Book {
    // Constructor
    public EBook(String ISBN, String title, String author) {
        // Calling the superclass constructor
        super(ISBN, title, author);
    }

    // Method to display EBook details (Demonstrating access to ISBN and title)
    public void displayEBookDetails() {
        // Accessing public 'ISBN' and protected 'title' from the parent class
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN); // Accessing public variable 'ISBN'
        System.out.println("Title: " + title); // Accessing protected variable 'title'
        System.out.println("Author: " + getAuthor()); // Accessing private 'author' via getter method
    }
}

 class Main {
    public static void main(String[] args) {
        // Creating an object of EBook
        EBook ebook = new EBook("123-456-789", "Java Programming", "John Doe");

        // Displaying EBook details
        ebook.displayEBookDetails();

        // Modifying author name using the setter method
        ebook.setAuthor("Jane Smith");

        // Displaying updated details
        System.out.println("\nUpdated EBook Details:");
        ebook.displayEBookDetails();
    }
}

