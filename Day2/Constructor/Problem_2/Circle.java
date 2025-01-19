package Day2.Constructor.Problem_2;

public class Circle {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    Circle() {
        radius = 5.3;
    }

    public void areaCalculate() {
        System.out.println("Area of circle is : " + Math.PI * radius);
    }

    public void displayRadius() {
        System.out.println("radius :" + radius);
        areaCalculate();
    }
}

    class Main{
        public static void main(String[] args) {
            Circle c1 = new Circle(4.2);
            System.out.println("Area 1 : ");
            c1.displayRadius();

            Circle c2 = new Circle();
            System.out.println("Area 2");
            c2.displayRadius();
        }
    }

