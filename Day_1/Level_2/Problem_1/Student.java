
import java.util.Scanner;

class Student
{
    String name, rollNumber; 
    int marks;

    Student(String name,String rollNumber, int marks)
    {
        this.name= name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public char getGrade(int marks)
    {
        if(marks>80)
        {
            return 'A';
        }
        else if(marks>60)
        {
            return 'B';
        }
        else if(marks>40)
        {
            return 'C';
        }
        else{
            return 'F';
        }
    }

    public  void display(char grade)
    {
        System.out.println("Student Name: \n"+name+"\nRoll Number :"+rollNumber+"\nMarks: "+marks+"\nGrade: "+grade);
    }

}
class StudentMain
{   
        public static void main(String ar[])
        {
            Scanner input = new Scanner (System.in);
            System.out.println("Enter Student Name ");
            String name =input.next();
            System.out.println("Enter Student Roll Number ");
            String rollNumber =input.next();
            System.out.println("Enter Student Marks ");
            int marks =input.nextInt();

            Student student = new Student(name,rollNumber,marks);

            char grade = student.getGrade(marks);
            student.display(grade);

        }

}