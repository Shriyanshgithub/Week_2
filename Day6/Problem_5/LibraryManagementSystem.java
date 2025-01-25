package Day6.Problem_5;

// Abstract class representing a library item
abstract class LibraryItem {
    private String itemId; // Unique ID for the library item
    private String title;  // Title of the library item
    private String author; // Author or creator of the library item

    // Constructor to initialize the library item details
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method to get the loan duration (to be implemented by subclasses)
    public abstract int getLoanDuration();

    // Method to retrieve item details
    public String getItemDetails() {
        return "Item ID: " + itemId + "\nTitle: " + title + "\nAuthor: " + author;
    }

    // Getter and setter methods for encapsulation
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

// Interface to handle reservation functionality
interface Reservable {
    void reserveItem(String borrowerName); // Method to reserve an item
    boolean checkAvailability();          // Method to check availability
}

// Subclass representing a book
class Book extends LibraryItem implements Reservable {
    private boolean isReserved; // Tracks reservation status

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 21; // Books can be loaned for 21 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            isReserved = true;
            System.out.println("The book \"" + getTitle() + "\" is reserved by " + borrowerName);
        } else {
            System.out.println("The book \"" + getTitle() + "\" is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

// Subclass representing a magazine
class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved; // Tracks reservation status

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 7; // Magazines can be loaned for 7 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            isReserved = true;
            System.out.println("The magazine \"" + getTitle() + "\" is reserved by " + borrowerName);
        } else {
            System.out.println("The magazine \"" + getTitle() + "\" is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

// Subclass representing a DVD
class DVD extends LibraryItem implements Reservable {
    private boolean isReserved; // Tracks reservation status

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 14; // DVDs can be loaned for 14 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            isReserved = true;
            System.out.println("The DVD \"" + getTitle() + "\" is reserved by " + borrowerName);
        } else {
            System.out.println("The DVD \"" + getTitle() + "\" is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

// Main class to demonstrate the Library Management System
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create instances of different library items
        LibraryItem book = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem magazine = new Magazine("M001", "National Geographic", "Various");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        // Store all items in an array for polymorphic management
        LibraryItem[] libraryItems = {book, magazine, dvd};

        // Iterate through the library items and perform operations
        for (LibraryItem item : libraryItems) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;

                // Check availability and reserve the item
                if (reservableItem.checkAvailability()) {
                    reservableItem.reserveItem("John Doe");
                } else {
                    System.out.println("The item is not available for reservation.");
                }
            }
            System.out.println();
        }
    }
}

