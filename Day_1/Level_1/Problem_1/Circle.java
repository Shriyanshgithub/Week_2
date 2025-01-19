package Day_1.Level_1.Problem_1;


public class Circle {
    //Initialize the radius
    private  int radius;

    //Constructor
    public Circle(int radius){
        this.radius = radius;
    }
    //Default constructor
    public Circle(){}

    //setter
  public void setRadius( int radius) {
        this.radius = radius;
    }

    //Method to calculate area
    public double CalculateArea(){
        return  3.14 * (radius*radius);
    }

    //Method to calculate Circumfrence
    public double CalculateCircumference(){
        return 2*3.14*radius;
    }
}
class Main{
    public static void main(String[] args) {
       Circle circle = new Circle();

        circle.setRadius(8);
        System.out.println(circle.CalculateArea());
        System.out.println(circle.CalculateCircumference());
    }
}