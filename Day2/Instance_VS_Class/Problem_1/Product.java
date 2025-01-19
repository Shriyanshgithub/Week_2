package Day2.Instance_VS_Class.Problem_1;

//Declare the class product
public class Product {
    //Class Variable
    static int totalProducts = 0;

    //Instance Variable
    private String productName;
    private double price;

    //Default constructor
    Product(){
        totalProducts++;
    }

    //Setter
    public void setProductName(String productName) {
        this.productName = productName;
    }


// Setter
    public void setPrice(double price) {
        this.price = price;
    }

    //Instance method
    public void displayProductDetails(){
        System.out.println("Product name : " + productName);
        System.out.println("Price of product : " + price);
    }

    //Class method
    public static void displayTotalProduct(){
        System.out.println( "Number of products : " + totalProducts);
    }
}

//Declare main class
class Main{
    //Main method the entry point
    public static void main(String[] args) {

        //Intialized the object of class
        Product product1 = new Product();
        product1.setProductName("Body Wash");
        product1.setPrice(150.0);

        product1.displayProductDetails();

        Product product2 = new Product();
        product2.setProductName("Soap");
        product2.setPrice(15.0);

        product2.displayProductDetails();
        Product.displayTotalProduct();

    }
}
