package Day2.Constructor.Problem_1;

public class Book {
    private String title;
    private String author;
    private double price;

    Book(String title , String author ,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    Book(){
        title = "Physics";
        author = "D.C Pandey";
        price = 10000.00;

    }

    public void displayBookDetails(){
        System.out.println("title : " + title);
        System.out.println("author : " + author);
        System.out.println("price : " + price);
    }

}

class Main{
    public static void main(String[] args) {
        Book book1 = new Book("Math" ,"A.Das Gupta" , 250.0);
        System.out.println("Book1");
        book1.displayBookDetails();

        Book book2 = new Book();
        System.out.println("Book2");
        book2.displayBookDetails();
    }

}
