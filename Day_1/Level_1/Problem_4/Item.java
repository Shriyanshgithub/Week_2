import java.util.Scanner;

public class Item {
    String itemName; 
    int itemCode ; 
    double price ;
     
    Item(String itemName , int itemCode  ,double price )
    {
        this.itemName = itemName;
        this.itemCode =itemCode;
        this.price=price;
    }

    public void display(int quantity )
    {
        double cost = getCost(quantity);

        System.out.println("Total cost of "+quantity+" "+itemName+ " at Price of "+price+" is : "+cost );
    }

    public double getCost(int quantity )
    {
        double cost = quantity*price;
        return cost;

        
    }



}
class ItemMain
{
    public static void main(String ar[])
    {
    
    Scanner input = new Scanner(System.in);
 
    System.out.println("Enter Item Name ");
    String itemName = input.next();
    System.out.println("Enter Item Code ");
    int itemCode = input.nextInt();
    System.out.println("Enter Item Price");
    double price = input.nextDouble();
    System.out.println("Enter Item Quantity ");
    int quantity = input.nextInt();

    Item item =new Item(itemName, itemCode, price);
    item.display(quantity);

    }


}
