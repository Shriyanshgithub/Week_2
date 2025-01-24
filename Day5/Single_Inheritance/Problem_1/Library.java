package Day5.Single_Inheritance.Problem_1;

// Superclass: Book
class Book {
    String title;
    int publicationYear;

    // Constructor for Book class
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass: Author that extends Book
class Author extends Book {
    String name;
    String bio;

    // Constructor for Author class
    public Author(String title, int publicationYear, String name, String bio) {
        // Call the superclass constructor (Book)
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Override displayInfo to show both book and author details
    @Override
    public void displayInfo() {
        // Call the superclass method to display book details
        super.displayInfo();
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}

// Main class to test the Book and Author classes
public class Library {
    public static void main(String[] args) {
        // Create an Author object which also contains Book details
        Author author1 = new Author("To Kill a Mockingbird", 1960, "Harper Lee", "Harper Lee was an American novelist best known for her book 'To Kill a Mockingbird.'");

        // Display the information of the book and author
        author1.displayInfo();
    }
}

